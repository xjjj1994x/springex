import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Hello {
    @RequestMapping(value = "/resthellow")
    public String hellow(){
        return "welcome Hellow World!!";
    }
}