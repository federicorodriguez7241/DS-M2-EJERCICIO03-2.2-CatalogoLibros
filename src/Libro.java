public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int cantidadEjemplares;

    public Libro(String codigo, String titulo, String autor, int cantidadEjemplares) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    @Override
    public String toString() {
        return "Libro [" + codigo + "] - " + titulo + " (Autor: " + autor + ") -> Ejemplares: " + cantidadEjemplares;
    }
}
