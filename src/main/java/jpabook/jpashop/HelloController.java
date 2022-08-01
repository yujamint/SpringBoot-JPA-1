package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!"); // "data"라는 key에 "hello"를 value로 넘길 것이다.
        return "hello"; // 화면 이름을 return 한다. -> 화면 렌더링할 때 자동으로 hello.html 띄워준다.
        // 스프링부트 thymeleaf 매핑
        // : 'resources/templates' + {viewName} + '.html'
    }
}
