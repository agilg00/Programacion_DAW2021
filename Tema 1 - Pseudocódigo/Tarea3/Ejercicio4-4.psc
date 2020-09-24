Proceso Numeros_Positivos_o_Negativos
	
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	
	Escribir "Introduce un número";
	Leer num1;
	Escribir "Introduce un segundo número";
	Leer num2;
	
	Si num1 > 0 Entonces
		Escribir "EL primer número es positivo"
	SiNo
		Si num1 = 0 Entonces
			Escribir "El primer número es cero"
		FinSi
		Si num1 < 0 Entonces
			Escribir "El primer número es negativo"
			
		FinSi
		
	Fin Si
	Si num2 > 0 Entonces
		Escribir "EL segundo número es positivo"
	SiNo
		Si num2 = 0 Entonces
			Escribir "El segundo número es cero"
		FinSi
		Si num2 < 0 Entonces
			Escribir "El segundo número es negativo"
			
		FinSi
		
	Fin Si
	
FinProceso
