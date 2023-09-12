package com.example.repository;

import com.example.model.Assignment;
import com.example.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AssignmentRepo {
    @Autowired
    public AssignmentService assignmentService;
    public void insert() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
            String insertQuery="insert into assignment (id, title, description, category, topicSection, topic,level, difficulty, active, createdBy,createdDate, modifiedBy, modifiedDate) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pmt= con.prepareStatement(insertQuery);
            List<Assignment> list =assignmentService.insertAssign();
//            System.out.println(list);
            for(Assignment model:list){
               pmt.setInt(1,  model.getId());
               pmt.setString(2,model.getTitle());
               pmt.setString(3,model.getDescription());
               pmt.setString(4,model.getCategory());
               pmt.setString(5,model.getTopicSection());
               pmt.setString(6, model.getTopic());
               pmt.setString(7, model.getLevel());
               pmt.setString(8, model.getDifficulty());
               pmt.setString(9,model.getActive());
               pmt.setString(10, model.getCreatedBy());
               pmt.setString(11, String.valueOf(model.getCreatedDate()));
               pmt.setString(12, model.getModifiedBy());
               pmt.setString(13, String.valueOf(model.getModifiedDate()));

                System.out.println("id:-"+model.getId()+"title:- "+model.getTitle());
                pmt.executeUpdate();
            }



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }



    }
}


