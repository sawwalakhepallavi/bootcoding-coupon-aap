package com.coupon.application.controller;

import com.coupon.application.helper.CouponHelper;
import com.coupon.application.service.CouponHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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



    // 1. Get All Coupons
    @GetMapping("all-coupons")
    public List<String> getAllCoupons(){
        int quantity = 10;
        return couponHelperService.getNewCoupon(quantity);
    }

    // 2. Get Coupon Details by Coupon Id using PathVariable
    @GetMapping("coupon-id/{id}")
    public String getCouponById(@PathVariable("id") String couponId){
        return couponId + "-" + couponHelperService.getNewCoupon();
    }

    // 3. Get Coupons with Filter (Query Parameter)
    @GetMapping("search_coupon")
    public String searchCoupon(
            @RequestParam("valid") boolean isValid,
            @RequestParam(value = "type", required = false) String couponType,
            @RequestParam("category") String category){
        return "Query Parameter valid = " + isValid
                + " | Coupon Type = " + couponType
                + " | Coupon Category = " + category;
    }

        @GetMapping("getMultipleCoupons")
        public List<String> newCouponWithQuantity(){
            int quantity = 50;
            return couponHelperService.getNewCoupon(quantity);
        }
}
