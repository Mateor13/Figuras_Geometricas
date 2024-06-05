package Figuras;
import java.util.Scanner;

public class Figuras_3D extends Figurasgeometricas
{
    int numero_caras;
    double arista;
    int numero_vertices;
    double altura;

    public Figuras_3D() {}

    public Figuras_3D(int numero_lados, String nombre, int numero_caras, double arista, int numero_vertices, double altura)
    {
        super(numero_lados, nombre);
        this.numero_caras = numero_caras;
        this.arista = arista;
        this.numero_vertices = numero_vertices;
        this.altura = altura;
    }

    public int getNumero_caras() {
        return numero_caras;
    }

    public void setNumero_caras(int numero_caras) {
        this.numero_caras = numero_caras;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public int getNumero_vertices() {
        return numero_vertices;
    }

    public void setNumero_vertices(int numero_vertices) {
        this.numero_vertices = numero_vertices;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos personalizados
    public void pedirDatos()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura geométrica 3D: ");
        setNombre(entrada.nextLine());
        System.out.println("Ingrese el lado o la longitud de la arista de la figura geométrica 3D: ");
        setArista(entrada.nextDouble());
        System.out.println("Ingrese el número de caras de la figura geométrica 3D: ");
        setNumero_caras(entrada.nextInt());
        System.out.println("Ingrese el número de lados de la figura geométrica 3D: ");
        setNumero_vertices(entrada.nextInt());
        System.out.println("Ingrese el número de vertices de la figura geométrica 3D: ");
        setNumero_vertices(entrada.nextInt());
        System.out.println("Ingrese la altura de la figura geométrica");
        setAltura(entrada.nextDouble());
    }

    public void mostrarDatos()
    {
        System.out.println("El número de lados o caras es: " + numero_caras);
        System.out.println("El número de arista es: " + arista);
        System.out.println("El numero de vertices es: " + numero_vertices);
        System.out.println("El altura es: " + altura);
    }

    public void calcularPerimetro(){}
    public void calcularArea(){}
    public void calcularVolumen(){}

}
