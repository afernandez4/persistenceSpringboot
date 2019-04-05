package pichincha.com.demo.daos;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import pichincha.com.demo.entities.Persona;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class PersonaDaoIT {

	@Autowired
	private PersonaDao personaDao;

	@Test
	public void testFindByNombres() {
		assertNotNull(personaDao.findByNombres("Carlos Andrés"));
	}

	@Test
	public void testCreatePersona() {
		Persona p = new Persona();
		p.setNombres("Carlos");
		p.setApellidos("Paredes");
		assertNotNull(personaDao.save(p));
	}
	
	@Test
	public void testFindByNombresAndApellidos() {
		assertNotNull(personaDao.findByNombresAndApellidos("Carlos", "Paredes"));
	}
	
}
