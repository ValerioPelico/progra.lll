package estructuralibros;

/**
 *
 * @autor Valerio Pelicó
 * 0901-16-11957
 */
public class Libro implements Comparable <Libro> {
    
    private int isbn; 
    private String titulo;
    private String autor;
    
    public Libro () {}
    
    public Libro (int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public int getISBN () {
        return this.isbn;
    }
    
    public String getAutor () {
        return this.autor;
    }
    
    public String getTitulo () {
        return this.titulo;
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor (String autor) {
        this.autor = autor;
    }
    
    @Override
    public int compareTo(Libro o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}