package pichincha.com.demo.injection;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//@Service por defecto es singleton.
//@Service("prototype") es de tipo statefull
//Si quiero darle un nombre poner @Service(value="elNombre")

@Service
public class SingletonMessageService {

	@Value("${msg.nombre}") // toma del archivo de propiedades, siempre toma del properties por defecto
							// ubicado en el src/main/resources/application.properties
	private String nombre;

	private int count = 1;

	@PostConstruct
	public void constructor() {
		Logger.getLogger("DEMO Spring: " + this.getClass().getSimpleName())
				.info(">>>>>> SingletonMessageService PostConstruct <<<<<<<");
	}

	public String getMessage() {
		return this.count++ + ": SingletonMessageService!! con nombre: " + this.nombre;
	}

	@PreDestroy
	public void destroy() {
		Logger.getLogger("DEMO Spring: " + this.getClass().getSimpleName())
				.info("======== SingletonMessageService PreDestroy ========");
	}
	
}
