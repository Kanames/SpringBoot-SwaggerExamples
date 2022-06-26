package ro.stefan.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
	
	@Bean
	public Docket getDocketInstanceEx1() {
		final Set<String> produces = new HashSet<String>();
		produces.add(MediaType.APPLICATION_JSON_VALUE);
		produces.add(MediaType.APPLICATION_XML_VALUE);
		
		return new Docket(DocumentationType.SWAGGER_2)
				.produces(produces)
				.consumes(produces)
				.select()
				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
				.paths(PathSelectors.any())
				.build();
	}

}