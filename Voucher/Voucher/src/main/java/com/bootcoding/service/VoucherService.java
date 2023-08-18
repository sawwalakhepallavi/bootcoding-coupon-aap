package com.bootcoding.service;

import com.bootcoding.model.Voucher;
import org.springframework.stereotype.Service;

import java.util.UUID;

//Create Controller as VoucherController with newVoucher and return Voucher Object
@Service
public class VoucherService {

    public Voucher newVoucher(){
        return Voucher.builder()
                .id(2).
                validFor("30 days").
                title("gift Voucher").
                category("gift card").
                discount(40).build();
    }

}
