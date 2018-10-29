package lessons.starter;

//import org.apache.log4j.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Starter {

//    private static final Logger logger = LogManager.getLogger(Starter.class);

    public static void main(String[] args) {
//        logger.info("Configurating...");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        logger.info(((Greetings) context.getBean("greetings")).sayGreetings());
        System.out.println(context.getBean(Greetings.class).sayGreetings());
        System.out.println(context.getBean(BeanWithDependency.class).print());
        context.registerShutdownHook();
    }
}
