package excalibur.configs;

import excalibur.entities.Cat;
import excalibur.entities.Dog;
import excalibur.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat(Parrot parrot){
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    @Bean
    public Dog getDog(){
        return new Dog();
    }

    @Bean
    public Parrot getParrot(){
        return new Parrot();
    }
}
