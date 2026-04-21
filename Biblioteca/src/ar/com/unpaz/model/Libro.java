package ar.com.unpaz.model;



/**
 * Mi clase libro 
 * @author impjim
 *
 */
public class Libro {

	private String  codigo;
	private String  titulo;
	private String  autor;
	private String  anio;
	private Boolean prestado;
	
	public Libro(String codigo, String titulo, String autor,  String anio, Boolean prestado) {
		 this.codigo = codigo;
		 this.titulo = titulo;
		 this.autor = autor;
		 this.anio = anio;
		 this.prestado = prestado;
	}
	
	public Libro() {
	
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo: " + codigo + " Autor: " +  autor ;
	}

}
