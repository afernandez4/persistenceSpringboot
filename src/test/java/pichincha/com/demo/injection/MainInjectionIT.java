package pichincha.com.demo.injection;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class MainInjectionIT {

	@Autowired
	private InjectionMain injectionMain;

	@Test
	public void testGetMessage() {
		int i = Integer.parseInt(this.injectionMain.getMessage().split(":")[0]);
		assertEquals(i + 1, Integer.parseInt(this.injectionMain.getMessage().split(":")[0]));
		Logger.getLogger(this.getClass().getSimpleName()).info(">>>>>> message: " + this.injectionMain.getMessage());
	}

}
