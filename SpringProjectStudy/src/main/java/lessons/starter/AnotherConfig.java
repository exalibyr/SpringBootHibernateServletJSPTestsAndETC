package lessons.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfig {

    @Autowired  GreetingsService greetingsService;
    @Bean
    BeanWithDependency beanWithDependency(){
        return new BeanWithDependency(greetingsService.sayGreetings());
    }
}
