package SpringRest.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // http://localhost:8080/persons/1
public class Person {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String id;
    String firstName;
    String lastName;
    int age;

}
