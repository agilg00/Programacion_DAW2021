Proceso Suma_pares
	
	Definir  num1 Como Entero;
	Definir num2 Como Entero;
	Definir resultado Como Entero;
	
	Escribir "Introduce un número"
	Leer num1
	Escribir "Introduce otro número"
	Leer num2;
	resultado = num1 + num2;
	Escribir num1 " + " num2 " = " resultado;
	
	Mientras (num1 <> 0 y num2 <> 0) o (num1 + num2 <> 0)
		
		Escribir "Introduce un número"
		Leer num1
		Escribir "Introduce otro número"
		Leer num2;
		resultado = num1 + num2;
		Escribir num1 " + " num2 " = " resultado;
	
	FinMientras
	
	
	
	
	
	
FinProceso
