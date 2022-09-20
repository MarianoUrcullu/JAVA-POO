/*
ISBN, Título, Autor,
Número de páginas
 */
package ejercicio_01.entidades;

import java.util.Scanner;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numpag;

    /**
     * Contructor vacio
     */
    public Libro() {
    }

    /**
     * Constructor pasado por parametros
     *
     * @param ISBN
     * @param titulo
     * @param autor
     * @param numpag
     */
    public Libro(int ISBN, String titulo, String autor, int numpag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    /**
     * toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Libro{ISBN = " + ISBN + ", Titulo = " + titulo + ", Autor = " + autor + ", Numpag = " + numpag + '}';
    }

    public Libro crearLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Ingresa el Titulo");
        String titulo = leer.next();
        System.out.println("Ingresa el Autor");
        String autor = leer.next();
        System.out.println("Ingresa el Numero de Paginas");
        int numpag = leer.nextInt();

        return new Libro(ISBN, titulo, autor, numpag);
    }
}
