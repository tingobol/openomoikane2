package omoikane.caja.business;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import omoikane.caja.data.IProductosDAO;
import omoikane.caja.presentation.CajaModel;
import omoikane.caja.presentation.ProductoModel;
import omoikane.producto.Articulo;
import omoikane.producto.Producto;
import omoikane.repository.ProductoRepo;
import omoikane.repository.UsuarioRepo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * Created with IntelliJ IDEA.
 * User: Octavio
 * Date: 13/09/12
 * Time: 02:01 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CajaLogic implements ICajaLogic {
    public static Logger logger = Logger.getLogger(CajaLogic.class);
    Boolean capturaBloqueada = false;


    @Autowired
    UsuarioRepo usuarioRepo;

    @Autowired
    ProductoRepo productoRepo;

    @Autowired
    IProductosDAO productosDAO;

    @Override
    /**
     * Pseudo evento gatillado cuando se intenta capturar un producto en la "línea de captura".
     * Ignora cualquier intento de captura si ya existe una en curso
     */
    public synchronized void onCaptura(CajaModel model) {
        if(!capturaBloqueada) {
            capturaBloqueada = true;
            try {
                LineaDeCaptura captura = new LineaDeCaptura(model.getCaptura().get());
                model.getCaptura().set("");

                addProducto(model, captura);

            } catch (Exception e) {
                logger.error("Error durante captura ('evento onCaptura')", e);
            }
            capturaBloqueada = false;
        }
    }

    private void addProducto(CajaModel model, LineaDeCaptura captura) {
        Producto producto = productosDAO.findByCodigo(captura.getCodigo()).get(0);
        /*Articulo producto = productoRepo.findByCodigo(captura.getCodigo()).get(0);*/

        ProductoModel productoModel = new ProductoModel();
        productoModel.setPrecioBase(new SimpleObjectProperty<BigDecimal>(producto.getPrecio().getPrecioBase()));
        productoModel.setConcepto(new SimpleStringProperty(producto.getDescripcion()));
        productoModel.setCantidad(new SimpleObjectProperty<BigDecimal>(captura.getCantidad()));
        productoModel.setPrecio(new SimpleObjectProperty<BigDecimal>(producto.getPrecio().getPrecio()));
        productoModel.setDescuentos(new SimpleObjectProperty<BigDecimal>(producto.getPrecio().getDescuento()));
        productoModel.setImpuestos(new SimpleObjectProperty<BigDecimal>(producto.getPrecio().getImpuestos()));

        model.getProductos().add(productoModel);
    }


    @Override
    public void calcularCambio(CajaModel model )
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void terminarVenta(CajaModel model) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onProductListChanged(CajaModel model) {
        BigDecimal subtotal = new BigDecimal(0);
        subtotal.setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal descuentos = new BigDecimal(0);
        descuentos.setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal impuestos = new BigDecimal(0);
        impuestos.setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal total = new BigDecimal(0);
        total.setScale(2, BigDecimal.ROUND_HALF_UP);

        for ( ProductoModel producto : model.getProductos() ) {
            subtotal   = subtotal  .add( producto.getSubtotal() );
            descuentos = descuentos.add( producto.getDescuentos().get() );
            impuestos  = impuestos .add( producto.getImpuestos().get() );
        }

        total = total.add( subtotal );
        total = total.subtract( descuentos );
        total = total.add( impuestos );

        model.getSubtotal().set( subtotal );
        model.getDescuento().set( descuentos );
        model.getImpuestos().set( impuestos );
        model.getTotal().set( total );
    }
}
