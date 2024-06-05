package Figuras;

public class figura_piramide extends Figuras_3D {
    @Override
    public void calcularPerimetro() {
        double perimetroBase = getNumero_lados() * getArista();
        System.out.println("El perímetro de la base de la pirámide es: " + perimetroBase);
    }

    @Override
    public void calcularArea() {
        double areaBase = (getNumero_lados() * Math.pow(getArista(), 2)) / (4 * Math.tan(Math.PI / getNumero_lados()));
        double areaLateral = (getNumero_lados() * getArista() * Math.sqrt(Math.pow(getArista() / (2 * Math.tan(Math.PI / getNumero_lados())), 2) + Math.pow(getArista(), 2))) / 2;
        double areaTotal = areaBase + areaLateral;
        System.out.println("El área de la pirámide es: " + areaTotal);
    }

    @Override
    public void calcularVolumen() {
        double areaBase = (getNumero_lados() * Math.pow(getArista(), 2)) / (4 * Math.tan(Math.PI / getNumero_lados()));
        double volumen = (areaBase * getAltura()) / 3;
        System.out.println("El volumen de la pirámide es: " + volumen);
    }
}
