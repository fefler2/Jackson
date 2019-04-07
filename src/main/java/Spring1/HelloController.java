package Spring1;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @PostMapping("/a")
    public String postS(){
        return "post";
    }

    @GetMapping("")
    public String getS(){
        return "s";
    }

    @GetMapping("/b")
    public String getA(@RequestParam String s){
        return "URL to: " + s; // przy http://localhost:8080/b?s=2 zwraca http://localhost:8080/b?s=2
    }

    @GetMapping("/c")
    public String getC(@RequestParam("id") String s){
        return "ABC: " + s; // http://localhost:8080/c?id=fd zamiast http://localhost:8080/c?s=fd
    }

}