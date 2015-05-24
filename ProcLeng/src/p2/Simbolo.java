package p2;

import java.util.ArrayList;

public class Simbolo {
	
	public enum Tipo_simbolo{
		PROGRAMA,VARIABLE,ACCION,PARAMETRO
	}
	public enum Tipo_variable{
		DESCONOCIDO,ENTERO,BOOLEANO,CHAR,CADENA
	}
	public enum Clase_parametro{
		VAL,REF
	}
	
	/* Atributos */
	private String nombre;							//Nombre del simbolo
	private int nivel;								//Nivel en el que esta declarado el simbolo
	private Tipo_simbolo tipo;						//Tipo del simbolo
	private Tipo_variable variable;					//Tipo de la variable
	private Clase_parametro parametro;				//Tipo del parametro
	private boolean visible;						//Simbolo visible
	private ArrayList<Simbolo> lista_parametros;	//Lista de simbolos representando parametros de una accion
	private long dir;								//Direccion del simbolo
	private String nombreAccion;					//Nombre de la accion a la que pertenece el simbolo
	
	/* Getters y Setters */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public Tipo_simbolo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo_simbolo tipo) {
		this.tipo = tipo;
	}
	public Tipo_variable getVariable() {
		return variable;
	}
	public void setVariable(Tipo_variable variable) {
		this.variable = variable;
	}
	public Clase_parametro getParametro() {
		return parametro;
	}
	public void setParametro(Clase_parametro parametro) {
		this.parametro = parametro;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public ArrayList<Simbolo> getLista_parametros() {
		return lista_parametros;
	}
	public void setLista_parametros(ArrayList<Simbolo> lista_parametros) {
		this.lista_parametros = lista_parametros;
	}
	public long getDir() {
		return dir;
	}
	public void setDir(long dir) {
		this.dir = dir;
	}
	public String getNombreAccion() {
		return nombreAccion;
	}
	public void setNombreAccion(String nombreAccion){
		this.nombreAccion = nombreAccion;
	}
	
	/* Metodos particulares */
	public void introducir_variable(String nombre, Tipo_variable tipo_var, int nivel){
		this.nombre = nombre;
		this.tipo = Tipo_simbolo.VARIABLE;
		this.variable = tipo_var;
		this.nivel = nivel;
	}
	
	public void introducir_parametro(String nombre, Tipo_variable tipo_var, Clase_parametro clas_par, int nivel, String nombreAccion){
		this.nombre = nombre;
		this.tipo = Tipo_simbolo.PARAMETRO;
		this.variable = tipo_var;
		this.parametro = clas_par;
		this.nivel = nivel;
		this.nombreAccion = nombreAccion;
	}
	
	public void introducir_accion(String nombre, int nivel, ArrayList<Simbolo> lista_parametros){
		this.nombre = nombre;
		this.tipo = Tipo_simbolo.ACCION;
		this.lista_parametros = lista_parametros;
		this.nivel = nivel;
	}
	
	/* Identificadores */
	public boolean es_variable(){
		return (tipo.toString().equals("VARIABLE"));
	}
	
	public boolean es_parametro(){
		return (tipo.toString().equals("PARAMETRO"));
	}
	
	public boolean es_accion(){
		return (tipo.toString().equals("ACCION"));
	}
	
	public boolean es_valor(){
		return (tipo.toString().equals("PARAMETRO")
				&& parametro.equals("VAL"));
	}
	
	public boolean es_referencia(){
		return (tipo.toString().equals("PARAMETRO")
				&& parametro.equals("REF"));
	}
}
