package ar.com.unpaz.service.imp;

import java.util.List;

import ar.com.unpaz.model.Libro;
import ar.com.unpaz.repositorio.LecturaArchivo;
import ar.com.unpaz.service.GestionLibro;

public class GestionLibroImp  implements GestionLibro {


	@Override
	public void listarLibros(List<Libro> libros) {
	   for (Libro libro : libros) {
		  System.out.println(libro);
	   }	
	}

	@Override
	public void guardarLibro(List<Libro> libros, Libro libro) {
		   libros.add(libro);
	}

	@Override
	public void prestarLibro(List<Libro> libros, Libro libro, Boolean prestar) {
          for (Libro lb : libros) {
			   if(lb.getTitulo().equals(libro.getTitulo())) {
				    lb.setPrestado(prestar);
			   }
		}
		
	}

	@Override
	public void devolverLibro(List<Libro> libros, Libro libro, Boolean devolver) {
		 for (Libro lb : libros) {
			   if(lb.getTitulo().equals(libro.getTitulo())) {
				    lb.setPrestado(devolver);
			   }
		}
		
	}

	@Override
	public void mostrarLibrosPrestados(List<Libro> libros) {
	    for (Libro libro : libros) {
			if(libro.getPrestado()) {
				 System.out.println(libro);
			}
		}
		
	}

	@Override
	public void buscarLibro(List<Libro> libros, String codigo) {
		 Boolean econtro= false;
		 for (Libro lb : libros) {
			   if(lb.getCodigo() ==  codigo) {
                  System.err.println(lb);
                  break;
			   }
		}
	    if(!econtro) {
	        System.err.println("No encontramos el libro");
	    }
		
	}

	
}
