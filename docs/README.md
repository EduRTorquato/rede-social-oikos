

## Para subir a aplicação localmente



- Configurar as variáveis de ambiente em ***application.properties*** com os seguintes parâmetros:

  - spring.datasource.url=jdbc:postgresql://localhost:5432/

  * spring.datasource.username=postgres

  * spring.datasource.password=

    

- No diretório ***oikos*** executar o comando via CLI:

  ```
  
  ./mvnw clean package -DskipTests
  
  ```

- Um executável ***.jar*** será gerado do diretório ***target***, rode-o a partir do comando:

  ````
  
  java -jar --file-name
  
  ````





## Para para a aplicação localmente



* Usar o comando ``` CTRL + C ``` do teclado no CLI.