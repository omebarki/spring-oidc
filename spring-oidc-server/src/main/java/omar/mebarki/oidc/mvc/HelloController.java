package omar.mebarki.oidc.mvc;

import omar.mebarki.oidc.mvc.config.OIDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {


    @Value("${omar.server.endpoint-url}")
    private String endpointURL;

    @Autowired
    private OIDC oidc;

    @GetMapping("/me")
    public String hello() {
        return oidc.getRestTemplate().getForObject(endpointURL, String.class);
    }
}
