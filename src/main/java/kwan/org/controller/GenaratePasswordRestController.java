package kwan.org.controller;

import kwan.org.config.Md5Config;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by https://github.com/kwanpham
 */
@RestController
public class GenaratePasswordRestController {

    @Autowired
    Md5Config md5Config;

    @GetMapping("/hash")
    public String bcrypt(@RequestParam String password, @RequestParam String type) {

        if (StringUtils.isBlank(password) || StringUtils.isBlank(type)) {
            return "hashing failed";
        }


        switch (type) {
            case "md5":
                return md5Config.getMd5(password);
            case "bcrypt":
                PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                return passwordEncoder.encode(password);
            default:
                return "hashing failed";
        }

    }

    @ExceptionHandler(Exception.class)
    public String error(Exception e) {
        e.printStackTrace();
        return "hashing failed";
    }

}
