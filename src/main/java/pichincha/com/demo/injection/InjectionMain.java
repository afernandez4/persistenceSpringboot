package pichincha.com.demo.injection;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class InjectionMain {

	@Autowired
	private ConfigurableApplicationContext configurableApplicationContext;

	@Autowired
	private SingletonMessageService singletonMessageService;

	@Autowired
	private SingletonMessageService singletonMessageService2;

	@Autowired
	private PrototypeInjectOnlyMessageService prototypeInjectOnlyMessageService;

	@Autowired
	private PrototypeInjectOnlyMessageService prototypeInjectOnlyMessageService2;

	public String getMessage() {
		return this.singletonMessageService.getMessage();
	}

	public void debugAndClose() {
		Logger.getLogger(this.getClass().getSimpleName())
				.info(">>>>>> message: " + this.singletonMessageService.getMessage());
		Logger.getLogger(this.getClass().getSimpleName())
				.info(">>>>>> message: " + this.singletonMessageService2.getMessage());
		Logger.getLogger(this.getClass().getSimpleName())
				.info(">>>>>> message: " + this.prototypeInjectOnlyMessageService.getMessage());
		Logger.getLogger(this.getClass().getSimpleName())
				.info(">>>>>> message: " + this.prototypeInjectOnlyMessageService2.getMessage());
		this.configurableApplicationContext.close();
	}

}
