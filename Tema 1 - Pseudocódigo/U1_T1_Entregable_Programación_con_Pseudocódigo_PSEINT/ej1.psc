SubProceso CalculaSueldo ( h1)
	
	Si h1<=40 Entonces
		Escribir "El sueldo semanal que le corresponde es de " h1*10 " euros"
	SiNo
		Escribir "El sueldo semanal que le corresponde es de " 40*10 + (h1-40)*15 " euros"
	Fin Si
	
Fin SubProceso

Proceso sueldo_semanal
	
	Definir horas_semanales Como Entero;
	
	Escribir "Introduce el número de horas semanales"
	
	
	Repetir
		
		Leer horas_semanales;
		CalculaSueldo(horas_semanales);
	Hasta Que horas_semanales = 0;
	
	
	
	
	
FinProceso
