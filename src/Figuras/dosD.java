package Figuras;

public class dosD extends Figurasgeometricas{
    double area;
    double perimetro;
    double lado;
    public dosD(){}
    public dosD(int numero_lados, String nombre, double area, double perimetro, double lado){
        super(numero_lados, nombre);
        this.area = area;
        this.perimetro = perimetro;
        this.lado = lado;

    }
    // getters and setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    // metodos personalizados

    public Double Perimetro(double perimetro, int numero_lados){
        perimetro = lado * numero_lados;
        return perimetro;
    }
    public Double area(){
        return area;
    }





}
