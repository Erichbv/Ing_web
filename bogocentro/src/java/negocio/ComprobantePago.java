
package negocio;

public class ComprobantePago {
    private NotaPedido notpedi;
    private double total;
    private String NumComprobante, fecha;
    private Usuario Usuario;

    public NotaPedido getNotpedi() {
        return notpedi;
    }

    public void setNotpedi(NotaPedido notpedi) {
        this.notpedi = notpedi;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNumComprobante() {
        return NumComprobante;
    }

    public void setNumComprobante(String NumComprobante) {
        this.NumComprobante = NumComprobante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }
    
}
