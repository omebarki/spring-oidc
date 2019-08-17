package omar.mebarki.oidc.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class OIDCConfig {
    @Bean
    @RequestScope
    public OIDC oidc() {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        String accessToken = null;
        if (authentication.getClass()
                .isAssignableFrom(OAuth2Authentication.class)) {
            OAuth2AuthenticationDetails details =
                    (OAuth2AuthenticationDetails)(((OAuth2Authentication) authentication).getDetails());
            accessToken = details.getTokenValue();
        }
        return new OIDC(accessToken);
    }
}
