Proceso ej2
	
	
//	Escribe un programa que si le pasamos un entero nos devuelva ese entero al rev�s
//		
//	Ejemplo:
//		
//	Por favor, introduzca un n�mero entero positivo: 123456
//		El n�mero resultante es 654321
//		
	//	NOTA: No se pueden utilizar funciones de texto de PseInt.
	
	
	Definir num Como Entero;
	Definir aux Como Entero;
	Definir resultado Como Entero;
	
	resultado = 0
	
	Escribir "Introduce un n�mero"
	Leer num;
	
	Mientras num <> 0 Hacer
		aux = num%10;
		num = Trunc(num/10);
		resultado = resultado*10+aux;
	Fin Mientras
	
	Escribir "El n�mero al rev�s ser�: " resultado;
FinProceso
