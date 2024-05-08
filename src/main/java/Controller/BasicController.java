package Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


    @GetMapping("/")
    public String welcome() {

        return "Welcomes the user on the root mapping";
    }
}