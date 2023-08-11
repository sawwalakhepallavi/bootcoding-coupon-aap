package Employee.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EmployeeApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class,args);
    }
    @Autowired
    private EmployeeHelperService employeeHelperService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("application running");
        List<String> employees= employeeHelperService.getNewEmployee(50);
        for(String employee: employees){
            System.out.println(employee);
        }
    }
}
