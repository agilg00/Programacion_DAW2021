Proceso Ej1
	
	
	Escribir "Introduce números positivos, cuando introduzcas uno negativo, pararé y realizo la media de los impares y mostraré el mayor de los pares";
	
	Definir num Como Entero;
	Definir total Como Entero;
	Definir media Como Real;
	Definir contador Como Entero;
	Definir mayor Como Entero;
	
	
	total = 0;
	contador = 0;
	mayor = 0;
	
	Repetir
		leer num
		
		Si num > 0  y (num %2 <> 0) Entonces
			total= total + num
		SiNo
			total = total + 0;
		Fin Si
		
		Si num > total y (num %2 = 0) Entonces
			mayor = mayor + num
		SiNo
			mayor = mayor + 0
		Fin Si
		
		contador = contador +1;
	Hasta Que num < 0
	
	media = total / (contador-1)
	
	Escribir "Media de los números impares: " media;
	Escribir "Mayor de los pares: " mayor;
	
	
	
	
	
FinProceso
