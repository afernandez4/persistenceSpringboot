package pichincha.com.demo.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pichincha.com.demo.entities.Persona;

public interface PersonaDao extends JpaRepository<Persona, Integer> {
	
	List<Persona> findByNombres(String nombres);
	
	List<Persona> findByNombresAndApellidos(String nombres, String apellidos);

	Persona findById(int id);
}
