package br.uniamerica.lar.project.larpersistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.uniamerica.lar.project.larpersistence.service.BaseService;
import br.uniamerica.lar.project.larpersistence.entitys.Usuario;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private BaseService br;

	@Test
	void contextLoads() {
		String name = "boot-";
		for (int i = 0; i < 40; i++) {
			Usuario u = new Usuario();
			u.setUsername(name + Math.floor(Math.random() + 1));
			br.save(u);
		}
	}

}
