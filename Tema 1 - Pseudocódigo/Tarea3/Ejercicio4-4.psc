Proceso Numeros_Positivos_o_Negativos
	
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	
	Escribir "Introduce un n�mero";
	Leer num1;
	Escribir "Introduce un segundo n�mero";
	Leer num2;
	
	Si num1 > 0 Entonces
		Escribir "EL primer n�mero es positivo"
	SiNo
		Si num1 = 0 Entonces
			Escribir "El primer n�mero es cero"
		FinSi
		Si num1 < 0 Entonces
			Escribir "El primer n�mero es negativo"
			
		FinSi
		
	Fin Si
	Si num2 > 0 Entonces
		Escribir "EL segundo n�mero es positivo"
	SiNo
		Si num2 = 0 Entonces
			Escribir "El segundo n�mero es cero"
		FinSi
		Si num2 < 0 Entonces
			Escribir "El segundo n�mero es negativo"
			
		FinSi
		
	Fin Si
	
FinProceso
