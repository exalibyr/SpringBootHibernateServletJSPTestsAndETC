package excalibur;

import excalibur.configs.MyConfig;
import excalibur.entities.Cat;
import excalibur.entities.Dog;
import excalibur.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        ApplicationContext context = new AnnotationConfigApplicationContext("excalibur.excalibur.entities");
        Cat cat = context.getBean(Cat.class);
        Dog dog = ((Dog) context.getBean(Dog.class));
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

    }
}
