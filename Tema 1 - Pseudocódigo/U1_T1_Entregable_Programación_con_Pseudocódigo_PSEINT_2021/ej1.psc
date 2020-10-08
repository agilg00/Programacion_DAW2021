SubProceso CalculaPrecio ( h1)
	
	Si h1<=100 Entonces
		Escribir "El precio total de las unidades será de " h1*5.23 " euros"
	SiNo
		Si h1>100 | h1 <=1000 Entonces
			Escribir "El precio total de las unidades será de " 100 * 5.23 + (h1-100)*4.16 " euros"
		SiNo
			Si h1>1000 Entonces
				Escribir "El precio total de las unidades será de " (100 * 5.23 + (h1-1000)*(5.23/2)) " euros"
			FinSi
		Fin Si
	FinSi
	
Fin SubProceso

Proceso ej1
	
	Definir num_productos Como Entero;
	
	Escribir "Introduce el número de productos"
	
	
	Repetir
		
		Leer num_productos;
		CalculaPrecio(num_productos);
	Hasta Que num_productos = 0;
	
	
	
	
	
FinProceso