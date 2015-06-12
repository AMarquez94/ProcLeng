/**
 * Autor: Alejandro Marquez Ferrer
 * NIP: 566400
 */

package tProcLen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class GeneracionCodigo {
	
	private PrintWriter f;
	private String nombreFichero;
	
	/**
	 * Crea el fichero.code
	 */
	public GeneracionCodigo(String nombre) throws IOException{
		iniciar_fichero(nombre);
	}
	
	public void iniciar_fichero(String nombre) throws IOException{
		this.nombreFichero = nombre;
		this.f = new PrintWriter(new FileWriter(nombreFichero));
		f.close();
	}
	
	/**
	 * Concatena el String pasado como argumento al final del fichero
	 */
	public void escribir(String escribir){
		try {
			f = new PrintWriter(new FileWriter(nombreFichero, true));
			f.println(escribir);
			f.close();
		} catch (IOException e) {
			System.err.println("Error al escribir en el fichero " + nombreFichero);
			File fichero = new File(nombreFichero);
			fichero.delete();
			System.exit(1);
		}
	}
	
	/**
	 * Elimina el fichero
	 */
	public void eliminar_fichero(){
		File fichero = new File(nombreFichero);
		fichero.delete();
	}
	
	/**
	 * Elimina la ultima linea del fichero
	 */
	public void eliminar_linea(){
		RandomAccessFile f;
		try {
			f = new RandomAccessFile(nombreFichero, "rw");
			long length = f.length() - 1;
			byte b;
			do {                     
			  length -= 1;
			  f.seek(length);
			  b = f.readByte();
			} while(b != 10 && length > 0);
			if (length == 0) { 
			f.setLength(length);
			} else {
			f.setLength(length + 1);
			}
			f.close();
		} catch (IOException e) {
			System.err.println("Error al escribir en el fichero " + nombreFichero);
			File fichero = new File(nombreFichero);
			fichero.delete();
			System.exit(1);
		}
		
	}

}
