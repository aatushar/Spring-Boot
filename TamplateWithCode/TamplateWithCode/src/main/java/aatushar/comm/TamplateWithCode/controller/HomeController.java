package aatushar.comm.TamplateWithCode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }


<<<<<<< HEAD

=======
//    @GetMapping("/header")
//    public String header(){
//        return "header";
//    }
>>>>>>> 299f93836f74fcc3028ca5b8799642308bec9c3e
}
