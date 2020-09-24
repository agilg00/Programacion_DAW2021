Proceso Dia_mes
	Definir mes Como Entero;
	
	Escribir "Introduce el número del mes, del 1 al 12 y te diré qué mes es";
	Leer mes;
	
	Segun mes Hacer
		1:
			Si mes =1 Entonces
				Escribir "Es Enero"
			FinSi
		2:
			Si mes =2 Entonces
				Escribir "Es Febrero"
			FinSi
		3:
			Si mes =3 Entonces
				Escribir "Es Marzo"
			FinSi
		4:
			Si mes =4 Entonces
				Escribir "Es Abril"
			FinSi
		5:
			Si mes =5 Entonces
				Escribir "Es Mayo"
			FinSi
		6:
			Si mes =6 Entonces
				Escribir "Es Junio"
			FinSi
		7:
			Si mes =7 Entonces
				Escribir "Es Julio"
			FinSi
		8:
			Si mes =8 Entonces
				Escribir "Es Agosto"
			FinSi
		9:
			Si mes =9 Entonces
				Escribir "Es Septiembre"
			FinSi
		10:
			Si mes =10 Entonces
				Escribir "Es Octubre"
			FinSi
		11:
			Si mes =11 Entonces
				Escribir "Es Noviembre"
			FinSi
		12:
			Si mes =12 Entonces
				Escribir "Es Diciembre"
			FinSi
			
		De Otro Modo:
			Escribir "Error, el número introducido no es el indicado"
	Fin Segun
	
FinProceso
