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



    /**
     * 
     * @param in Scanner for user input
     */
    public void addObjToInv(Scanner in){
        System.out.println("Ingrese el número del tipo de objeto que quiere ingresar.");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. Artículo");
        
        String option = in.nextLine();
        
        switch (option){
            case "1":
                Libro libro = newObjeto.enterLibro(in);
                inventario.add(libro);
                break;

            case "2":
                Revista revista = newObjeto.enterRevista(in);
                inventario.add(revista);
                break;

            case "3":
                Articulo articulo = newObjeto.enterArticulo(in);
                inventario.add(articulo);
                break;
        }
    }

}
