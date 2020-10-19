Proceso cambia_digito
	
	Definir num, num2 Como texto;
	Definir pos Como Entero;
	Definir contador Como Entero;
	contador = 0;
	Definir resultado Como real;
	
	
	Definir num3, num4 Como Entero;
	Escribir  "Introduce un número"
	Leer num3;
	Escribir  "Introduce la posicion"
	Leer pos;
	Escribir  "Introduce el nuevo número"
	Leer num4;
	
	//usando funciones de cadenas
	
	
//	Para contador<-0 Hasta Longitud(num) Con Paso 1 Hacer
//		Si contador = pos-1 Entonces
//			Escribir sin saltar num2;
//		SiNo
//			Escribir  Sin Saltar Subcadena(num, contador, contador);
//		Fin Si
//	Fin Para
	//	Escribir " ";
	
	
	
	Mientras num3 <> 0 Hacer
		contador = Trunc(num3/10);
	Fin Mientras
	
	Escribir contador;
	
	
	
	
	
	
	
FinProceso
