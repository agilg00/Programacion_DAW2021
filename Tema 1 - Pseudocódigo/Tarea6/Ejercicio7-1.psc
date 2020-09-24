Proceso Usuario_y_contraseña
	
	Definir nombre_usuario Como Entero;
	Definir contraseña_usuario Como Entero;
	Definir usuario Como Entero;
	Definir contraseña Como Entero;
	
	
	nombre_usuario = 1
	contraseña_usuario = 1234
	
	Escribir "Introduce el usuario"
	Leer usuario;
	Mientras usuario <> nombre_usuario
		Escribir "Usuario inválido, introduce el usuario correcto"
		Leer usuario;
	FinMientras
	Escribir "Introduce la contraseña"
	Leer contraseña;
	Mientras contraseña <> contraseña_usuario
		Escribir "Contraseña inválida, introduce la contraseña correcta"
		Leer contraseña
	FinMientras
	
	Escribir "Bienvenido";
	
	
	
	
FinProceso
