package pichincha.com.demo.injection;

import java.util.logging.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class InjectionConfig {

	@Bean
	@Scope("prototype")
	public PrototypeInjectOnlyMessageService prototypeInjectOnlyMessageService() {
		Logger.getLogger("DEMO Spring: " + this.getClass().getSimpleName())
				.info(">>>>>> Se crea el Bean PrototypeInjectOnlyMessageService <<<<<<<");
		return new PrototypeInjectOnlyMessageService();
	}

}
