## Boilerplate Spark-Velocity-Hibernate

Requisitos de software previamente instalado:

	+ Java 1.8
	+ SBT
	+ NodeJS - NPM - Gulp

Instalación de dependencias:

	$ sbt eclipse && npm install && bower install
	$ sbt
		> run 

### Generar 'dist'
	
	$ gulp layout && gulp app && gulp error-css
	
### Arrancar el servidor

	$ sbt
	> run -Dhttp.port=8080
	
### Rutas

+ GET /estacion/listar -> EstacionController#listar | REST

### Fuentes externas:

+ https://stackoverflow.com/questions/8205067/how-do-i-change-the-default-port-9000-that-play-uses-when-i-execute-the-run

### TODO

+ E

---

 Thanks/Credits

    Pepe Valdivia: developer Software Web Perú [http://softweb.pe]