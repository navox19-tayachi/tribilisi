package ge.gov.tribilisi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index()
    {
        return  gethtml();
    }

    private String gethtml () {


        return "<html> <head><title>Home Page</title></head><body background=\"georgia.jpg\"><h2>Hello this a TEST  DEMO ! </h2><h5><p>Welcome from paris to georgia :D  </p></h2>" +
                "" +
                "" +
                "</body></html>";
    }
}
