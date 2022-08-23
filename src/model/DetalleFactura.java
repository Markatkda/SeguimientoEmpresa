package model;

public class DetalleFactura {

    private int cantProdVendidos;
    private double subtotal;

    public DetalleFactura(int cantProdVendidos, double subtotal) {
        this.cantProdVendidos = cantProdVendidos;
        this.subtotal = subtotal;
    }

    public int getCantProdVendidos() {
        return cantProdVendidos;
    }

    public void setCantProdVendidos(int cantProdVendidos) {
        this.cantProdVendidos = cantProdVendidos;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
