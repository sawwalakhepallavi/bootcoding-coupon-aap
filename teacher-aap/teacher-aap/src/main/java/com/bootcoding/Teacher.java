package com.bootcoding;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class Teacher {
    public String subject(){
        String sub[]={"maths","chem","bio","physics"};
        Random random=new Random();
        int index=random.nextInt(sub.length);
        return sub[index];
    }
}
