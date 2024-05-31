package Figuras;

public class Figurasgeometricas
{
    int numero_lados;
    String nombre;

    public Figurasgeometricas() {}

    public Figurasgeometricas(int numero_lados, String nombre) {
        this.numero_lados = numero_lados;
        this.nombre = nombre;
    }

    public int getNumero_lados() {
        return numero_lados;
    }

    public void setNumero_lados(int numero_lados) {
        this.numero_lados = numero_lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar_datos()
    {
        System.out.println("Numero Lados: " + numero_lados);
        System.out.println("Nombre: " + nombre);
    }
}
