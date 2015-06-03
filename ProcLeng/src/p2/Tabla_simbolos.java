package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import p2.Simbolo.Clase_parametro;
import p2.Simbolo.Tipo_simbolo;
import p2.Simbolo.Tipo_variable;

public class Tabla_simbolos {
	
	private final int MAX = 32771; // > 2^15
	private int numNodos;
	private List<Simbolo>[] tabla;
	
	public Tabla_simbolos(){
		inicializar_tabla();
	}
	
	/**
	 * Crea una tabla de simbolos vacia. 
	 */
	public void inicializar_tabla(){
		this.numNodos = 0;	//elementos = 0
		this.tabla = (List<Simbolo>[])new List[MAX]; //Tabla vacia
	}
	
	/**
	 * Busca en la tabla el simbolo de mayor nivel cuyo nombre coincida con el del
	 * parametro (se distinguen mayusculas y minusculas). Si existe, devuelve ese
	 * simbolo. Si no existe, devuelve null.
	 */
	public Simbolo buscar_simbolo(String nombre){
		List<Simbolo> listAux;
		int entrada;
		entrada = 0;		//PEARSON
		listAux = tabla[entrada];
		
		/* Si el contenido de la lista esta vacio -> no esta el simbolo */
		if(listAux == null){
			return null;
		}
		else{
			/* Lista con elementos */
			Iterator<Simbolo> i = listAux.iterator();
			boolean encontrado = false;
			Simbolo s = null;
			
			/* Mientras que haya un elemento, y hayamos encontrado nuestro simbolo...*/
			while(i.hasNext() && !encontrado){
				s = i.next();
				if(i.next().getNombre().equals(nombre)){
					
					/* El simbolo esta */
					encontrado = true;
				}
			}
			return s;
		}
	}
	
	/**
	 * Introduce en la tabla un simbolo PROGRAMA, con el nombre del parametro, de nivel 0,
	 * con la direccion del parametro. No se verifica que ya exista.
	 */
	public Simbolo introducir_programa(String nombre, int dir){
		int entrada;
		entrada = 0;			//PEARSON
		
		/* Creamos el simbolo (podria ser con metodo aux de Simbolo) */
		Simbolo s = new Simbolo();
		s.setNombre(nombre);
		s.setDir(dir);
		s.setNivel(0);
		s.setTipo(Simbolo.Tipo_simbolo.PROGRAMA);
		
		/* Creamos la en la tabla e insertamos ahi el simbolo */
		List<Simbolo> l = new ArrayList<Simbolo>();
		l.add(0, s);
		tabla[entrada] = l;
		return s;
	}
	
	/**
	 * Si existe un simbolo en la tabla del mismo nivel, y con el mismo nombre, devuelve null.
	 * De lo contrario, introduce un simbolo variable con los datos de los argumentos.
	 */
	public Simbolo introducir_variable(String nombre, Tipo_variable variable, int nivel, int dir){
		int entrada;
		entrada = 0;			//PEARSON
		Simbolo s = null;
		
		if(!esta(nombre, nivel)){	
			
			/* Si no existe un simbolo con el mismo nombre y nivel */
			s = new Simbolo();
			s.introducir_variable(nombre, variable, nivel);
			if(tabla[entrada] == null || tabla[entrada].size()==0){	
				
				/* Nodo vacio -> Insercion inmediata */
				if(tabla[entrada] == null){
					List<Simbolo> l = new ArrayList<Simbolo>();
					l.add(0,s);
					tabla[entrada] = l;
				}
				else{
					tabla[entrada].add(0,s);
				}
			}
			else{			
				
				/* Nodo ocupado -> Insercion en primera posicion */
				tabla[entrada].add(0,s);
			}
		}
		return s;
	}
	
