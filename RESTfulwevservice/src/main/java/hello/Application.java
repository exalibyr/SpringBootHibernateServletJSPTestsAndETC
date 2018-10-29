package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;
import java.util.HashMap;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        int port = Integer.valueOf(JOptionPane.showInputDialog("Enter port"));
        HashMap<String, Object> props = new HashMap<>();
        props.put("server.port", port);
        ConfigurableApplicationContext cac = new SpringApplicationBuilder()
                .sources(Application.class)
                .properties(props)
                .run(args);
        JOptionPane.showMessageDialog(null, "To get data" +
                " type \"localhost:port number/greeting\" in browser." +
                " Now you can close app by clicking ok button");
        cac.close();
    }
}
