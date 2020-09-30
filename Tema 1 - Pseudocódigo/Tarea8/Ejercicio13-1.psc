SubProceso EscribirCentrado (texto)
	
	Definir num_espacios Como Real;
	Definir i Como Entero;
	num_espacios <- redon(40 - Longitud(texto)/2)
	
	Para i<-0 Hasta num_espacios Con Paso 1 Hacer
		Escribir Sin Saltar " "
	Fin Para
	Escribir  texto
Fin SubProceso


Proceso Subprocesos

	Escribir "Hola"
	EscribirCentrado("Lleva la tarara un vestido blanco lleno de cascabeles")
	Escribir "Adios"
FinProceso
