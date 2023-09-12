package com.example.service;

import com.example.model.Assignment;
import com.example.repository.AssignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class AssignmentService {

    public List<Assignment> insertAssign(){
        ArrayList<Assignment> assignments = new ArrayList<>();


        try {
            File file = new File("C:\\Users\\Hp\\Downloads\\assignment.csv");
            System.out.println("Reading File Contents ");
//            System.out.println(file);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String l;
            while ((l = br.readLine()) != null) {
                Assignment assignment = new Assignment();
                String[] record = l.split(",");
                assignment.setId(Integer.parseInt(record[0].trim()));
                assignment.setTitle(record[1].trim());
                assignment.setDescription(record[2].trim());
                assignment.setCategory(record[3].trim());
                assignment.setTopicSection(record[4].trim());
                assignment.setTopic(record[5].trim());
                assignment.setLevel(record[6].trim());
                assignment.setDifficulty(record[7].trim());
                assignment.setActive(record[8].trim());
                assignment.setCreatedBy(record[9].trim());
//                assignment.setCreatedDate(record[10].trim());
                assignment.setModifiedBy(record[11].trim());
//                String modifiedDate=record[12].trim();

                assignments.add(assignment);
            }
            System.out.println(assignments.get(0));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return assignments;
    }
}
