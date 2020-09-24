Proceso Division_Numeros
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir resultado Como Real;
	
	
	
	Escribir "Introduce el primer número";
	Leer num1;
	Mientras num1 = 0  Hacer
		Escribir "El número debe ser mayor o menor que cero, introduce el primer número";
		Leer num1;
	Fin Mientras
	Escribir "Introduce el segundo número";
	Leer num2;
	Mientras num2 = 0  Hacer
		Escribir "El número debe ser mayor o menor que cero, introduce el segundo número";
		Leer num2;
		
	Fin Mientras
	resultado = num1/num2;
	
	Escribir "El resultado de la división entre " num1 " y " num2 " es de " resultado;
	
	
	
	
	
	
	
	
	
	
	
	
FinProceso
