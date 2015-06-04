Programa p;
entero i, j, m, a1;
booleano fallo, semos, hambre;

%-----------------------------------------------------------
accion mcd(Val entero  a,b ; ref  entero  m );
%-----------------------------------------------------------
entero r;
Principio
        r:=a mod b;
		  
        Mq r<>0
                a:=b;
                b:=r;
                r:=a mod b;
        FMq
		m := b;
Fin

%-----------------------------------------------------------
Principio
		 a1:=1;
		  hombre:=1;
		  dato(hombre);
        dato(i);
        dato(j);
        mcd (i,j,m);
		  mcd(i,j,m*i);
		  ccd(i,j,m);
		  mcd;
        escribir("El MCD es: ", m);
        escribir (entacar (13), entacar (10));
Fin
