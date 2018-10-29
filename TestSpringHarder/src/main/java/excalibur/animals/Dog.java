package excalibur.animals;

import org.springframework.stereotype.Component;

@Component("doggy")
public class Dog {

    private String name = "bark";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
