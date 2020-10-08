Proceso ej2
	
	
//	Escribe un programa que si le pasamos un entero nos devuelva ese entero al revés
//		
//	Ejemplo:
//		
//	Por favor, introduzca un número entero positivo: 123456
//		El número resultante es 654321
//		
	//	NOTA: No se pueden utilizar funciones de texto de PseInt.
	
	
	Definir num Como Entero;
	Definir aux Como Entero;
	Definir resultado Como Entero;
	
	resultado = 0
	
	Escribir "Introduce un número"
	Leer num;
	
	Mientras num <> 0 Hacer
		aux = num%10;
		num = Trunc(num/10);
		resultado = resultado*10+aux;
	Fin Mientras
	
	Escribir "El número al revés será: " resultado;
FinProceso
