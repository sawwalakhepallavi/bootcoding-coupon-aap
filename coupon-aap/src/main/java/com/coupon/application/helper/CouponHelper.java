package com.coupon.application.helper;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
@Builder
@Component
public class CouponHelper {
//    private String id;
//    private String type;
//    private int validFor;
    public String newCoupon(){
        return UUID.randomUUID().toString();
    }
}
