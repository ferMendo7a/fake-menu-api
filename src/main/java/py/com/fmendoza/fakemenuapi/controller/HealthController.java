package py.com.fmendoza.fakemenuapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    public HealthController() {
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Fake Menu API OK!";
    }

}
