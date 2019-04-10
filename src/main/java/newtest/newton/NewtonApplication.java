package newtest.newton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "newtest.newton.repository")
@SpringBootApplication
public class NewtonApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewtonApplication.class, args);
    }

}
