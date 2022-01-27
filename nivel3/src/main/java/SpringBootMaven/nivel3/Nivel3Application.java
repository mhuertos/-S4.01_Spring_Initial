package SpringBootMaven.nivel3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Nivel3Application {

	public static void main(String[] args) {
		SpringApplication.run(Nivel3Application.class, args);
	}

}
