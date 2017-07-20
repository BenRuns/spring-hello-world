package hello;

import org.springframework.web.bind.annotation.RestController;
import org.sprongframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {


    @RequestMapping("/")
    public String index() {
        return "this is my first app in java"
    }
}
