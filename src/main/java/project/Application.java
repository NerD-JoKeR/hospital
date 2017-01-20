package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by JoKeR on 19.01.2017.
 */
@SpringBootApplication
@EnableWebMvc
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
