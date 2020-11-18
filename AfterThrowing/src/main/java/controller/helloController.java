package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.helloService;

@Controller
public class helloController {

    @Autowired
    helloService helloService;

    @RequestMapping(value = "/servicetest", method = RequestMethod.GET)
    public String helloTest() {
        helloService.hello();
        return "home";
    }

}
