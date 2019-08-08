package omar.mebarki.oidc.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @Autowired
    private OAuth2RestTemplate oAuth2RestTemplate;

    @Value("${omar.server.endpoint-url}")
    private String endpointURL;

    @GetMapping("/me2")
    public String hello() {
        return oAuth2RestTemplate.getForObject(endpointURL, String.class);
    }

}
