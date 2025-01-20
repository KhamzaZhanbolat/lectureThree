package kz.bitlab.lectureThree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/sign")
    public String getIndexPage() {
        return "sign";
    }

    @GetMapping(value = "/index")
    public String getIndex1Page() {
        return "index";
    }
}
