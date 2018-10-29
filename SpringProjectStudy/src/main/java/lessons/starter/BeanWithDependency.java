package lessons.starter;

import org.springframework.stereotype.Component;

@Component
public class BeanWithDependency {

    private String text;

    public BeanWithDependency(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String print(){
        return getText() + "TEXT!!";
    }

}
