SubProceso Es_Multiplo ( n1, n2 )
	Si n1>n2 Entonces
        Si n1 MOD n2=0 Entonces
            Escribir 'El numero ',n1,' es multiplo de ',n2;
        Sino
            Escribir 'El numero ',n1,' No es multiplo de ',n2;
        FinSi
	FinSi
	
	
Fin SubProceso

Proceso EsMultiplo
	
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	
	Escribir "Introduce un número"
	Leer num1;
	Escribir "Introduce otro número"
	Leer num2;
	
	Es_Multiplo(num1, num2); 
	
FinProceso
