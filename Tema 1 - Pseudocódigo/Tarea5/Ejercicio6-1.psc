Proceso Contraseña
	Definir contraseñaCorrecta Como Entero;
	
	contraseñaCorrecta = 1234;
	
	Definir contrasena Como Entero;
	
	Escribir "Introduce la contraseña";
	Escribir "Pista: Tiene 4 dígitos"
	Leer contrasena;
	
	Mientras contraseñaCorrecta <> contrasena  Hacer
		Escribir "Contraseña incorrecta!"
		Leer contrasena
	Fin Mientras
	
	Escribir "Bienvenido"
	
	
	
	
FinProceso
