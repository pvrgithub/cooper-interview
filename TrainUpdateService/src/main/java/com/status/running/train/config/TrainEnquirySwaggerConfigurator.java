//package com.status.running.train.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//
//public class TrainEnquirySwaggerConfigurator {	
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.apiInfo(new ApiInfo("Train Enquiry Service", "This is a train enquiry service", "1.0", 
//						"Maintained by Mr.Cooper", new Contact("Mr.Cooper", "www.mrcooper.com", "contact@mrcooper.com"),
//						"Free for All", "http://licenceURL.com", null));
//		
//	}
//}
