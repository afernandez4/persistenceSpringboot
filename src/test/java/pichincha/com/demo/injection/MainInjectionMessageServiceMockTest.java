package pichincha.com.demo.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class MainInjectionMessageServiceMockTest {

	@MockBean
	private SingletonMessageService singletonMessageService;

	@Autowired
	private InjectionMain injectionMain;

	@Test
	public void testGetMessage() {
		
	}
}
