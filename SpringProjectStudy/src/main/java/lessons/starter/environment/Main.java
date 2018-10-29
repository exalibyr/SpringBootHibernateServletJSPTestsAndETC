package lessons.starter.environment;

import lessons.starter.environment.profiles.EnvConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnvConfig.class);
        context.getEnvironment().setActiveProfiles("development");
        DataSource dataSource = context.getBean(DataSource.class);
        try {
            dataSource.setLoginTimeout(100);
            System.out.println(dataSource.getLoginTimeout());
        }
        catch (SQLException ex){

        }

    }
}
