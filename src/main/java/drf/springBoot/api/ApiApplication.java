package drf.springBoot.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot Swagger",
				version = "1.0.0",
				description = "Spring Boot Test Project",
				termsOfService = "testBoot",
				contact = @Contact(
						name = "David Rose-Franklin",
						email = "notreal@gmail.com"
				),
				license = @License(
						name = "Licence",
						url = "testBoot"
				)
		)
)
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
