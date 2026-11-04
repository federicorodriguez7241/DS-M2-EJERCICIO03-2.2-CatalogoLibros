import java.util.ArrayList;
import java.util.List;

public class CatalogoCentral {
    private static CatalogoCentral instancia;
    private List<Libro> ListaLibros;

    private CatalogoCentral(){
        this.ListaLibros = new ArrayList<>();
    }

    public static CatalogoCentral getInstancia() {
        if (instancia == null){
            instancia = new CatalogoCentral();
        }
        return instancia;
    }

    public void AgregarLibro(String codigo, String titulo, String autor, int cantidadEjemplares){
        Libro nuevoLibro = new Libro(codigo,titulo,autor,cantidadEjemplares);
        ListaLibros.add(nuevoLibro);
    }

    // --- METODO INTEGRADO DE BÚSQUEDA ---
    public List<Libro> buscarLibro(String textoBusqueda) {
        List<Libro> resultados = new ArrayList<>();
        String texto = textoBusqueda.toLowerCase();

        for (Libro libro : this.ListaLibros) {
            if (libro.getTitulo().toLowerCase().contains(texto) ||
                    libro.getAutor().toLowerCase().contains(texto)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    // --- METODO PARA ACTUALIZAR EJEMPLARES ---
    public void actualizarEjemplares(String codigo, int nuevaCantidad) {
        for (Libro libro : this.ListaLibros) {
            // Buscamos el libro que tenga exactamente ese código
            if (libro.getCodigo().equals(codigo)) {
                libro.setCantidadEjemplares(nuevaCantidad);
                System.out.println("Ejemplares actualizados correctamente.");
                break; // Como el código es único, si lo encontramos cortamos el ciclo
            }
        }
    }
}