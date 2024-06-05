package Figuras;

public class cuadrilatero extends Regulares {
    public cuadrilatero() {}

    public cuadrilatero(int numero_lados, String nombre, double lado) {
        super(numero_lados, nombre, 0, 0, lado, 4.0, 4.0);
    }

    @Override
    public Double calcularPerimetro() {
        return 4 * getLado();
    }

    @Override
    public Double calcularArea() {
        return Math.pow(getLado(), 2);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Numero Lados: " + getNumero_lados());
        System.out.println("Lado: " + getLado());
        System.out.println("El área es: " + calcularArea());
        System.out.println("El perímetro es: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        cuadrilatero cuadrado = new cuadrilatero(4, "Cuadrado", 5);
        cuadrado.mostrarDatos();
    }
}
