package ro.stefan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {


	@Bean
	public Docket api3() {
		// here tags is optional, it just adds a description in the UI
		// by default description is class name, so if you use same tag using 
		// `@Api` on different classes it will pick one of the class name as 
		// description, so better define your own description for them
		return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
				.tags(new Tag("security", "security related"), 
				          new Tag("loan", "loan related"))
				.select()
				.apis(RequestHandlerSelectors.basePackage("ro.stefan.external.apis"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Openapi OAS3 with springfox ")
                .description("Code first approach")
                .version("1.0.0")
                .contact(new Contact("Marone", "https://wstutorial.com", "test@wstutorial.com"))
                .build();
    }
	
}