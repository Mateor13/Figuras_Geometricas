package Figuras;
import java.util.Scanner;

public class Irregulares extends dosD{
    private double[] x;
    private double[] y;
    private int n;

    // Constructor
    public Irregulares() {}

    public Irregulares(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Las coordenadas x e y deben tener la misma longitud");
        }
        this.x = x;
        this.y = y;
        this.n = x.length;
    }

    public void ingresarDatos() {
        System.out.println("*** FIGURA IRREGULARES ***");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la figura: ");
        this.setNombre(scanner.nextLine());

        System.out.print("Ingrese el número de vértices del polígono: ");
        this.n = scanner.nextInt();

        this.x = new double[this.n];
        this.y = new double[this.n];

        for (int i = 0; i < this.n; i++) {
            System.out.print("Ingrese la coordenada x del vértice " + (i + 1) + ": ");
            this.x[i] = scanner.nextDouble();
            System.out.print("Ingrese la coordenada y del vértice " + (i + 1) + ": ");
            this.y[i] = scanner.nextDouble();
        }
    }
    @Override
    public Double calcularPerimetro() {
        double perimetro = 0.0;
        for (int i = 0; i < n; i++) {
            int siguiente = (i + 1) % n;
            perimetro += Math.sqrt(Math.pow(x[siguiente] - x[i], 2) + Math.pow(y[siguiente] - y[i], 2));
        }
        return perimetro;
    }
    @Override
    public Double calcularArea() {
        double area = 0.0;
        for (int i = 0; i < n; i++) {
            int siguiente = (i + 1) % n;
            area += x[i] * y[siguiente] - y[i] * x[siguiente];
        }
        area = Math.abs(area) / 2.0;
        return area;
    }
    @Override
    public void mostrar_datos () {
        System.out.println("El perímetro de la figura irregular es: " + calcularPerimetro());
        System.out.println("El área de la figura irregular es: " + calcularArea());
    }
}

