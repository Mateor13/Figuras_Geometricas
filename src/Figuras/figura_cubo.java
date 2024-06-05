package Figuras;

public class figura_cubo extends Figuras_3D
{
    @Override
    public void calcularPerimetro()
    {
        double perimetro_cubo;
        perimetro_cubo = 12 * getArista();
        System.out.println("Perimetro del cubo: " + perimetro_cubo);
    }

    @Override
    public void calcularArea()
    {
        double area_cubo;
        area_cubo = 6 * (Math.pow(getArista(),2));
        System.out.println("Área del cubo: " + area_cubo);
    }

    @Override
    public void calcularVolumen()
    {
        double volumen_cubo;
        volumen_cubo = Math.pow(getArista(),3);
        System.out.println("Volumen de cubo: " + volumen_cubo);
    }

}
