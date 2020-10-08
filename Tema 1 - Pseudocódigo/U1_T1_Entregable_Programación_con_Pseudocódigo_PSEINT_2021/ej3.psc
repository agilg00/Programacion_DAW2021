Proceso ej3
	
	//Nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, 
	//que debe ser un número entero impar mayor o igual que 5. 
	//Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error y volver a solicitarlo. 
	//A continuación se muestran algunos ejemplos.
	
	//La anchura de la figura siempre será de 6 caracteres.
	
//Ejemplo 1:
//Por favor, introduzca la altura (número impar mayor o igual a 5): 8
//	La altura introducida no es correcta
//	
//Ejemplo 2:
//Por favor, introduzca la altura (número impar mayor o igual a 5): 3
//	La altura introducida no es correcta
	
//Ejemplo 3:
//Por favor, introduzca la altura (número impar mayor o igual a 5): 7
//	MMMMMM
//	M    M
//	M    M
//	MMMMMM
//	M    M
//	M    M
//	MMMMMM
	
	Definir altura Como Entero;
	Definir i Como Entero;
	Definir j Como Entero;
	
	

	Repetir
		Escribir "Escribe un número, que deberá ser impar y mayor que 5"
		Leer altura
		Si (altura %2 = 0) & (altura < 5) Entonces
			Escribir "Error, el número introducido no es correcto"
		Fin Si
	Hasta Que (altura %2 <> 0) & (altura >= 5);
	
	Si (altura %2 <> 0) & (altura >= 5) Entonces
		Para i<-0 Hasta altura-1 Con Paso 1 Hacer
			Para j<-0 Hasta 5 Con Paso 1 Hacer
				Si (i = 0) | (j = 0) | (i= (altura-1)/2) | (j=5) | (i=altura-1)Entonces
					Escribir Sin Saltar"M"
				SiNo
					Escribir Sin Saltar " "
				Fin Si
			Fin Para
			Escribir " "
		Fin Para
	
	Fin Si
	
	
	
	

	
FinProceso
