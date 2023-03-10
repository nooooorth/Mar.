package per.mock.mar.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping("/world")
    public String getKeyString(){
        
        return "hello,world";
    }
}
