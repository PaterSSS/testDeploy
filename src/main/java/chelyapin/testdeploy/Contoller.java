package chelyapin.testdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
    @GetMapping
    public String getS() {
        return "hey prod";
    }
}
