package Figuras;

public class figura_cilindro extends Figuras_3D {
    @Override
    public void calcularPerimetro() {
        double perimetroBase = 2 * Math.PI * getArista();
        System.out.println("El perímetro de la base del cilindro es: " + perimetroBase);
    }

    @Override
    public void calcularArea() {
        double areaBase = Math.PI * Math.pow(getArista(), 2);
        double areaLateral = 2 * Math.PI * getArista() * getAltura();
        double areaTotal = (2 * areaBase) + areaLateral;
        System.out.println("El área del cilindro es: " + areaTotal);
    }

    @Override
    public void calcularVolumen() {
        double volumen = Math.PI * Math.pow(getArista(), 2) * getAltura();
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
