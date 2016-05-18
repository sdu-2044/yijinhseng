package controller;

import domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/test/")
public class TestController {
    @RequestMapping("login.do")
    public ModelAndView test1(@RequestBody Person person) throws IOException {
        ModelAndView mav = new ModelAndView("jaxb2MarshallingView");

        mav.addObject(new Person("test", 1));
        return mav;
    }

}

