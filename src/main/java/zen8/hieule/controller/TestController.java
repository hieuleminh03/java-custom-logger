package zen8.hieule.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/get")
    public ResponseEntity<Void> getTest() {
        log.info("GET");
        log.error("TEST ERROR");
        log.debug("TEST DEBUG");
        log.warn("TEST WARN");
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }

}
