package ro.stefan.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Response;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
	
	/* Chapter 1 Producing and Consuming */
//	@Bean
//	public Docket getDocketInstanceEx1() {
//		final Set<String> produces = new HashSet<String>();
//		produces.add(MediaType.APPLICATION_JSON_VALUE);
//		produces.add(MediaType.APPLICATION_XML_VALUE);
//		produces.add("Stefan's custom mapping value");
//		
//		return new Docket(DocumentationType.SWAGGER_2)
//				.produces(produces)
//				.consumes(produces)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
//				.paths(PathSelectors.any())
//				.build();
//	}
	
	/* Chapter 2 - Alter the general response */
//	@Autowired
//	private TypeResolver typeResolver;
//	
//	@Bean
//	public Docket getDocketInstanceEx1() {
//		final Set<String> produces = new HashSet<String>();
//		produces.add(MediaType.APPLICATION_JSON_VALUE);
//		produces.add(MediaType.APPLICATION_XML_VALUE);
//		
//		return new Docket(DocumentationType.SWAGGER_2)
//				.produces(produces)
//				.consumes(produces)
//				.additionalModels(typeResolver.resolve(Author.class))
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
//				.paths(PathSelectors.any())
//				.build();
//	}
	
	
	/* Chapter 3 - Global default example with header */
//	@Autowired
//	private TypeResolver typeResolver;
//	
//	@Bean
//	public Docket getDocketInstanceEx1() {
//		final Set<String> produces = new HashSet<String>();
//		produces.add(MediaType.APPLICATION_JSON_VALUE);
//		produces.add(MediaType.APPLICATION_XML_VALUE);
//		
//		List<RequestParameter> listRequestParamters = new ArrayList<RequestParameter>();
//		RequestParameter requestParamterToken = new RequestParameterBuilder()
//	            .name("ACCESS_TOKEN")
//	            .required(true)
//	            .query(q -> q.model(modelSpecificationBuilder -> modelSpecificationBuilder.scalarModel(ScalarType.STRING)))
//	            .in(ParameterType.HEADER)
//	            .build();
//		
//		listRequestParamters.add(requestParamterToken);
//		return new Docket(DocumentationType.SWAGGER_2)
//				.produces(produces)
//				.consumes(produces)
//				.globalRequestParameters(listRequestParamters)
//				.additionalModels(typeResolver.resolve(Author.class))
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
//				.paths(PathSelectors.any())
//				.build();
//	}
	
	/* Chapter 3 - Global default example with query parameter */
//	@Autowired
//	private TypeResolver typeResolver;
//	
//	@Bean
//	public Docket getDocketInstanceEx1() {
//		final Set<String> produces = new HashSet<String>();
//		produces.add(MediaType.APPLICATION_JSON_VALUE);
//		produces.add(MediaType.APPLICATION_XML_VALUE);
//		
//		List<RequestParameter> listRequestParamters = new ArrayList<RequestParameter>();
//		RequestParameter limitParameter = new RequestParameterBuilder()
//	            .name("limit")
//	            .required(false)
//	            .query(q -> q.model(modelSpecificationBuilder -> modelSpecificationBuilder.scalarModel(ScalarType.STRING)))
//	            .in(ParameterType.QUERY)
//	            .build();
//		RequestParameter pagesParameter = new RequestParameterBuilder()
//	            .name("pages")
//	            .required(false)
//	            .query(q -> q.model(modelSpecificationBuilder -> modelSpecificationBuilder.scalarModel(ScalarType.STRING)))
//	            .in(ParameterType.QUERY)
//	            .build();
//		listRequestParamters.add(limitParameter);
//		listRequestParamters.add(pagesParameter);
//		
//		return new Docket(DocumentationType.SWAGGER_2)
//				.produces(produces)
//				.consumes(produces)
//				.globalRequestParameters(listRequestParamters)
//				.additionalModels(typeResolver.resolve(Author.class))
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
//				.paths(PathSelectors.any())
//				.build();
//	}	
	
	/* Chapter 3 - Global default example with cookie */
