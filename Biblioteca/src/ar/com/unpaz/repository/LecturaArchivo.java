package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Libro;

public class LecturaArchivo {

	
	
	public List<Libro> lectura(){
	  List<Libro> lista = new ArrayList<Libro>();
		
	  File sFile = new File("libros.txt");
  	  FileReader sFileReader;
	try {
		sFileReader = new FileReader(sFile);
		BufferedReader  sBuffer = new BufferedReader(sFileReader);
		String linea = "";
		while((linea = sBuffer.readLine())!= null) {
		   String array [] = linea.split(",");
		   Libro libro = new Libro();
		   libro.setCodigo(array[0]);
		   libro.setTitulo(array[1]);
		   libro.setAutor(array[2]);
		   libro.setAnio(array[3]);
		   libro.setPrestado(Boolean.parseBoolean(array[4]));
		   lista.add(libro);
		   
		}

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	 
  	  
		
	  return lista;
		
	}
}
