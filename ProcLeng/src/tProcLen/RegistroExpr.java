/**
 * Autor: Alejandro Marquez Ferrer
 * NIP: 566400
 */

package tProcLen;

import tProcLen.Simbolo.Clase_parametro;
import tProcLen.Simbolo.Tipo_variable;

public class RegistroExpr {
	
	private Integer valorEnt;
	private Boolean valorBool;
	private String valorChar;

	private String valorCadena;
	
	private Tipo_variable tipo;
	private Clase_parametro clase;
	private Token tk;
	
	/* Getters y Setters */
	public Clase_parametro getClase() {
		return clase;
	}
	public void setClase(Clase_parametro clase) {
		this.clase = clase;
	}
	public int getValorEnt() {
		return valorEnt;
	}
	public void setValorEnt(Integer valorEnt) {
		this.valorEnt = valorEnt;
	}
	public boolean isValorBool() {
		return valorBool;
	}
	public void setValorBool(boolean valorBool) {
		this.valorBool = valorBool;
	}
	public String getValorChar() {
		return valorChar;
	}
	public void setValorChar(String valorChar) {
		this.valorChar = valorChar;
	}
	public Tipo_variable getTipo() {
		return tipo;
	}
	public void setTipo(Tipo_variable tipo) {
		this.tipo = tipo;
	}
	public Token getTk() {
		return tk;
	}
	public void setTk(Token tk) {
		this.tk = tk;
	}
	
	/**
	 * Introduce un entero en el registro
	 */
	public void introducir_entero(Token tk, int valor){
		this.tipo = Tipo_variable.ENTERO;
		this.valorEnt = valor;
		this.tk = tk;
	}
	
	/**
	 * Introduce un booleano en el registro
	 */
	public void introducir_booleano(Token tk, boolean valor){
		this.tipo = Tipo_variable.BOOLEANO;
		this.valorBool = valor;
		this.tk = tk;
	}
	
	/**
	 * Introduce un caracter en el registro
	 */
	public void introducir_char(Token tk, String valor){
		this.tipo = Tipo_variable.CHAR;
		this.valorChar = valor;
		this.tk = tk;
	}
	
	/**
	 * Introduce una variable de tipo desconocido en el registro
	 */
	public void introducir_desconocido(Token tk){
		this.tipo = Tipo_variable.DESCONOCIDO;
		this.tk = tk;
	}
	
	/**
	 * Devuelve true si y solo si es entero
	 */
	public boolean es_entero(){
		return this.tipo.name().equals("ENTERO");
	}
	
	/**
	 * Devuelve true si y solo si es booleano
	 */
	public boolean es_booleano(){
		return this.tipo.name().equals("BOOLEANO");
	}
	
	/**
	 * Devuelve true si y solo si es caracter
	 */
	public boolean es_caracter(){
		return this.tipo.name().equals("CHAR");
	}
	
	/**
	 * Devuelve true si y solo si es desconocido
	 */
	public boolean es_desconocido(){
		return this.tipo.name().equals("DESCONOCIDO");
	}
	
	/**
	 * Devuelve true si y solo si es un parametro por valor
	 */
	public boolean es_valor(){
		if(this.clase==null){
			return false;
		}
		else{
			return this.clase.name().equals("VAL");
		}
	}
	
	/**
	 * Devuelve true si y solo si el registro tiene valor
	 */
	public boolean has_valor(){
		return this.valorEnt != null;
	}
	
	/**
	 * Devuelve true si y solo si el registro tiene valor booleano
	 */
	public boolean has_valorB(){
		return this.valorBool != null;
	}
	
	/**
	 * Devuelve true si y solo si el registro tiene valor Char
	 */
	public boolean has_valorC(){
		return this.valorChar != null;
	}

	/**
	 * Devuelve true si y solo si el registro es constante
	 */
	public boolean es_constante(){
		return this.valorEnt != null || this.valorBool!= null || this.valorChar != null || this.valorCadena!=null;
	}
	
	
	
	

}
