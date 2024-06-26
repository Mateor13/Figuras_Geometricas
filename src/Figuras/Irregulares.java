package Figuras;
import java.util.Scanner;

public class Irregulares extends dosD{
    private Double[] x;
    private Double[] y;
    private int n;

    // Constructor
    public Irregulares() {}

    public Irregulares(Double[] x, Double[] y) {
        this.x = x;
        this.y = y;
        this.n = x.length;
    }
    //Getters y setters


    public Double[] getX() {
        return x;
    }

    public void setX(Double[] x) {
        this.x = x;
    }

    public Double[] getY() {
        return y;
    }

    public void setY(Double[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    //Metodos personalizados
    public void ingresarDatos() {
        System.out.println("*** FIGURA IRREGULARES ***");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la figura: ");
        this.setNombre(scanner.nextLine());

        System.out.print("Ingrese el número de vértices del polígono: ");
        n = scanner.nextInt();

        x = new Double[n];
        y = new Double[n];

        for (int i = 0; i < this.n; i++) {
            System.out.print("Ingrese la coordenada x del vértice " + (i + 1) + ": ");
            x[i] = scanner.nextDouble();
            System.out.print("Ingrese la coordenada y del vértice " + (i + 1) + ": ");
            y[i] = scanner.nextDouble();
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
        String redondeo = String.format("%.2f", calcularPerimetro());
        System.out.println("El perímetro de la figura irregular es: " + redondeo);
        System.out.println("El área de la figura irregular es: " + calcularArea());
    }
}

