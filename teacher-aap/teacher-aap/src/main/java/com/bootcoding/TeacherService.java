package com.bootcoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherService {
    @Autowired
    private Teacher teacher;

    public List<String> getTeacher(int size){
        List<String> teach = new ArrayList<>();
        for(int i = 0; i < size; i++){
            String newTeach = teacher.subject();
            teach.add(newTeach);
        }
        return teach;
    }

}
