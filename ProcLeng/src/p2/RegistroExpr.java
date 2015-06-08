package p2;

import p2.Simbolo.Clase_parametro;
import p2.Simbolo.Tipo_variable;

public class RegistroExpr {
	
	private Integer valorEnt;
	private boolean valorBool;
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
	public void setValorEnt(int valorEnt) {
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
	
	public void introducir_entero(Token tk, int valor){
		this.tipo = Tipo_variable.ENTERO;
		this.valorEnt = valor;
		this.tk = tk;
	}
	
	public void introducir_booleano(Token tk, boolean valor){
		this.tipo = Tipo_variable.BOOLEANO;
		this.valorBool = valor;
		this.tk = tk;
	}
	
	public void introducir_char(Token tk, String valor){
		this.tipo = Tipo_variable.CHAR;
		this.valorChar = valor;
		this.tk = tk;
	}
	
	public void introducir_desconocido(Token tk){
		this.tipo = Tipo_variable.DESCONOCIDO;
		this.tk = tk;
	}
	
	public boolean es_entero(){
		return this.tipo.name().equals("ENTERO");
	}
	
	public boolean es_booleano(){
		return this.tipo.name().equals("BOOLEANO");
	}
	
	public boolean es_caracter(){
		return this.tipo.name().equals("CHAR");
	}
	
	public boolean es_desconocido(){
		return this.tipo.name().equals("DESCONOCIDO");
	}
	
	public boolean es_valor(){
		if(this.clase==null){
			return false;
		}
		else{
			return this.clase.name().equals("VAL");
		}
	}
	
	public boolean has_valor(){
		return this.valorEnt != null;
	}
	
	
	
	

}
