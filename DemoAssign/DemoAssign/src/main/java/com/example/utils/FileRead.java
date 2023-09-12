package com.example.utils;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
@Component
public class FileRead {
    public boolean readData(){
        try {
            File file = new File("C:\\Users\\Hp\\Downloads\\assignment.csv");
            Scanner scanner = new Scanner(file);


            System.out.println("Reading File Contents ");

            int count=0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
                count++;
            }
            System.out.println(count);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