	/**
	 * Si existe un simbolo en la tabla del mismo nivel, y con el mismo nombre, devuelve null.
	 * De lo contrario, introduce un simbolo accion con los datos de los argumentos.
	 */
	public Simbolo introducir_accion(String nombre, int nivel, int dir, ArrayList<Simbolo> listaParam){
		int entrada;
		entrada = 0;			//PEARSON
		Simbolo s = null;
		
		if(!esta(nombre, nivel)){	
			
			/* Si no existe un simbolo con el mismo nombre y nivel */
			s = new Simbolo();
			s.introducir_accion(nombre, nivel, listaParam);
			if(tabla[entrada] == null || tabla[entrada].size()==0){	
				
				/* Nodo vacio -> Insercion inmediata */
				if(tabla[entrada] == null){
					List<Simbolo> l = new ArrayList<Simbolo>();
					l.add(0,s);
					tabla[entrada] = l;
				}
				else{
					tabla[entrada].add(0,s);
				}
			}
			else{			
				
				/* Nodo ocupado -> Insercion en primera posicion */
				tabla[entrada].add(0,s);
			}
		}
		return s;
	}
	
	/**
	 * Si existe un simbolo en la tabla del mismo nivel, y con el mismo nombre, devuelve null.
	 * De lo contrario, introduce un simbolo accion con los datos de los argumentos.
	 */
	public Simbolo introducir_parametro(String nombre, Tipo_variable variable, Clase_parametro parametro, int nivel, int dir){
		int entrada;
		entrada = 0;			//PEARSON
		Simbolo s = null;
		
		if(!esta(nombre, nivel)){	
			
			/* Si no existe un simbolo con el mismo nombre y nivel */
			s = new Simbolo();
			s.introducir_parametro(nombre, variable, parametro, nivel);
			if(tabla[entrada] == null || tabla[entrada].size()==0){	
				
				/* Nodo vacio -> Insercion inmediata */
				if(tabla[entrada] == null){
					List<Simbolo> l = new ArrayList<Simbolo>();
					l.add(0,s);
					tabla[entrada] = l;
				}
				else{
					tabla[entrada].add(0,s);
				}
			}
			else{			
				
				/* Nodo ocupado -> Insercion en primera posicion */
				tabla[entrada].add(0,s);
			}
		}
		return s;
	}
	
	/**
	 * Elimina de la tabla todos los simbolos programa de nivel 0
	 */
	public void eliminar_programa(){
		int i = 0;
		boolean eliminado = false;
		while(i<MAX && !eliminado){
			if(!(tabla[i] == null || tabla[i].size() == 0)){
				
				/* Lista con simbolos */
				List<Simbolo> l = tabla[i];
				Iterator<Simbolo> it = l.iterator();
				while(it.hasNext() && !eliminado){
					Simbolo s = it.next();
					if(s.getTipo().equals(Tipo_simbolo.PROGRAMA) && s.getNivel()== 0){
						
						/* Programa encontrado -> Eliminamos*/
						l.remove(s);
						eliminado = true;
					}
				}
			}
			i++;
		}
	}
	
	/**
	 * Elimina de la tabla todas las variables que sean del nivel del argumento.
	 */
	public void eliminar_variables(int nivel){
		for (int i = 0; i < MAX; i++) {
			if(!(tabla[i] == null || tabla[i].size() == 0)){
				
				/* Lista con simbolos */
				List<Simbolo> l = tabla[i];
				Iterator<Simbolo> it = l.iterator();
				while(it.hasNext()){
					Simbolo s = it.next();
					if(s.getTipo().equals(Tipo_simbolo.VARIABLE) && s.getNivel()== nivel){
						
						/* Variable encontrada en el nivel pedido -> Eliminamos*/
						l.remove(s);
					}
				}
			}
		}
	}
	
	/**
	 * Elimina de la tabla todos los procedimientos de un nivel.
	 */
	public void eliminar_acciones(int nivel){
		for (int i = 0; i < MAX; i++){
			if(!(tabla[i] == null || tabla[i].size() == 0)){
				
				/* Lista con simbolos */
				List<Simbolo> l = tabla[i];
				Iterator<Simbolo> it = l.iterator();
				while(it.hasNext()){
					Simbolo s = it.next();
					if(s.getTipo().equals(Tipo_simbolo.ACCION) && s.getNivel()== nivel) {
						
						/* Eliminar parametros */
						ArrayList<Simbolo> parametros = s.getLista_parametros();
						Iterator<Simbolo> it_param = parametros.iterator();
						while(it_param.hasNext()){
							Simbolo param = it_param.next();
							eliminar_parametro(param.getNombre(), param.getNivel());
						}
						
						/* Eliminar accion */
						l.remove(s);
					}
				}
			}
		}
	}
	
