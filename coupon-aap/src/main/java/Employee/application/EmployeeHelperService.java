package Employee.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeHelperService {
    @Autowired
    private EmployeeHelper employeeHelper;

    public List<String> getNewEmployee(int quantity){
        List<String> emp = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newEmp = employeeHelper.name();
            emp.add(newEmp);
        }
        return emp;

    }
}
