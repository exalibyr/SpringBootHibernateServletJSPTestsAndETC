package excalibur;

import excalibur.animals.*;
import excalibur.configs.MyConfig;
import excalibur.entities.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("it is " + weekDay.getWeekDayName() + " today!");
        WeekDay.day();

        System.out.println(context.getBean(Cat.class).getName());
        System.out.println((context.getBean("doggy", Dog.class).getName()));
    }
}
