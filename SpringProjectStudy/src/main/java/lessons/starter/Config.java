package lessons.starter;

import lessons.starter.services.CommandManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "lessons.starter.Greetings")
@Import(AnotherConfig.class)
//@ImportResource("classpath:/lessons/starter/xml-config.xml")
public class Config {

//    @Value("${jdbc.url}")
//    String url;


    @Bean
    @Scope("prototype")
    public Object asyncCommand(){
        return new Object();
    }

    @Bean
    public CommandManager commandManager(){
        return new CommandManager() {
            @Override
            protected Object createCommand() {
                return asyncCommand();
            }
        };
    }

    @Bean(name = "greetings")
    GreetingsService getGreetingsService(){
        return new Greetings();
    }
}
