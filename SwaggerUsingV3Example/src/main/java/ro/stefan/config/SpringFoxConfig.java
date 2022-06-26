package ro.stefan.config;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Server;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {

	@Bean
	public Docket getDocketForDev() {
		final Set<String> produces = new HashSet<String>();
		produces.add(MediaType.APPLICATION_JSON_VALUE);
		produces.add(MediaType.APPLICATION_XML_VALUE);

		Server serverLocal = new Server("local", "http://localhost:8080", "for local usages", Collections.emptyList(), Collections.emptyList());
        Server testServer = new Server("test", "https://example.org", "for testing", Collections.emptyList(), Collections.emptyList());
        
		return new Docket(DocumentationType.OAS_30)
				.apiInfo(new ApiInfoBuilder()
						.title("Note API")
						.description("A CRUD API to demonstrate Springfox 3 integration")
						.version("0.0.1")
						.license("MIT")
						.licenseUrl("https://opensource.org/licenses/MIT")
						.build())
				.produces(produces).consumes(produces)
				.servers(serverLocal, testServer)
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.build();
	}
	
	

}