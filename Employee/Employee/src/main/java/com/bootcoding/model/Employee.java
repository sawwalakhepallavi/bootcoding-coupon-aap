package com.bootcoding.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
@Data
@Builder
public class Employee {
    private int id;
    private String name;
    private String position;
    private int salary;


}
