/**
 * @author	Alejandro Márquez Ferrer,	NIP: 566400
 * 			Alejandro Royo Amondarain,	NIP: 560285
 */

package p2;

public class Nodo<E> {
	// Atributos de la clase Nodo
	private E dato;
	private Nodo<E> siguiente;
	
	public Nodo(E dato, Nodo<E> siguiente){
		this.dato = dato;
		this.siguiente = siguiente;
	}
	/**
	 * Devuelve una referencia a un dato correspondiente al elemento del nodo actual
	 */
	public E getDato(){
		return dato;
	}
	/**
	 * Devuelve una referencia al nodo primogenito del actual
	 */
	public Nodo<E> getSiguiente(){
		return siguiente;
	}
	/**
	 * Modifica el valor del campo dato del actual nodo con d
	 */
	public void setDato(E d){
		this.dato = d;
	}
	/**
	 * Modifica el valor del campo primogenito con una referencia a un nodo n
	 */
	public void setSiguiente(Nodo<E> n){
		this.siguiente = n;
	}
}
