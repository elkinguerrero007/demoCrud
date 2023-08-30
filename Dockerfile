# Usar una imagen base con Java
FROM openjdk:11-jre

# Copiar el archivo .jar al contenedor
COPY /target/demoCrud-0.0.1-SNAPSHOT.jar  /app/demoCrud-0.0.1-SNAPSHOT.jar 

# Establecer el directorio de trabajo
WORKDIR /app

# Exponer el puerto que usa tu aplicación (si es necesario)
#EXPOSE <puerto_de_tu_aplicacion> puerto en el que tu aplicación escucha.
EXPOSE 8088

# Comando para ejecutar tu aplicación
CMD ["java", "-jar", "demoCrud-0.0.1-SNAPSHOT.jar"]
