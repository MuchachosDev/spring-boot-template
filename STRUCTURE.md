**Estructura Principal (src/main/java):**

Usando java 21 OpenJDK y Spring 2.4.0

`config/`
- Contiene las clases de configuración de Spring Boot
- Aquí defines beans, propiedades y configuraciones específicas como CORS, WebMVC, o seguridad a nivel de configuración
- Por ejemplo: `WebConfig.java`, `SecurityConfig.java`

`constants/`
- Almacena todas las constantes de la aplicación
- Ayuda a centralizar valores que se usan en múltiples lugares
- Por ejemplo: `SecurityConstants.java`, `ApiPaths.java`, `Messages.java`

`controller/`
- Maneja las peticiones HTTP y define los endpoints de la API
- Es la capa de presentación que recibe las solicitudes y delega al servicio apropiado
- Por ejemplo: `UserController.java`, `AuthController.java`

`dto/`
- Data Transfer Objects para transferir datos entre capas
- Subdividido en:
  - `request/`: Objetos para recibir datos del cliente
  - `response/`: Objetos para enviar datos al cliente
- Evita exponer directamente las entidades y permite versionar la API

`exception/`
- Contiene excepciones personalizadas y su manejo
- Permite una gestión centralizada de errores
- Por ejemplo: `BusinessException.java`, `GlobalExceptionHandler.java`

`model/`
- Define las entidades JPA que se mapean a tablas de la base de datos
- Representa el modelo de dominio de la aplicación

`repository/`
- Interfaces para acceder a la base de datos
- Extiende JpaRepository para operaciones CRUD básicas

`security/`
- Maneja la seguridad de la aplicación
- Subdividido en:
  - `filter/`: Filtros de seguridad personalizados
  - `jwt/`: Clases para manejo de tokens JWT
- Por ejemplo: `JwtTokenProvider.java`, `AuthenticationFilter.java`

`service.impl/`
- Implementa la lógica de negocio
- Coordina entre repositorios y otros servicios
- Donde reside la mayor parte de la lógica de la aplicación
- Por ejemplo: `UserServiceImpl.java`

`util/`
- Clases utilitarias y helpers
- Funciones comunes reutilizables
- Por ejemplo: `DateUtils.java`, `StringUtils.java`

`validation/`
- Validaciones personalizadas
- Anotaciones de validación y sus implementaciones
- Por ejemplo: `PasswordValidator.java`

**Recursos (src/main/resources):**

`db.migration/`
- Scripts de migración de base de datos
- Usa Flyway o Liquibase para control de versiones de BD
- Por ejemplo: `V1__create_users_table.sql`

`static/`
- Archivos estáticos (CSS, JS, imágenes)
- Recursos que se sirven directamente

`templates/`
- Plantillas si usas motor de vistas
- Por ejemplo, archivos Thymeleaf o FreeMarker

`application.properties`
- Configuración principal de la aplicación
- Propiedades de base de datos, servidor, etc.
