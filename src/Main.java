import Figuras.cuadrilatero;
import Figuras.Irregulares;
import Figuras.figura_cilindro;
import Figuras.figura_prisma;
import Figuras.figura_piramide;
import Figuras.figura_esfera;
import Figuras.figura_cubo;
import Figuras.Triangulo;
import Figuras.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int accion;

        do {
            System.out.println("***** FIGURAS GEOMETRICAS *****:");
            System.out.println("¿Qué acción desea realizar?");
            System.out.println("1. Figuras 2D");
            System.out.println("2. Figuras 3D");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("**** Figuras 2D ****");
                    System.out.println("¿Qué acción desea realizar?");
                    System.out.println("1. Figuras Regulares");
                    System.out.println("2. Figuras Irregulares");
                    System.out.print("Ingrese la opción: ");
                    accion = scanner.nextInt();
                    scanner.nextLine();

                    if (accion == 1) {
                        System.out.println("*** Figuras Regulares ***");
                        System.out.println("¿Qué acción desea realizar?");
                        System.out.println("1. Crear Cuadrilátero");
                        System.out.println("2. Crear Triángulo");
                        System.out.println("3. Crear Círculo");
                        System.out.println("4. Crear Figura de N-lados");
                        System.out.print("Introduce tu opción: ");
                        int opcion2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcion2) {
                            case 1:
                                System.out.println("***** CUADRILATERO *****.");
                                cuadrilatero cuadrilatero = new cuadrilatero();
                                System.out.print("Ingrese el valor del lado del cuadrilátero: ");
                                Double lado = scanner.nextDouble();
                                cuadrilatero.setLado(lado);
                                cuadrilatero.mostrarDatos();
                                break;
                            case 2:
                                System.out.println("***** TRIANGULO *****.");
                                Triangulo triangulo = new Triangulo();
                                System.out.print("Ingrese el valor de la base del triángulo: ");
                                Double base = scanner.nextDouble();
                                triangulo.setBase(base);
                                System.out.print("Ingrese el valor de la altura del triángulo: ");
                                Double altura = scanner.nextDouble();
                                System.out.print("Ingrese el valor del primer lado: ");
                                Double primer = scanner.nextDouble();
                                System.out.print("Ingrese el valor del segundo lado: ");
                                Double segundo = scanner.nextDouble();
                                System.out.print("Ingrese el valor del tercer lado: ");
                                Double tercer = scanner.nextDouble();
                                triangulo.setAltura(altura);
                                triangulo.setLado(base);
                                triangulo.setLado(primer);
                                triangulo.setLado2(segundo);
                                triangulo.setLado3(tercer);
                                triangulo.mostrarDatos();
                                break;
                            case 3:
                                System.out.println("***** CIRCULO *****.");
                                Circulo circulo = new Circulo();
                                System.out.print("Ingrese el radio del círculo: ");
                                Double radio = scanner.nextDouble();
                                circulo.setRadio(radio);
                                circulo.mostrarDatos();
                                break;
                            case 4:
                                System.out.println("***** Figura de N-lados *****.");
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                        }
                    } else if (accion == 2) {
                        Irregulares poligono = new Irregulares();
                        poligono.ingresarDatos();
                        poligono.mostrar_datos();

                    } else {
                        System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                    }
                    break;
                case 2:
                    System.out.println("*** Figuras 3D ***");
                    System.out.println("¿Qué acción desea realizar?");
                    System.out.println("1. Crear Cilindro");
                    System.out.println("2. Crear Prisma");
                    System.out.println("3. Crear Pirámide");
                    System.out.println("4. Crear Esfera");
                    System.out.println("5. Crear Cubo");
                    System.out.print("Introduce tu opción: ");
                    int opcion3 = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion3) {
                        case 1:
                            System.out.println("***** CILINDRO *****.");
                            figura_cilindro cilindro = new figura_cilindro();
                            cilindro.pedirDatos();
                            cilindro.mostrarDatos();
                            cilindro.calcularPerimetro();
                            cilindro.calcularArea();
                            cilindro.calcularVolumen();
                            break;
                        case 2:
                            figura_prisma prisma = new figura_prisma();
                            prisma.pedirDatos();
                            prisma.mostrarDatos();
                            prisma.calcularPerimetro();
                            prisma.calcularArea();
                            prisma.calcularVolumen();
                            break;
                        case 3:
                            figura_piramide piramide = new figura_piramide();
                            piramide.pedirDatos();
                            piramide.mostrarDatos();
                            piramide.calcularPerimetro();
                            piramide.calcularArea();
                            piramide.calcularVolumen();
                            break;
                        case 4:
                            figura_esfera esfera = new figura_esfera();
                            esfera.pedirDatos();
                            esfera.mostrarDatos();
                            esfera.calcularArea();
                            esfera.calcularVolumen();
                            break;
                        case 5:
                            figura_cubo cubo = new figura_cubo();
                            cubo.pedirDatos();
                            cubo.mostrarDatos();
                            cubo.calcularPerimetro();
                            cubo.calcularArea();
                            cubo.calcularVolumen();
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.out.println("Muchas gracias");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
