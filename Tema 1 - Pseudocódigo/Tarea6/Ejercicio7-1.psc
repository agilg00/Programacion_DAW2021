Proceso Usuario_y_contrase�a
	
	Definir nombre_usuario Como Entero;
	Definir contrase�a_usuario Como Entero;
	Definir usuario Como Entero;
	Definir contrase�a Como Entero;
	
	
	nombre_usuario = 1
	contrase�a_usuario = 1234
	
	Escribir "Introduce el usuario"
	Leer usuario;
	Mientras usuario <> nombre_usuario
		Escribir "Usuario inv�lido, introduce el usuario correcto"
		Leer usuario;
	FinMientras
	Escribir "Introduce la contrase�a"
	Leer contrase�a;
	Mientras contrase�a <> contrase�a_usuario
		Escribir "Contrase�a inv�lida, introduce la contrase�a correcta"
		Leer contrase�a
	FinMientras
	
	Escribir "Bienvenido";
	
	
	
	
FinProceso
