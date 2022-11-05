package info.jab.ms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.UnknownHttpStatusCodeException;

import java.net.SocketTimeoutException;
import java.time.Duration;

@RestController
public class MyRestController {

    private static final Logger logger = LoggerFactory.getLogger(MyRestController.class);

    @Qualifier("myRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${destination_b}")
    private String destination;

    @GetMapping("/")
    public ResponseEntity<String> getDataFromB() {

        try {
            ResponseEntity<String> value = restTemplate.getForEntity(destination, String.class);
            return ResponseEntity.ok().body("Result: " + value.getBody());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            return ResponseEntity.ok().body("Something goes wrong");
        }

    }

}
