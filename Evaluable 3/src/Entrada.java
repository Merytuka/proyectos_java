import controller.Catalogo;
import model.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void mostrarIsbn(ArrayList<Libro> libros) {
        System.out.println("Lista de ISBN de libros disponibles:");
        for (Libro libro : libros) {
            System.out.println(libro.getIsbn());
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Libro> totalLibros = new ArrayList<>();

        totalLibros.add(new LibroTerror("123", "Stephen King", 654, 7));
        totalLibros.add(new LibroTerror("548", "Vanesa Martinez", 300, 2));

        totalLibros.add(new LibroComedia("4565", "Mar Montes", 1150, "blanco"));
        totalLibros.add(new LibroComedia("147", "Pepe Gotera", 685, "verde"));

        totalLibros.add(new LibroPoliciaca("459", "Kate Mood", 440, Trama.INTRIGA, new String[]{"Carla", "Pedro", "Jonan", "Hura"}));
        totalLibros.add(new LibroPoliciaca("005", "Maria Fez", 147, Trama.MISTERIO, new String[]{"Perro", "Gato", "Aguila", "Pez"}));

        Biblioteca biblioteca = null;
        Catalogo catalogo;

        int opcion = 0;

        do {

            System.out.println("Bienvenida a la aplicación de Bibliotecas");

            System.out.println("¿Qué quieres hacer?");

            System.out.println("1-> Crear una Biblioteca");
            System.out.println("2-> Crear un catálogo");
            System.out.println("3-> Agregar libros");
            System.out.println("4-> Eliminar libros");
            System.out.println("5-> Buscar libro mediante su ISBN");
            System.out.println("6-> Mostrar todos los libros");
            System.out.println("7-> Exportar catálogo");
            System.out.println("8-> Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    biblioteca = crearBiblioteca();
                    biblioteca.mostrarDatos();
                    break;

                case 2:
                    if (biblioteca != null) {
                        biblioteca.setCatalogo(crearCatalogo(totalLibros));
                        System.out.println("Catálogo creado");
                    } else {
                        System.out.println("Debes crear primero una biblioteca");
                    }
                    break;
                case 3:
                    String opcionAnadir;
                    do {
                        Libro libroNuevo = crearLibro(totalLibros);
                        try {
                            biblioteca.getCatalogo().agregarLibro(libroNuevo);
                            System.out.println("¿Quieres añadir otro libro? Y/N");
                            opcionAnadir = teclado.next();

                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }

                    } while (opcionAnadir.equals("Y"));
                    break;
                case 4:
                    mostrarIsbn(biblioteca.getCatalogo().getLibros());
                    System.out.println("Que ISBN deseas eliminar");
                    String isbnEliminar = teclado.next();
                    biblioteca.getCatalogo().eliminarLibro(isbnEliminar);
                    System.out.println("El listado de ISBN del catálogo se ha actualizado");

                    break;
                case 5:
                    System.out.println("Que libro deseas buscar? marca su ISBN. Los disponibles son: ");
                    mostrarIsbn(biblioteca.getCatalogo().getLibros());
                    int isbnBuscado = teclado.nextInt();
                    biblioteca.getCatalogo().buscarLibroPorISBN(String.valueOf(isbnBuscado)).mostrarDatos();
                    break;
                case 6:
                    System.out.println("El catálogo contiene los siguientes libros");
                    mostrarIsbn(biblioteca.getCatalogo().getLibros());
                    break;
                case 7:
                    System.out.println("Exportando catalogo a libros.obj");
                    exportarCatalogo(biblioteca.getCatalogo());
                    System.out.println("Proceso finalizado");

                    break;
                default:
                    System.out.println("------------------");


            }


        } while (opcion != 8);


    }

    private static Biblioteca crearBiblioteca() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a crear una nueva biblioteca");
        System.out.println("¿Cómo se llama?");
        String nombreBiblioteca = teclado.next();
        System.out.println("¿Quien es su Director?");
        String directorBiblioteca = teclado.next();
        System.out.println("¿Tu biblioteca tiene catágolo? Y/N");
        String existeCatalogo = teclado.next();

        if (existeCatalogo.equals("N")) {
            System.out.println("Tu biblioteca ha sido creada sin catálogos");
            Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, directorBiblioteca);
            return biblioteca;
        } else {
            System.out.println("¿Cuántos libros tiene tu catálogo?");
            int tamanoCatalogo = teclado.nextInt();
            Catalogo catalogo = new Catalogo(tamanoCatalogo);
            Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, directorBiblioteca, catalogo);
            System.out.println("Tu biblioteca ha sido creada con un catálogo que contendrá " + tamanoCatalogo + " libros");
            return biblioteca;
        }


    }

    private static Catalogo crearCatalogo(ArrayList<Libro> totalLibros) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a crear un catálogo");
        System.out.println("¿que tamaño tiene tu catálogo?");
        int tamano = teclado.nextInt();

        Catalogo catalogo = new Catalogo(tamano);

        System.out.println("Catálogo creado Enhorabuena");
        return catalogo;


    }

    private static Libro crearLibro(ArrayList<Libro> totalLibros) {
        Scanner teclado = new Scanner(System.in);


        Libro libroCreado = crearLibroSegunTipo(teclado, totalLibros);

        return libroCreado;

    }

    private static Libro crearLibroSegunTipo(Scanner teclado, ArrayList<Libro> totalLibros) {
        String isbn;
        String autor;
        int paginas;

        System.out.println("Seleccione el tipo de libro:");
        System.out.println("1. Terror");
        System.out.println("2. Comedia");
        System.out.println("3. Policiaca");
        int tipoLibro = teclado.nextInt();


        do {
            System.out.println("Ingrese ISBN:");
            isbn = teclado.next();
        } while (existeIsbn(isbn, totalLibros)); // Verifica si el ISBN ya existe

        System.out.println("Ingrese autor:");
        autor = pedirString(teclado);

        do {
            System.out.println("Ingrese número de páginas:");
            paginas = teclado.nextInt();
        } while (paginas <= 0); // Verifica que el número de páginas sea positivo

        switch (tipoLibro) {
            case 1: // Libro Terror
                System.out.println("Ingrese calificación (1-5):");
                int calificacion;
                do {
                    calificacion = teclado.nextInt();
                } while (calificacion < 1 || calificacion > 5); // Rango válido de calificación
                return new LibroTerror(isbn, autor, paginas, calificacion);

            case 2: // Libro Comedia
                System.out.println("Ingrese tipo de humor (blanco, negro, verde):");
                String tipoHumor = pedirString(teclado);
                return new LibroComedia(isbn, autor, paginas, tipoHumor);

            case 3: // Libro Policiaca
                System.out.println("Ingrese trama (misterio, intriga):");
                Trama trama;
                do {
                    try {
                        trama = Trama.valueOf(teclado.next().toUpperCase()); // Convierte la entrada a Trama
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Trama no válida. Ingrese (misterio, intriga):");
                    }
                } while (true);

                System.out.println("Ingrese personajes (separados por comas):");
                String[] personajes = pedirString(teclado).split(",");
                return new LibroPoliciaca(isbn, autor, paginas, trama, personajes);

            default:
                System.out.println("Opción no válida");
                return null;
        }
    }


    public static int pedirIsbnUnico(ArrayList<Libro> totalLibros) {
        Scanner teclado = new Scanner(System.in);
        int Isbn;

        do {
            System.out.println("Ingrese ISBN:");
            Isbn = teclado.nextInt();
        } while (existeIsbn(String.valueOf(Isbn), totalLibros));

        return Isbn;
    }

    private static boolean existeIsbn(String Isbn, ArrayList<Libro> totalLibros) {
        for (Libro libro : totalLibros) {
            if (libro.getIsbn().equals(Isbn)) {
                System.out.println("El ISBN ya existe, ingrese uno nuevo:");
                return true;
            }
        }
        return false;
    }
    private static void exportarCatalogo(Catalogo catalogo) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("libros.obj");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(catalogo.getLibros());

            System.out.println("Catalogo exportado a libros.obj");
        } catch (IOException e) {
            System.err.println("Error al exportar libros: " + e.getMessage());
        }
    }

    private static String pedirString(Scanner teclado) {

        return teclado.next();
    }

    private static int pedirInt(Scanner teclado) {

        return teclado.nextInt();
    }
}

