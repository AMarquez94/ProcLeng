/**
 * Autor: Alejandro Marquez Ferrer
 * NIP: 566400
 */

package tProcLen;

public class Constants {

	 /* tipos de tokens */
    static int numPrograma = 0;
    static int numFinPrograma = 0;
    static int numVar = 0;
    static int numAnd = 0;
	static int numOr = 0;
	static int numNot = 0;
	static int numPrincipio = 0;
	static int numFin = 0;
	static int numSi = 0;
	static int numEnt = 0;
	static int numSi_No = 0;
	static int numFSI = 0;
	static int numMQ = 0;
	static int numFMQ = 0;
	static int numEscribir = 0;
	static int numLeer = 0;
	static int numMod = 0;
	static int numDiv = 0;
	static int numEntero = 0;
	static int numBooleano = 0;
	static int numCaracter = 0;
	static int numTrue = 0;
	static int numFalse = 0;
	static int numEntacar = 0;
	static int numCaraent = 0;
	static int numAccion = 0;
	static int numVal = 0;
	static int numRef = 0;
	static int numMayor = 0;
	static int numMenor = 0;
	static int numIgual = 0;
	static int numMai = 0;
	static int numMei = 0;
	static int numNi = 0;
	static int numOpas = 0;
	static int numIdentificador = 0;
	static int numCarac = 0;
	static int numCadena = 0;
	static int numNumero = 0;
	static int numMas = 0;
	static int numMenos = 0;
	static int numPor = 0;
	static int numDivision = 0;
	static int numPariz = 0;
	static int numParder = 0;
	static int numComa = 0;
	static int numPuntcom = 0;

	/* Tipos estructuras */
	static int numVariables = 0;
	static int numAcciones = 0;
	static int numOpEscribir = 0;
	static int numAsignar = 0;
	static int numInvocar = 0;
	static int numif = 0;
	static int numBucles = 0;
	static int numParametros = 0;
	static int numExpresiones = 0;
	static int numExpresionesS = 0;
	static int numOpRel = 0;
	static int numOpAdd = 0;
	static int numOpMul = 0;
	static int numFactor = 0;
	static int numTermino = 0;
	
	
	/**
	 * Imprimir por pantalla las estadisticas propias del analizador lexico
	 */
	public static void printLexical(){
		System.out.println("Analisis lexico finalizado sin errores");
	      System.out.printf("Token programa: reconocido %d veces%n",numPrograma);
	      System.out.printf("Token finPrograma: reconocido %d veces%n",numFinPrograma);
	      System.out.printf("Token var: reconocido %d veces%n",numVar);
	      System.out.printf("Token and: reconocido %d veces%n",numAnd);
	      System.out.printf("Token or: reconocido %d veces%n",numOr);
	      System.out.printf("Token programa: reconocido %d veces%n",numNot);
	      System.out.printf("Token principio: reconocido %d veces%n",numPrincipio);
	      System.out.printf("Token fin: reconocido %d veces%n",numFin);
	      System.out.printf("Token si: reconocido %d veces%n",numSi);
	      System.out.printf("Token ent: reconocido %d veces%n",numEnt);
	      System.out.printf("Token Si_No: reconocido %d veces%n",numSi_No);
	      System.out.printf("Token FSI: reconocido %d veces%n",numFSI);
	      System.out.printf("Token MQ: reconocido %d veces%n",numMQ);
	      System.out.printf("Token FMQ: reconocido %d veces%n",numFMQ);
	      System.out.printf("Token escribir: reconocido %d veces%n",numEscribir);
	      System.out.printf("Token leer: reconocido %d veces%n",numLeer);
	      System.out.printf("Token mod: reconocido %d veces%n",numMod);
	      System.out.printf("Token div: reconocido %d veces%n",numDiv);
	      System.out.printf("Token entero: reconocido %d veces%n",numEntero);
	      System.out.printf("Token booleano: reconocido %d veces%n",numBooleano);
	      System.out.printf("Token caracter: reconocido %d veces%n",numCaracter);
	      System.out.printf("Token true: reconocido %d veces%n",numTrue);
	      System.out.printf("Token false: reconocido %d veces%n",numFalse);
	      System.out.printf("Token entacar: reconocido %d veces%n",numEntacar);
	      System.out.printf("Token caraent: reconocido %d veces%n",numCaraent);
	      System.out.printf("Token accion: reconocido %d veces%n",numAccion);
	      System.out.printf("Token val: reconocido %d veces%n",numVal);
	      System.out.printf("Token ref: reconocido %d veces%n",numRef);
	      System.out.printf("Token mayor: reconocido %d veces%n",numMayor);
	      System.out.printf("Token menor: reconocido %d veces%n",numMenor);
	      System.out.printf("Token igual: reconocido %d veces%n",numIgual);
	      System.out.printf("Token mai: reconocido %d veces%n",numMai);
	      System.out.printf("Token mei: reconocido %d veces%n",numMei);
	      System.out.printf("Token ni: reconocido %d veces%n",numNi);
	      System.out.printf("Token opas: reconocido %d veces%n",numOpas);
	      System.out.printf("Token identificador: reconocido %d veces%n",numIdentificador);
	      System.out.printf("Token carac: reconocido %d veces%n",numCarac);
	      System.out.printf("Token cadena: reconocido %d veces%n",numCadena);
	      System.out.printf("Token numero: reconocido %d veces%n",numNumero);
	      System.out.printf("Token mas: reconocido %d veces%n",numMas);
	      System.out.printf("Token menos: reconocido %d veces%n",numMenos);
	      System.out.printf("Token por: reconocido %d veces%n",numPor);
	      System.out.printf("Token division: reconocido %d veces%n",numDivision);
	      System.out.printf("Token parentesis_izq: reconocido %d veces%n",numPariz);
	      System.out.printf("Token parentesis_der: reconocido %d veces%n",numParder);
	      System.out.printf("Token coma: reconocido %d veces%n",numComa);
	      System.out.printf("Token punto_y_coma: reconocido %d veces%n",numPuntcom);
	}
	
	/**
	 * Imprimir por pantalla las estadisticas propias del analizador sintactico
	 */
	public static void printSyntactic(){
		 System.out.println("Analisis sintactico finalizado sin errores");
	      System.out.printf("Se han reconocido %d variables%n",numVariables);
	      System.out.printf("Se han declarado %d funciones auxiliares%n",numAcciones);
	      System.out.printf("Se han escrito %d operaciones de escritura%n",numOpEscribir);
	      System.out.printf("Se han escrito %d operaciones de asignacion%n",numAsignar);
	      System.out.printf("Se han realizado %d invocaciones a funciones%n",numInvocar);
	      System.out.printf("El programa contiene %d ifs%n",numif);
	      System.out.printf("El programa contiene %d bucles%n",numBucles);
	      System.out.printf("Se han reconocido %d parametros%n",numParametros);
	      System.out.printf("Se han reconocido %d expresiones%n",numExpresiones);
	      System.out.printf("Se han reconocido %d expresiones simples%n",numExpresionesS);
	      System.out.printf("Se han utilizado %d operadores relacionales%n",numOpRel);
	      System.out.printf("Se han utilizado %d operadores aditivos%n",numOpAdd);
	      System.out.printf("Se han utilizado %d operadores multiplicativos%n",numOpMul);
	      System.out.printf("Se han reconocido %d factores%n",numFactor);
	      System.out.printf("Se han utilizado %d terminos%n",numTermino);
	}
}
