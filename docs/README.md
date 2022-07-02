

<h1><img src="./resources/spring-boot.png" height=100 width=100> Backend - Spring Boot</h1>



## Dependências:

-  **[Java 11 JDK](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)**
- **[Apache Maven 3.8.6](https://maven.apache.org/download.cgi)**
- **[PostgreSQL 14](https://www.postgresql.org/download/)** 
- **[pgAdmin 4](https://www.pgadmin.org/download/)** (recomendado)



## Para subir a aplicação localmente:



- Configurar as variáveis de ambiente em ***application.properties*** com os seguintes parâmetros:

  - spring.datasource.url=jdbc:postgresql://localhost:5432/public

  * spring.datasource.username=postgres

  * spring.datasource.password= (sua senha)

  * spring.jpa.show-sql=true

  * spring.jpa.hibernate.ddl-auto=update

    

- No diretório ***oikos*** executar o comando via CLI:

  ```
  
  ./mvnw clean package -DskipTests
  
  ```

- Um arquivo ***.jar*** será gerado no diretório ***target***, rode-o a partir do comando:

  ````
  
  java -jar --file-name
  
  ````



## Para parar a aplicação localmente:



* Usar o comando ``` CTRL + C ``` do teclado no CLI.