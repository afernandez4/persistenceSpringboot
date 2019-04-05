package pichincha.com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pichincha.com.demo.injection.InjectionMain;

//@Component, @Service y @Bean son Beans

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private InjectionMain injectionMain;
	
	
	//mvn clean spring-boot:run para arrancar la app
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
