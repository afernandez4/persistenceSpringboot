package pichincha.com.demo.injection;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SingletonMessageServiceTest {

	private SingletonMessageService singletonMessageServiceee;

	@Before
	public void before() {
		this.singletonMessageServiceee = new SingletonMessageService();
	}

	@Test
	public void testGetMessage() {
		assertEquals("1", this.singletonMessageServiceee.getMessage().substring(0, 1));
		assertEquals("2", this.singletonMessageServiceee.getMessage().substring(0, 1));
		System.out.println("NO HAY INJECTION");
		System.out.println(">>>>> message: " + this.singletonMessageServiceee.getMessage());
	}

}
