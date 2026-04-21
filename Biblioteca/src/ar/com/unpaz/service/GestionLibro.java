package ar.com.unpaz.service;

import java.util.List;

import ar.com.unpaz.model.Libro;

public interface GestionLibro {
	
    void listarLibros(List<Libro>libros);
	void buscarLibro(List<Libro>libros,String codigo);
	void guardarLibro(List<Libro>libros,Libro libro);
	void prestarLibro(List<Libro>libros,Libro libro, Boolean prestar);
	void devolverLibro(List<Libro>libros,Libro libro, Boolean devolver);
	void mostrarLibrosPrestados(List<Libro>libros);
	
	
	
}
