package sample.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.hibernate.boot.model.relational.Database;
import org.springframework.stereotype.Component; 
import org.apache.camel.model.rest.RestBindingMode;
import sample.camel.controller.DateExcController;
import sample.camel.model.DateExc;
@Component
public class RestRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//
//    	 from("timer:hello?period={{timer.period}}")
//         .transform(method("myBean", "compareDate"))
//         .to("mock:reply")
//         .log("${body}");
    	
    	
//    		restConfiguration()
//    		.component("servlet")
//    		.bindingMode(RestBindingMode.json)
//    		.dataFormatProperty("prettyPrint", "true");
//    			
//    		rest("/dateComp").description("User REST service")
//           .consumes("application/json")
//           .produces("application/json") 
//
//           .get().description("Find all users").outTypeList(DateExc.class)
//           .responseMessage().code(200).message("All users successfully returned").endResponseMessage()
//           .to("bean:dateExcController?method=compareDate");
//    	   
    		from("restlet:http://localhost:8080/MyRestService")
    	      .setBody(simple("bean:dateExcController?method=compareDate"))
    	      .to("stream:out");
//	@Override
//    public void configure() throws Exception {
//        // call the embedded rest service from the PetController
//		from("servlet:/hello?period={{timer.period}}")
//        .setBody(simple("Hello world!!! "))   //{{my-example.name}}
//;
//	}
	
	
//    @Override
//	public void configure() throws Exception {
//		from("jpa://sample.camel.service.DateExc?consumer.query=SELECT e FROM DateExc e where e.datxc=current_date()&consumeDelete=false&consumer.delay=7000").routeId("RestRoute")
//		.process(new Processor() {
//			@Override
//			public void process(Exchange ex) throws Exception {
//				System.out.println("Date excec  ");
//			}
//		}).to("log:Processed");
}
}


