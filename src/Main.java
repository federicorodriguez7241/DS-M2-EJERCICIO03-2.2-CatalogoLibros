import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Simulamos las dos pantallas obteniendo la instancia única
        CatalogoCentral pantallaPersonal = CatalogoCentral.getInstancia();
        CatalogoCentral pantallaConsultas = CatalogoCentral.getInstancia();

        if (pantallaPersonal == pantallaConsultas) {
            System.out.println("✅ Ambas pantallas están conectadas al mismo catálogo.\n");
        }

        // 2. El personal incorpora libros al sistema
        pantallaPersonal.AgregarLibro("L001", "El Señor de los Anillos", "J.R.R. Tolkien", 5);
        pantallaPersonal.AgregarLibro("L002", "Cien años de soledad", "Gabriel García Márquez", 3);
        pantallaPersonal.AgregarLibro("L003", "El Hobbit", "J.R.R. Tolkien", 2);

        // 3. Un usuario busca en la pantalla de consultas (por autor)
        System.out.println("--- BÚSQUEDA EN PANTALLA DE CONSULTAS (Tolkien) ---");
        List<Libro> resultados = pantallaConsultas.buscarLibro("tolkien");
        for (Libro libro : resultados) {
            System.out.println(libro.toString());
        }

        // 4. El personal actualiza la cantidad de ejemplares de un libro
        System.out.println("\n--- ACTUALIZACIÓN DESDE PANTALLA PERSONAL ---");
        pantallaPersonal.actualizarEjemplares("L001", 4);

        // 5. El usuario vuelve a consultar y ve el cambio reflejado inmediatamente
        System.out.println("\n--- NUEVA BÚSQUEDA EN PANTALLA DE CONSULTAS (Anillos) ---");
        List<Libro> resultadosActualizados = pantallaConsultas.buscarLibro("Anillos");
        for (Libro libro : resultadosActualizados) {
            System.out.println(libro.toString());
        }
    }
}