package com.coupon.application.controller;

import com.coupon.application.helper.CouponHelper;
import com.coupon.application.service.CouponHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coupon/")
public class CouponController {
        @Autowired
        private CouponHelperService couponHelperService;
        // HTTP Methods Get
        @GetMapping("getCoupon")
        public String newCoupon(){
            return "New Coupon : " + couponHelperService.getNewCoupon();
        }

//        @GetMapping("getJson")
//        public CouponHelper getDummyJson(){
//            return CouponHelper.builder()
//                    .id(couponHelperService.getNewCoupon())
//                    .type("Voucher")
//                    .validFor(3).build();
//        }

        @GetMapping("getMultipleCoupons")
        public List<String> newCouponWithQuantity(){
            int quantity = 50;
            return couponHelperService.getNewCoupon(quantity);
        }
}
