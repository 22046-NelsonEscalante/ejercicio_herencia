package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class Driver_program {
    public ArrayList<Objetos> inventario;
    public ArrayList<Cliente> clientes;
    public Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);



        in.close();
    }

    public static void addObj(Scanner in){
        System.out.println("Ingrese el número del tipo de objeto que quiere ingresar.");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. Artículo");
        
        String option = in.nextLine();

        switch (option){
            case "1":
            Libro book;
            System.out.println("Ingrese el id.");
            int id = in.nextInt();
            
            System.out.println("Ingrese el titulo.");
            String title = in.nextLine();

            System.out.println("Ingrese la materia.");
            String matter = in.nextLine();

            System.out.println("Ingrese la cantidad.");
            int quantity = in.nextInt();

            System.out.println("Ingrese el estado.");
            String state = in.nextLine();

            System.out.println("Ingrese el autor.");
            String author = in.nextLine();

            System.out.println("Ingrese la editorial.");
            String editorial = in.nextLine();

            book = new Libro();
            book.setId(id);
            book.setTitulo(title);
            book.setMateria(matter);
            book.setCantidad(quantity);
            book.setEstado(state);
            book.setAutor(author);
            book.setEditorial(editorial);

            break;
        }
    }
}
