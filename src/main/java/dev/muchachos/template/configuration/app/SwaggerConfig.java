package dev.muchachos.template.configuration.app;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import java.util.Map;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Sistema Gestion Empresarial ERP API",
                version = "v0.1",
                description = "API para gestionar areas internas de las empresas (ERP).",
                contact = @Contact(
                        name = "MuchachosDev",
                        url = "https://www.muchachos.dev"
                )
        ),
        servers = {
        @Server(
                description = "DEV SERVER",
                url = "http://localhost:8080/"
        )
        },
        security = {
                @SecurityRequirement(
                        name = "Security token"
                )
        }
)

@SecurityScheme(
        name = "Security token",
        description = "Access Token For My Api",
        type = SecuritySchemeType.HTTP,
        paramName = HttpHeaders.AUTHORIZATION,
        in = SecuritySchemeIn.HEADER,
        scheme = "bearer",
        bearerFormat = "JWT"
)
public class SwaggerConfig {

}
