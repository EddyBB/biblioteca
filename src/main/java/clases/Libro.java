package clases;

public class Libro implements Comparable{
	
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
		return "El libro es: " + titulo + ", con isbn: " + isbn + ", con genero:  " + genero + ", autor: " + autor + " y páginas: " + paginas;
		
	}
	
	// orden alfabetico de los libros
	public int compareTo(Object a) {
		return paginas;
		
	}
	
	@Override
	public boolean equals(Object a) {
		return false;
		
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
