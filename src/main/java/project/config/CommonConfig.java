package project.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JoKeR on 19.01.2017.
 */
@Configuration
public class CommonConfig {

    @Bean(initMethod = "init")
    public DataInitializor dataInitializor () {
        DataInitializor dataInitializor = new DataInitializor();
        return dataInitializor;
    }
}
