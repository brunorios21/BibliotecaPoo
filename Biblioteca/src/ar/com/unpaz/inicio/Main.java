package ar.com.unpaz.inicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.Libro;
import ar.com.unpaz.repositorio.LecturaArchivo;
import ar.com.unpaz.service.GestionLibro;
import ar.com.unpaz.service.imp.GestionLibroImp;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leer archivo
        LecturaArchivo lectura = new LecturaArchivo();
        List<Libro> libros = lectura.lectura();

        // Instanciar service
        GestionLibro gestion = new GestionLibroImp();

        int opcion;

        do {
            System.out.println("\n===== SISTEMA BIBLIOTECA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Listar libros");
            System.out.println("6. Mostrar libros prestados");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opci�n: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("C�digo: ");
                    String codigo = scanner.nextLine();

                    System.out.print("T�tulo: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("A�o: ");
                    String anio = scanner.nextLine();
                    scanner.nextLine();

                    Libro nuevo = new Libro(codigo, titulo, autor, anio, false);
                    gestion.guardarLibro(libros, nuevo);

                    System.out.println("Libro agregado correctamente");
                    break;

                case 2:
                    System.out.print("Ingrese c�digo del libro: ");
                    String codBuscar = scanner.nextLine();

                    gestion.buscarLibro(libros, codBuscar);
                    break;

                case 3:
                    System.out.print("Ingrese t�tulo del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();

                    Libro libroPrestar = new Libro();
                    libroPrestar.setTitulo(tituloPrestar);

                    gestion.prestarLibro(libros, libroPrestar, true);
                    System.out.println("Libro prestado");
                    break;

                case 4:
                    System.out.print("Ingrese t�tulo del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();

                    Libro libroDevolver = new Libro();
                    libroDevolver.setTitulo(tituloDevolver);

                    gestion.devolverLibro(libros, libroDevolver, false);
                    System.out.println("Libro devuelto");
                    break;

                case 5:
                    gestion.listarLibros(libros);
                    break;

                case 6:
                    gestion.mostrarLibrosPrestados(libros);
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opci�n inv�lida.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}
