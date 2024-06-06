package Figuras;

public class Circulo extends Regulares {
    Double radio;
    //Constructor
    public Circulo() {
    }

    public Circulo(int numero_lados, String nombre, double area, double perimetro, double lado, Double aristas, Double vertices, Double radio) {
        super(numero_lados, nombre, area, perimetro, lado, aristas, vertices);
        this.radio = radio;
    }
    //Getter y setter
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    //Metodos

    @Override
    public Double calcularPerimetro() {
        return 2 * Math.PI * getRadio();
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }
    public void mostrarDatos() {
        System.out.println("El área es: " + calcularArea());
        System.out.println("El perímetro es: " + calcularPerimetro());
    }

}
