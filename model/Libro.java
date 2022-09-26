package model;

public class Libro extends Objetos {
    private String editorial;
    private String autor;


    public Libro(int id, String titulo, String materia, int cantidad, String estado, String editorial, String autor){
        super(id, titulo, materia, cantidad, estado);
        setEditorial(editorial);
        setAutor(autor);
    }

    
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
