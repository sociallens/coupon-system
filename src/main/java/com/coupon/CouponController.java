package com.coupon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CouponController {

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public String indexPage(@PathVariable("code") String code) {
        System.out.println("id: " + code);
        return "index";
    }
}
