package ro.stefan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
	
	@Bean
	public Docket api1() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("address")
				.select()
				.apis(RequestHandlerSelectors.basePackage("ro.stefan.external.apis.address"))
				.paths(PathSelectors.any())
				.build();
	}


	@Bean
	public Docket api2() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("accouting")
				.select()
				.apis(RequestHandlerSelectors.basePackage("ro.stefan.external.apis.accounting"))
				.paths(PathSelectors.any())
				.build();
	}
	
	
}