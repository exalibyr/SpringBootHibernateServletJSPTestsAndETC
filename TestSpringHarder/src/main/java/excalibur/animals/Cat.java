package excalibur.animals;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name = "fat";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
