package ro.stefan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {


	@Bean
	public Docket getDocketInstance() {
		return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfoExample01())
				.select()
				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfoExample01() {
        return new ApiInfoBuilder()
                .title("API Info - Title section")
                .description("API Info - Description section")
                .version("0.0.1")
                .contact(new Contact("Stefan", "https://medium.com/@stefan.paladuta17", "test@test.com"))
                .build();
    }
	
//	private ApiInfo apiInfoExample02() {
//        return new ApiInfoBuilder()
//                .title("API Info - Title section")
//                .description("API Info - <strong>Description</strong> section <br> testing something new <br> <table> <tr><td>1</td><td>2</td></tr> <tr><td>3</td><td>4</td></tr> </table>")
//                .version("0.0.1")
//                .contact(new Contact("Stefan", "https://medium.com/@stefan.paladuta17", "test@test.com"))
//                .build();
//    }
	

}