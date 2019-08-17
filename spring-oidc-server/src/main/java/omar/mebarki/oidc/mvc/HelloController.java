package omar.mebarki.oidc.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/me")
    public ResponseEntity<OAuth2Authentication> hello(OAuth2Authentication currentUser) {
        return ResponseEntity.ok(currentUser);
    }

}
