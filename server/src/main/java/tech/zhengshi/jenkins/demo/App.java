package  tech.zhengshi.jenkins.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static tech.zhengshi.jenkins.demo.client.ClientResource.STH_IN_CLIENT;

@SpringBootApplication
@RestController
public class App {


    @RequestMapping(value = "sth",method = RequestMethod.GET)
    public String getSth(){
        return STH_IN_CLIENT;
    }


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
