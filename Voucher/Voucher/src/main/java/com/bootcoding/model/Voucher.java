package com.bootcoding.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Voucher {
//    id, validFor, title, category, discount
    private int id;
    private String validFor;
    private String title;
    private String category;
    private int discount;
}
