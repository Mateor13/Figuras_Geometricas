package Figuras;

public class Irregulares extends dosD {
    private final Double[] x;
    private final Double[] y;
    private final int n;

    public Irregulares(Double[] x, Double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Las coordenadas x e y deben tener la misma longitud");
        }
        this.x = x;
        this.y = y;
        this.n = x.length;
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

