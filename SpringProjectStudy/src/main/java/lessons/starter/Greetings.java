package lessons.starter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("main")
public class Greetings implements GreetingsService {

    private ApplicationContext context;

    @Required
    public void setContext(ApplicationContext context) {
        this.context = context;
    }




    @Override
    public String sayGreetings() {
        return "Greetings";
    }
}
