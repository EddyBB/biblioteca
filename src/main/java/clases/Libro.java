package clases;

import java.util.Comparator;

public class Libro implements Comparable<Libro>, Comparator<Libro>{
	
	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;
	
	public Libro() {
		
	}

	/**
	 * @param titulo
	 * @param isbn
	 * @param genero
	 * @param autor
	 * @param paginas
	 */
	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
	//@Override
	public String toString() {
		return titulo + ":" + isbn + ":" + genero + ":" + autor + ":" + paginas;
		
	}
	
	public String toStringFichero() {
		return titulo + "," + isbn + "," + genero + "," + autor + "," + paginas;
		
	}
	
	// orden alfabetico de los libros
	public int compareTo(Libro a) {
		return this.titulo.compareTo(a.titulo);
	}
	
	public int compare(Libro a, Libro b) {
		return a.getPaginas() - b.getPaginas();
	}
	
	@Override
	public boolean equals(Object a) {
		
		boolean retorno = false;
		
		Libro libro = (Libro) a;
		
		if(this == a) {
			retorno = true;
		} else {
			if (this.isbn.equals(libro.isbn)) {
				retorno = true;
			}
		}
		
		return retorno;
		
	}

	public static boolean comprobarBaja(int numlibro, int size) {
		// TODO Auto-generated method stub
        if (numlibro>=0 && numlibro <= (size+1)) 
        {
            System.out.println(" --- Libro eliminado ---\n");
            return true;
        }
        else
        {
            System.out.println(" --- No se ha encontrado el número del libro ---\n");
        }
		return false;
	}
}
