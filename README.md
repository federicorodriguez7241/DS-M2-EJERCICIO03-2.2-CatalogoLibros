# Diseño de Software - Módulo 2
- Ejercitación 2.2
- Ejercicio 3: Catálogo Compartido de Libros
Contexto del problema:
Una biblioteca dispone de dos pantallas: una para el personal y otra para consultar el catálogo. Cada pantalla mantiene su propia lista de libros, por lo que los títulos incorporados por el personal no aparecen inmediatamente en la consulta.

Objetivo de aprendizaje:
Administrar una colección compartida mediante una instancia Singleton con operaciones controladas.

Requisitos funcionales:

Incorporar libros con código único, título, autor y cantidad de ejemplares.

Buscar libros por título o autor.

Actualizar la cantidad de ejemplares de un libro.

Consultar desde ambas pantallas el mismo catálogo actualizado.
***
# Lógica y Funcionamiento del Programa:
    Para resolver este problema, implementé el Patrón Singleton para crear un repositorio central de libros, garantizando que tanto el personal como los usuarios interactúen siempre con la misma fuente de datos en tiempo real.

- Clase Libro: Actúa como entidad de datos. Encapsula el código único, título, autor y cantidad de ejemplares. Dispone de un método modificador (Setter) únicamente para la cantidad de ejemplares, protegiendo así la inmutabilidad de los datos identificatorios del libro tras su creación.

- Clase CatalogoCentral: Implementa el Singleton mediante un constructor privado que inicializa una colección (ArrayList) de libros. Expone métodos controlados para interactuar con la lista: AgregarLibro() instancia y guarda nuevos objetos; buscarLibro() aplica un filtro de coincidencia parcial ignorando mayúsculas y minúsculas tanto para el título como para el autor; y actualizarEjemplares() localiza un libro por su código único para modificar su stock.

- Clase Main: En el entorno de prueba, instancié dos referencias al Singleton simulando la pantalla del personal y la pantalla de consultas. A través de la interfaz del personal, se cargaron libros y se modificó el inventario. Al realizar búsquedas desde la interfaz de consultas, se corroboró que los datos devueltos incluyeran las modificaciones más recientes, demostrando la correcta centralización del estado del sistema.
***
# Ejecucion por consola
![Captura de pantalla 2026-11-04 005647.png](Captura%20de%20pantalla%202026-11-04%20005647.png)