	/**
	 * Elimina de la tabla la accion con el nombre y el nivel pasado como parametro. Ademas,
	 * elimina los parametros asociados a esa accion
	 */
	public void eliminar_accion(String nombre, int nivel){
		int i = 0; //Pearson
		
		if(!(tabla[i] == null || tabla[i].size() == 0)){
			List<Simbolo> l = tabla[i];
			Iterator<Simbolo> it = l.iterator();
			while(it.hasNext()){
				Simbolo s = it.next();
				if(s.getTipo().equals(Tipo_simbolo.ACCION) && s.getNombre().equals(nombre)
						&& s.getNivel()==nivel){
					
					ArrayList<Simbolo> parametros = s.getLista_parametros();
					Iterator<Simbolo> it_param = parametros.iterator();
					while(it_param.hasNext()){
						Simbolo param = it_param.next();
						eliminar_parametro(param.getNombre(), param.getNivel());
					}
					/* Parametro a eliminar */
					l.remove(s);
				}
			}
		}
	}
	
	/**
	 * Elimina de la tabla el parametro con el nombre y el nivel pasado como parametros.
	 */
	private void eliminar_parametro(String nombre, int nivel){
		int i = 0; //Pearson
		
		if(!(tabla[i] == null || tabla[i].size() == 0)){
			List<Simbolo> l = tabla[i];
			Iterator<Simbolo> it = l.iterator();
			while(it.hasNext()){
				Simbolo s = it.next();
				if(s.getTipo().equals(Tipo_simbolo.PARAMETRO) && s.getNombre().equals(nombre) && s.getNivel()==nivel){
					
					/* Parametro a eliminar */
					l.remove(s);
				}
			}
		}
	}
	
	/**
	 * Devuelve true si existe un simbolo en el mismo nivel y con el 
	 * mismo nombre que los parametros dados
	 */
	private boolean esta(String nombre, int nivel){
		int entrada;
		entrada = 0;		//PEARSON
		boolean esta = false;
		if(!(tabla[entrada] == null || tabla[entrada].size() == 0)){
			
			/* Lista con simbolos */
			Iterator<Simbolo> i = tabla[entrada].iterator();
			boolean parar = false;
			
			while(i.hasNext() && !parar){
				Simbolo s = i.next();
				if(s.getNombre().equals(nombre) && s.getNivel() <= nivel){
					
					/* Mismo nombre, mismo nivel = simbolo ya esta*/
					esta = true;
					parar = true;
				}
			}
		}
		return esta;
	}
}

///**
//* Marca todos los parametros de un nivel como ocultos para que no puedan ser encontrados
//*/
//public void ocultar_parametros(int nivel){
//	for (int i = 0; i < MAX; i++) {
//		if(!(tabla[i] == null || tabla[i].size() == 0)){
//			
//			/* Lista con simbolos */
//			List<Simbolo> l = tabla[i];
//			Iterator<Simbolo> it = l.iterator();
//			while(it.hasNext()){
//				Simbolo s = it.next();
//				if(s.getTipo().equals(Tipo_simbolo.PARAMETRO) && s.getNivel()== nivel){
//					
//					/* Parametro encontrado en el nivel pedido -> Ocultamos */
//					s.setVisible(false);
//				}
//			}
//		}
//	}
//}

///**
//* Elimina de la tabla todos los parametros que hayan sido ocultados previamente
//*/
//public void eliminar_parametros_ocultos(int nivel){
//	for (int i = 0; i < MAX; i++){
//		if(!(tabla[i] == null || tabla[i].size() == 0)){
//			
//			/* Lista con simbolos */
//			List<Simbolo> l = tabla[i];
//			Iterator<Simbolo> it = l.iterator();
//			while(it.hasNext()){
//				Simbolo s = it.next();
//				if(s.getTipo().equals(Tipo_simbolo.PARAMETRO) && s.getNivel()== nivel && !s.isVisible()) {
//					eliminar_accion(s.getNombreAccion(), nivel);
//				}
//			}
//		}
//	}
//}