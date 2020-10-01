SubProceso EsPar ( n1)
	
	Si n1%2=0 Entonces
		Escribir 'El numero ',n1,' es par"
	Sino
		Escribir 'El numero ',n1,' es impar";
	FinSi
	
Fin SubProceso

Proceso pares_impares
	Definir num Como Entero;
	Escribir "Introduce un número"
	Leer num
	
	EsPar(num);
	
FinProceso
