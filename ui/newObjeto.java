package ui;

import java.util.Scanner;
import model.*;

public class newObjeto {
    
    /**
     * 
     * @param in Scanner for user input
     * @return an object from the class Libro
     */
    public static Libro enterLibro(Scanner in) {
        Libro libro;

        System.out.println("Ingrese el id.");
        int id = in.nextInt();
        
        System.out.println("Ingrese el titulo.");
        String titulo = in.nextLine();
        
        System.out.println("Ingrese la materia.");
        String materia = in.nextLine();
        
        System.out.println("Ingrese la cantidad.");
        int cantidad = in.nextInt();
        
        System.out.println("Ingrese el estado.");
        String estado = in.nextLine();

        System.out.println("Ingrese el autor.");
        String autor = in.nextLine();

        System.out.println("Ingrese la editorial.");
        String editorial = in.nextLine();

        libro = new Libro(id, titulo, materia, cantidad, estado, editorial, autor);
        return libro;
    }

    /**
     * 
     * @param in Scanner for user input
     * @return an object from the Revista class
     */
    public static Revista enterRevista(Scanner in) {
        Revista revista;

        System.out.println("Ingrese el id.");
        int id = in.nextInt();
        
        System.out.println("Ingrese el titulo.");
        String titulo = in.nextLine();
        
        System.out.println("Ingrese la materia.");
        String materia = in.nextLine();
        
        System.out.println("Ingrese la cantidad.");
        int cantidad = in.nextInt();
        
        System.out.println("Ingrese el estado.");
        String estado = in.nextLine();

        System.out.println("Ingrese el año de publicación.");
        int anio = in.nextInt();

        System.out.println("Ingrese el número de la revista.");
        int numero = in.nextInt();

        revista = new Revista(id, titulo, materia, cantidad, estado, anio, numero);
        return revista;
    }

    /**
     * 
     * @param in Scanner for user input
     * @return an object from the class Articulo
     */
    public static Articulo enterArticulo(Scanner in) {
        Articulo articulo;

        System.out.println("Ingrese el id.");
        int id = in.nextInt();
        
        System.out.println("Ingrese el titulo.");
        String titulo = in.nextLine();
        
        System.out.println("Ingrese la materia.");
        String materia = in.nextLine();
        
        System.out.println("Ingrese la cantidad.");
        int cantidad = in.nextInt();
        
        System.out.println("Ingrese el estado.");
        String estado = in.nextLine();

        System.out.println("Ingrese el autor.");
        String autor = in.nextLine();

        System.out.println("Ingrese el árbitro.");
        String arbitro = in.nextLine();

        articulo = new Articulo(id, titulo, materia, cantidad, estado, arbitro, autor);
        return articulo;
    }
}
