package com.example.model;

import lombok.Data;

import java.util.Date;
@Data
public class Assignment {
    private int id;
    private String title;
    private String description;
    private String category;
    private String topicSection;
    private String topic;
    private String level;
    private String difficulty;
    private String active;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;




}
