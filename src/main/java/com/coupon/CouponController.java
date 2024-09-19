package com.coupon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CouponController {

    @GetMapping("/{code}")
    public String indexPage(@PathVariable String code) {
        System.out.println("code: " + code);
        return "index";
    }
}
