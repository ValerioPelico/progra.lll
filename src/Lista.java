

package Lista;
import estructuralibros.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @autor Valerio Pelicó 
 * 0901-16-11957
 */
public class Lista {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList <Libro> libros = new ArrayList <>();
        String [] menu = {"1 - Ingreso de libro", "2 - Eliminar libro (buscando por ISBN)", "3 - Mostrar la lista por ISBN", "4 - Salir"};
        int respuesta = 0;
        int isbn;
        String autor;
        String titulo;
        int contadorComprobante = 0;
        
        //While del menu
        while (respuesta != 4) {
            
            //Imprimimos menu
            for ( int contador = 0; contador < menu.length; contador++ ) {
                System.out.print("\n"+menu[contador]);
            }
            
            System.out.print("\n¿Opcion?    ");
            respuesta = leer.nextInt();
            
            switch (respuesta) {
                
                case 1:
                    System.out.print("\nISBN:  ");
                    isbn = leer.nextInt();
                    leer.nextLine();
                    System.out.print("\nTítulo:  ");
                    titulo = leer.nextLine();
                    System.out.print("\nAutor:  ");
                    autor = leer.nextLine();
                    libros.add(new Libro(isbn, titulo, autor));
                    
                    break;
                    
                case 2:
                    System.out.print("\nIntroduce codigo ISBN a eliminar: ");
                    isbn = leer.nextInt();
                    //contadorComprobante = 1;
                    for ( int contador = 0; contador < libros.size(); contador++ ) {
                        if (isbn == libros.get(contador).getISBN()) {
                            libros.remove(contador);
                            System.out.print("\nLibro borrado.\n");
                            contadorComprobante = 0;
                        }else {
                             System.out.print("\nNo se encuentra el código ISBN en la base de datos.\n"); 
                             contadorComprobante++;
                        }
                    }
                    break;
                
                case 3:
                    leer.nextLine();
                    System.out.print("\nBuscar ISBN: ");
                    isbn = leer.nextInt();
                    
                    for ( int contador = 0; contador < libros.size(); contador++ ) {
                        if ( isbn == libros.get(contador).getISBN() ) {
                            System.out.print("\n"+"Autor: "+libros.get(contador).getAutor()+",  "+"Titulo: "+libros.get(contador).getTitulo()+",  "+"ISBN: "+libros.get(contador).getISBN()+"\n");
                        }
                    }
                    break;           
            }
                    
        }
    }
}