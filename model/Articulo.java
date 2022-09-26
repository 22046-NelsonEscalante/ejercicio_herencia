package model;

public class Articulo extends Objetos {
    private String arbitro;
    private String autor;


    public Articulo(int id, String titulo, String materia, int cantidad, String estado, String arbitro, String autor) {
        super(id, titulo, materia, cantidad, estado);
        setArbitro(arbitro);
        setAutor(autor);
    }

    public String getArbitro() {
        return arbitro;
    }
    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
