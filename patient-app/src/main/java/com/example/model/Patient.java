package com.example.model;

import lombok.Builder;
import lombok.Data;


import java.util.Date;
@Data
@Builder
public class Patient {
    private String name;
    private String disease;
    private int phoneNo;
    private Date date;
    private String city;
}
