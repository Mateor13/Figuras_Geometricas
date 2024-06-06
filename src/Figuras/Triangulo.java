package Figuras;

public class Triangulo extends Regulares{
    Double altura;
    Double base;
    //Constructores
    public Triangulo() {
    }

    public Triangulo(int numero_lados, String nombre, double area, double perimetro, double lado, Double aristas, Double vertices, Double altura, Double base) {
        super(numero_lados, nombre, area, perimetro, lado, aristas, vertices);
        this.altura = altura;
        this.base = base;
    }
    //Getters y setters
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public Double calcularPerimetro() {
        return 3 * getLado();
    }

    @Override
    public Double calcularArea() {
        return (getBase()*getAltura())/2;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El área es: " + calcularArea());
        System.out.println("El perímetro es: " + calcularPerimetro());
    }
}
