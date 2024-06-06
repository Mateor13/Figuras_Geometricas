package Figuras;

public class Triangulo extends Regulares{
    Double altura;
    Double base;
    Double lado2, lado3;
    //Constructores
    public Triangulo() {
    }

    public Triangulo(int numero_lados, String nombre, double area, double perimetro, double lado, Double aristas, Double vertices, Double altura, Double base, Double lado2, Double lado3) {
        super(numero_lados, nombre, area, perimetro, lado, aristas, vertices);
        this.altura = altura;
        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public Double calcularPerimetro() {
        return getLado2()+ getLado3() + getLado();
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
