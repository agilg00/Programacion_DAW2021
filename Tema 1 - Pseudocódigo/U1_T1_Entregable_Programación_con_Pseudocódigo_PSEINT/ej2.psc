Proceso cambia_digito
	
	Definir num, num2 Como texto;
	Definir pos Como Entero;
	Definir contador Como Entero;
	contador = 0;
	
	Escribir  "Introduce un número"
	Leer num;
	Escribir  "Introduce la posicion"
	Leer pos;
	Escribir  "Introduce el nuevo número"
	Leer num2;
	
	Escribir Longitud(num)
	
	
	
	Para contador<-0 Hasta Longitud(num) Con Paso 1 Hacer
		Si contador = pos-1 Entonces
			Escribir sin saltar num2;
		SiNo
			Escribir  Sin Saltar Subcadena(num, contador, contador);
		Fin Si
	Fin Para
	Escribir " ";
	
	
FinProceso
