package kwan.org.controller;

import kwan.org.config.Md5Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * Created by https://github.com/kwanpham
 */
@Controller
public class IndexController {



    private final List<String> thuatToanList = Arrays.asList("bcrypt" , "md5");

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("math" , thuatToanList);
        return "index";
    }





}
