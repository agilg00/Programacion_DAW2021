Proceso Dias_semana
	
	Definir dia Como Entero;
	
	Escribir "Introduce un d�a de la semana, del 1 al 7 y te dir� qu� d�a es";
	Leer dia;
	
	Segun dia Hacer
		1:
			Si dia =1 Entonces
				Escribir "Es Lunes"
			FinSi
		2:
			Si dia =2 Entonces
				Escribir "Es Martes"
			FinSi
		3:
			Si dia =3 Entonces
				Escribir "Es Mi�rcoles"
			FinSi
		4:
			Si dia =4 Entonces
				Escribir "Es Jueves"
			FinSi
		5:
			Si dia =5 Entonces
				Escribir "Es Viernes"
			FinSi
		6:
			Si dia =6 Entonces
				Escribir "Es S�bado"
			FinSi
		7:
			Si dia =7 Entonces
				Escribir "Es Domingo"
			FinSi
		
		De Otro Modo:
			Escribir "Error, el n�mero introducido no es el indicado"
	Fin Segun
FinProceso
