package Employee.application;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component

public class EmployeeHelper {
    public String name(){
        Random random= new Random();
        String names[]={"neha","prachi","radhika","rupal","suhag","yash"};
        int index=random.nextInt(names.length);
        return names[index];

    }
}
