package com.bootcoding.controller;

import com.bootcoding.model.Voucher;
import com.bootcoding.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Voucher-app")
public class VoucherController {
    @Autowired
    private VoucherService voucherService;

    @GetMapping("/newVoucher")
    public Voucher newVoucher(){
        return voucherService.newVoucher();
    }
}
