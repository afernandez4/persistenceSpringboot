package pichincha.com.demo.injection;

import org.springframework.stereotype.Service;

@Service
public class PrototypeInjectOnlyMessageService {

	private int cont = 1;

	public String getMessage() {
		return this.cont++ + ": PrototypeInjectOnlyMessageService!!!";
	}

}
