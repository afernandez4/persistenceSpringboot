package pichincha.com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

//TODO: esta clase estoy usando para permitir la creacion de Beans (override)
public class ProccesorCustom implements EnvironmentPostProcessor {

	@Override
	public void postProcessEnvironment(final ConfigurableEnvironment environment, final SpringApplication application) {
		application.setAllowBeanDefinitionOverriding(true);
	}
}
