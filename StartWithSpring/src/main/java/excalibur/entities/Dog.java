package excalibur.entities;

import org.springframework.stereotype.Component;


public class Dog {
    private String name = "sobaka";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
