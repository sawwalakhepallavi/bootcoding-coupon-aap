package com.bootcoding.service;

import com.bootcoding.dao.DaoService;
import com.bootcoding.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class EmployeeService {
    @Autowired
    private DaoService daoService;

    public void insertEmployee(Employee emp){
//        return Employee.builder().name(randomName()).
//                position(randomPosition()).
//                salary(randomSalary()).build();
         daoService.insertEmployee(emp);
    }



//    public List<Employee> insertEmployee(int size){
//        ArrayList<Employee> list=new ArrayList<>();
//        for(int i=0;i<size;i++){
//            list.add(insertEmployee());
//        }
//        return list;
//    }
    private String randomName(){
        String []names={"radhika","babita","yash","piyush","rajendra","ramesh","mayank","shivani","saumya"};
        Random random=new Random();
        int index=random.nextInt(names.length);
        return names[index];
    }
    private String randomPosition(){
        String []positions={"CE","Database developer","backend developer","cloud developer","managar"};
        Random random=new Random();
        int index=random.nextInt(positions.length);
        return positions[index];
    }
    private int randomSalary(){
        int min=1;
        int max=100000000;
        Random random=new Random();
        return random.nextInt(max-min);
    }

}
