package omar.mebarki.oidc.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.web.context.annotation.RequestScope;

@SpringBootApplication
public class SpringOidcClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringOidcClientApplication.class, args);
    }

    @Bean()
    @RequestScope
    public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails details) {
        OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(details);

        /* To validate if required configurations are in place during startup */
        oAuth2RestTemplate.getAccessToken();
        return oAuth2RestTemplate;
    }
}
