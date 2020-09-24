Proceso Numero_Azar
	
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir suma Como Entero;
	Definir numusuario Como Entero;
	num1 <- Azar (101);
	num2 <- Azar (101);
	
	
	
	suma = num1 + num2;
	
	Escribir "Averigua la suma entre " num1 " y " num2 
	Leer numusuario;
	
	Mientras numusuario <> suma Hacer
		Escribir "Fallaste, prueba otra vez"
		Leer numusuario;
	Fin Mientras
	Escribir "Enhorabuena!"
	
	
	
FinProceso
