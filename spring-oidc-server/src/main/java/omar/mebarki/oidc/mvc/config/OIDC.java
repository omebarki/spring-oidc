package omar.mebarki.oidc.mvc.config;

import org.springframework.web.client.RestTemplate;

public class OIDC extends ApiBinding {

    public OIDC(String accessToken) {
        super(accessToken);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

}
