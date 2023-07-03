
package data;

import java.util.ArrayList;
import java.util.List;

public class CompanyManagement {
    List<Employee> emp = new ArrayList<>();
    
    
    
    public void printList() {
        for (Employee x : emp) {
            x.getName();
        }
    }
    
}
