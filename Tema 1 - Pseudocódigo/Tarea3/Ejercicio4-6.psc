Proceso Tres_numeros
	
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir num3 Como Entero;
	
	Escribir "Introduce 3 números, y te diré cuál es el mayor de los 3"
	Escribir "Introduce el primer número"
	Leer num1;
	Escribir "Introduce el segundo número"
	Leer num2;
	Escribir "Introduce el tercer número"
	Leer num3;
	
	Si num1 > num2  y num1 > num3 Entonces
		Escribir "El primer número, " num1 " es el mayor de los tres";
	SiNo
		Si num2 > num1 y num2 > num3 Entonces
			Escribir "El segundo número, " num2 " es el mayor de los tres"
		FinSi
		Si num3 > num1 y num3 > num2 Entonces
			Escribir "El tercer número, " num3 " es el mayor de los tres"
			
		FinSi
		
	Fin Si
	
	
FinProceso
