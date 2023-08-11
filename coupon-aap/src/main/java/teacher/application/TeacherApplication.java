package teacher.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TeacherApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class,args);
    }
    @Autowired
    private TeacherService teacherService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application running");
        List<String> teachers= teacherService.getTeacher(50);
        for(String subj: teachers){
            System.out.println(subj);
        }
    }
}
