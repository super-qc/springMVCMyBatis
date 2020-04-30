package demo.controller;
import demo.dao.AppTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/index")
    public String index(){

        AppTest appTest=new AppTest();
        appTest.shouldAnswerWithTrue();

        return "index";
    }
}
