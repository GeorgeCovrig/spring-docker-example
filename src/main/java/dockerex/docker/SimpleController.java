package dockerex.docker;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping("/test")
    public ResponseEntity<String> getSimpleResponse() {
        return ResponseEntity.ok("test successful");
    }
}
