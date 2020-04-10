package LightningBirdMission1.Learning;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    @GetMapping ("/hello")
    public String sayHello() {
        return "Hello World Developer!!!";
    }
}
