package com.crudapplication.apicrud;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication


@OpenAPIDefinition(info = @Info(title="Sudharsan",
        description="Sample Employee Details",
        summary="Sample Summary",
        termsOfService="Terms and conditions..",
        contact = @Contact(name="Sample", email="Sample@email", url = "sample.url"),
        version = "Api/V1"),
        servers={
                @Server (description = "sampleEnv",url="http://localhost:8080"),
                @Server(description = "sampleEnv2",url="http://localhost:8080")
                },
        security=@SecurityRequirement(name="SampleSecurity")
)
@SecurityScheme(name="SampleSecurity",
        in=SecuritySchemeIn.HEADER,
        type = SecuritySchemeType.HTTP,
        bearerFormat = "Bearer",
        description = "Sample basic security")

public class ApicrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApicrudApplication.class, args);

    }
//
//    @Bean
//    public OpenAPI openApi() {
//        Info info=new Info().description("EMPLOYEE MANAGEMENT").title("Sudharsan").version("v2");
//        return new OpenAPI().info(info);
//    }
//
    
}

