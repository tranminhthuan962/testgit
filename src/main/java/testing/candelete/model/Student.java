package testing.candelete.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
    private String name;
    private String email;

    public Student() {
    }

    public Student(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }

}
