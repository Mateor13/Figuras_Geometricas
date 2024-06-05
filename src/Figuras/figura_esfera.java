package Figuras;

public class figura_esfera extends Figuras_3D {
    @Override
    public void calcularPerimetro() {
        System.out.println("No se puede calcular el perímetro de una esfera.");
    }

    @Override
    public void calcularArea() {
        double area = 4 * Math.PI * Math.pow(getArista(), 2);
        System.out.println("El área de la esfera es: " + area);
    }

    @Override
    public void calcularVolumen() {
        double volumen = (4.0/3.0) * Math.PI * Math.pow(getArista(), 3);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
