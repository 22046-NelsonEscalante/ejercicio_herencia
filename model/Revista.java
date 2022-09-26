package model;

public class Revista extends Objetos{
    private int anio;
    private int numero;


    public Revista(int id, String titulo, String materia, int cantidad, String estado, int anio, int numero) {
        super(id, titulo, materia, cantidad, estado);
        setAnio(anio);
        setNumero(numero);
    }

    
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
