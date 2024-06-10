package Figuras;

public class dosD extends Figurasgeometricas {
    Double area;
    Double perimetro;
    Double lado;

    public dosD() {
    }

    public dosD(int numero_lados, String nombre, Double area, Double perimetro, Double lado) {
        super(numero_lados, nombre);
        this.area = area;
        this.perimetro = perimetro;
        this.lado = lado;

    }

    // Getters y setters
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getLado() {
        return this.lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    // Métodos personalizados
    public Double calcularPerimetro() {
        return lado * numero_lados;
    }

    public Double calcularArea() {
        return area;
    }
}
