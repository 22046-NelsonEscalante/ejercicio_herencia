package model;

public class Objetos {
    private int id;
    private String titulo;
    private String materia;
    private int cantidad;
    private String estado;


    public Objetos(int id, String titulo, String materia, int cantidad, String estado){
        setId(id);
        setTitulo(titulo);
        setMateria(materia);
        setCantidad(cantidad);
        setEstado(estado);
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
