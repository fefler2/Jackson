package SpringRest.Controller;

import SpringRest.Model.Person;
import SpringRest.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;

// http://localhost:8080/persons/all zwraca
// {"2":{"id":"2","firstName":"Steve","lastName":"Smith","age":21},"1":{"id":"1","firstName":"Steve","lastName":"Smith","age":21}}
@RestController
@RequestMapping("/persons")
public class PersonController {


    @Autowired
    PersonService ps;

    @RequestMapping("/all") // endpointy
    public Hashtable<String, Person> getAll(){
        return ps.getAll();
    }

    @RequestMapping("{id}")
    public Person getPerson(@PathVariable("id") String id) {
        return ps.getPerson(id);
    }
}
