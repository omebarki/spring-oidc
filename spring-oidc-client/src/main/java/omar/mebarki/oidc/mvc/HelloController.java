package omar.mebarki.oidc.mvc;

import omar.mebarki.oidc.mvc.config.OIDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @Autowired
    private OIDC oidc;

    @Value("${omar.server.endpoint-url}")
    private String endpointURL;

    @GetMapping("/me2")
    public String hello() {
        return oidc.getRestTemplate().getForObject(endpointURL, String.class);
    }

    @GetMapping("/me1")
    public String hello2() {
        return "HHHH";
    }
}
