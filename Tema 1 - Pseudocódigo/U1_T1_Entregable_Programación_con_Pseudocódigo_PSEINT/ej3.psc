Proceso reloj_arena_asteriscos
	
	
	Definir altura Como Entero;
	Definir contador como entero;
	Definir i Como Entero;
	Definir j Como Entero;
	
	Repetir
		Escribir "Introduce la altura del reloj, que deberá ser un número impar y mayor que 3"
		Leer altura;
	Hasta Que (altura %2 <> 0) y altura >=3
	
	Para i<-0 Hasta altura -1 Con Paso 1 Hacer
		Para j<-0 Hasta altura -1 Con Paso 1 Hacer
			Si (j >= i y j <(altura -i)) o (i > altura/2 y j<= i y j >= (altura - i -1))Entonces
				Escribir Sin Saltar" * "
			SiNo
				Escribir Sin Saltar  "   "
			Fin Si
		Fin Para
		Escribir " "
	Fin Para
	

	
	
FinProceso