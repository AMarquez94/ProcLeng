programa prueba4;

entero variable;

%-----------------------------------------------------------
accion dato (ref entero variable);
%-----------------------------------------------------------
booleano correcto;
    
Principio
  correcto := false;
  mq (not correcto)
	escribir("Inserte un numero menor que 10");
	leer(variable);
	si variable < 10 ent
		correcto := true;
	fsi
  fmq
Fin

Principio
   escribir("Comienzo...");
   dato(variable);
Fin
