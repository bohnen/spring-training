import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


/**
 * Created by bohnen on 2014/09/14.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