//	@Autowired
//	private TypeResolver typeResolver;
//	
//	@Bean
//	public Docket getDocketInstanceEx1() {
//		final Set<String> produces = new HashSet<String>();
//		produces.add(MediaType.APPLICATION_JSON_VALUE);
//		produces.add(MediaType.APPLICATION_XML_VALUE);
//		
//		List<RequestParameter> listRequestParamters = new ArrayList<RequestParameter>();
//		RequestParameter timeSpentInApp = new RequestParameterBuilder()
//	            .name("TIME_SPENT_IN_APP")
//	            .required(false)
//	            .query(q -> q.model(modelSpecificationBuilder -> modelSpecificationBuilder.scalarModel(ScalarType.STRING)))
//	            .in(ParameterType.COOKIE)
//	            .build();
//		RequestParameter isUserLoggedCookie = new RequestParameterBuilder()
//	            .name("IS_USER_LOGGED")
//	            .required(false)
//	            .query(q -> q.model(modelSpecificationBuilder -> modelSpecificationBuilder.scalarModel(ScalarType.STRING)))
//	            .in(ParameterType.COOKIE)
//	            .build();
//		listRequestParamters.add(timeSpentInApp);
//		listRequestParamters.add(isUserLoggedCookie);
//		
//		return new Docket(DocumentationType.SWAGGER_2)
//				.produces(produces)
//				.consumes(produces)
//				.globalRequestParameters(listRequestParamters)
//				.additionalModels(typeResolver.resolve(Author.class))
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
//				.paths(PathSelectors.any())
//				.build();
//	}	


	/* Chapter 4 - Global response default */
//	@Bean
//	public Docket getDocketInstanceEx1() throws JsonProcessingException {
//		List<Response> listResponses = new ArrayList<Response>();
//		
//		class ServerError{
//			private String serverIp;
//			private String serverName;
//			private String errorMsg;
//			private String errorStack;
//			
//			public String getServerIp() {
//				return serverIp;
//			}
//			public void setServerIp(String serverIp) {
//				this.serverIp = serverIp;
//			}
//			public String getServerName() {
//				return serverName;
//			}
//			public void setServerName(String serverName) {
//				this.serverName = serverName;
//			}
//			public String getErrorMsg() {
//				return errorMsg;
//			}
//			public void setErrorMsg(String errorMsg) {
//				this.errorMsg = errorMsg;
//			}
//			public String getErrorStack() {
//				return errorStack;
//			}
//			public void setErrorStack(String errorStack) {
//				this.errorStack = errorStack;
//			}
//			
//		}
//		
//		ObjectMapper objMapper = new ObjectMapper();
//		listResponses.add(new ResponseBuilder().code("500").description(objMapper.writeValueAsString(new ServerError())).build());
//		listResponses.add(new ResponseBuilder().code("403").description("Forbidden!!!!!").build());
//
//    
//		return new Docket(DocumentationType.SWAGGER_2)		
//				.useDefaultResponseMessages(false)
//				.globalResponses(HttpMethod.GET,listResponses)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
//				.paths(PathSelectors.any())
//				.build();
//	}
	
	/* Chapter 4 - Global response default example 2*/
	@Bean
	public Docket getDocketInstanceEx1() throws JsonProcessingException {
		List<Response> listResponses = new ArrayList<Response>();
		
		class ServerError{
			private String serverIp;
			private String serverName;
			private String errorMsg;
			private String errorStack;
			
			public String getServerIp() {
				return serverIp;
			}
			public void setServerIp(String serverIp) {
				this.serverIp = serverIp;
			}
			public String getServerName() {
				return serverName;
			}
			public void setServerName(String serverName) {
				this.serverName = serverName;
			}
			public String getErrorMsg() {
				return errorMsg;
			}
			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}
			public String getErrorStack() {
				return errorStack;
			}
			public void setErrorStack(String errorStack) {
				this.errorStack = errorStack;
			}
			
		}
		
		ObjectMapper objMapper = new ObjectMapper();
		listResponses.add(new ResponseBuilder().code("500").description(objMapper.writeValueAsString(new ServerError())).build());
		listResponses.add(new ResponseBuilder().code("403").description("Forbidden!!!!!").build());

    
		return new Docket(DocumentationType.SWAGGER_2)		
				.useDefaultResponseMessages(false)
				.globalResponses(HttpMethod.GET,listResponses)
				.select()
				.apis(RequestHandlerSelectors.basePackage("ro.stefan.controller"))
				.paths(PathSelectors.any())
				.build();
	}
}