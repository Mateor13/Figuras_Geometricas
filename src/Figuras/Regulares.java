package Figuras;

public class Regulares extends dosD {
    Double aristas;
    Double vertices;

    public Regulares() {}

    public Regulares(int numero_lados, String nombre, double area, double perimetro, double lado, Double aristas, Double vertices) {
        super(numero_lados, nombre, area, perimetro, lado);
        this.aristas = aristas;
        this.vertices = vertices;
    }

    // Getters y setters
    public Double getAristas() {
        return aristas;
    }

    public void setAristas(Double aristas) {
        this.aristas = aristas;
    }

    public Double getVertices() {
        return vertices;
    }

    public void setVertices(Double vertices) {
        this.vertices = vertices;
    }

    // Sobrescribiendo el método calcularArea
    @Override
    public Double calcularArea() {
        double angulo = Math.PI / numero_lados;
        return (numero_lados * Math.pow(lado, 2)) / (4 * Math.tan(angulo));
    }
}


