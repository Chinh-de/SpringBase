package vn.chinhde.phonestore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
      return "Hello World from chinhde updated!";
    }
    @GetMapping("/user")
    public String userPage() {
      return "This page is for user!";
    }
    @GetMapping("/admin")
    public String adminPage() {
      return "This page is for admin!";
    }    
}
