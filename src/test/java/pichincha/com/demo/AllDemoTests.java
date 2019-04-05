package pichincha.com.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pichincha.com.demo.injection.SingletonMessageServiceInjectionTest;
import pichincha.com.demo.injection.SingletonMessageServiceTest;

@RunWith(Suite.class)
//TODO:aqui se ponen todas las clases de Test separadas por una coma para que se ejecute todo el set de pruebas.
@SuiteClasses({ SingletonMessageServiceTest.class, SingletonMessageServiceInjectionTest.class })
public class AllDemoTests {

}
