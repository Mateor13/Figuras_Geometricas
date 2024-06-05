package Figuras;

public class figura_prisma extends Figuras_3D
{
    @Override
    public void calcularPerimetro() {
        double perimetroBase = getNumero_caras() * getArista();
        double perimetroPrisma = perimetroBase * 2;
        System.out.println("El perímetro del prisma es: " + perimetroPrisma);
    }
    @Override
    public void calcularArea() {
        double areaBase = getNumero_caras() * Math.pow(getArista(), 2);
        double perimetroBase = getNumero_caras() * getArista();
        double areaLateral = perimetroBase * getNumero_vertices();
        double areaTotal = (2 * areaBase) + areaLateral;
        System.out.println("El área del prisma es: " + areaTotal);
    }

    @Override
    public void calcularVolumen() {
        double areaBase = getNumero_caras() * Math.pow(getArista(), 2);
        double volumen = areaBase * getNumero_vertices();
        System.out.println("El volumen del prisma es: " + volumen);
    }

}
