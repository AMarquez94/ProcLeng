%% Este programa da un error lexico porque un identificador
empieza por un n�mero %%

%--------------------------------------------------------
Programa noventa_y_nueve;
%--------------------------------------------------------

entero x,y,n,m;

%--------------------------------------------------------
Principio
%--------------------------------------------------------
        5n := 0;
        Mq (n <= 0) or (n >=100) or (n div 10 = n mod 10)
           escribir("n: ");
           leer(n);
        FMq

        escribir(n," se convierte en ");

        x := n div 10;
        y := n mod 10;
        m := 10*y + x;
        
        Si n > m ent
                n := n - m;
        si_no
                n := m - n;
		Fsi
        x := n div 10;
        y := n mod 10;
        m := 10*y + x;
        n := m + n;

        escribir(n, entacar(13), entacar(10));
Fin
