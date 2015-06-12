%-----------------------------------------------------------
Programa maximo_comun_divisor;
%-----------------------------------------------------------

entero m, d, a, b;

%-----------------------------------------------------------
accion dato;
%-----------------------------------------------------------
Principio
        d:=0;
        Mq d<=0
                escribir("Escribe un numero: ");
                leer(d);
                Si d<=0 ent
                        escribir("El numero debe ser postivo.");
                        % Error entacar
                        escribir (entacar (300), entacar (10));
                FSi
        FMq
Fin

%-----------------------------------------------------------
accion mcd(val entero a);
%-----------------------------------------------------------
entero r;
Principio
        r:=a mod b;
        Mq r<>0
        		% Error asignacion a una variable por valor
                a:=b;
                b:=r;
                r:=a mod b;
        FMq
		m := b;
Fin

%-----------------------------------------------------------
Principio
        dato;
        a := d;
        dato;
        b := d;
        % Error diferencia parametros por invocacion
        mcd;
        escribir("El MCD es: ", m);
        escribir (entacar (13), entacar (10));
Fin
