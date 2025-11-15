package es.module.users.api;

import es.module.users.api.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ModuleUsersApplication {
	public static void main(String[] args) {
		SpringApplication.run(ModuleUsersApplication.class, args);
	}
}
