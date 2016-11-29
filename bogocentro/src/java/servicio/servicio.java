
package servicio;

import negocio.*;


public interface servicio {
//nota pedido
public Usuario acceso(String nick,String password);
public NotaPedido nuevo_pedido();
public String grabarNotaPedido(String numero,String fecha,double importe, String usuario);
public String grabarDetalle_Pedido(String numero,String producto,int cantidad, double sub_total);
public String agregar(String producto);

//mantenimiento producto
public Producto nuevoProducto();
public String grabarProducto();
public Producto buscarProducto(String codigo);
public String actualizarproducto();
}
