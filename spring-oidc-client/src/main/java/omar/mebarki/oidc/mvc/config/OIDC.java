package omar.mebarki.oidc.mvc.config;

import org.springframework.web.client.RestTemplate;

public class OIDC extends ApiBinding {

    private static final String GRAPH_API_BASE_URL =
            "https://graph.facebook.com/v2.12";

    public OIDC(String accessToken) {
        super(accessToken);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

}
