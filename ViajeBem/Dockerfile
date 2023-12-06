# Use uma imagem base do Java
FROM openjdk:latest

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR do seu aplicativo para o contêiner
COPY target/primeiro-exemplo-0.0.1-SNAPSHOT.jar /app/app.jar

# Comando para executar o aplicativo quando o contêiner for iniciado
CMD ["java", "-jar", "app.jar"]
