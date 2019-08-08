package omar.mebarki.oidc.mvc;

import omar.mebarki.oidc.mvc.config.WebServerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class SpringOidcClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringOidcClientApplication.class, args);
    }

    @Bean
    public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails details) {
        OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(details);

        /* To validate if required configurations are in place during startup */
        oAuth2RestTemplate.getAccessToken();
        return oAuth2RestTemplate;
    }
}
