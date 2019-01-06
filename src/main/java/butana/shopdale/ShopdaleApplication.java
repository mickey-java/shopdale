package butana.shopdale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class ShopdaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopdaleApplication.class, args);
	}

}
