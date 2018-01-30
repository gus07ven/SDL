// Example of class not following the SRP principle.
//public class Employee {
//
//    private String employeeId;
//    private String name;
//    private Date dateOfJoining;
//
//    public boolean isPromotionDueThisYear(){
//        // Promotion logic
//    }
//
//    public Double calcIncomeTaxForCurrentYear(){
//        // Income tax logic
//    }
//}

import java.util.Date;

// Refactored class following the SRP
public class Employee {

    private String employeeId;
    private String name;
    private Date dateOfJoining;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// This class would be in its own file HRPromotions
class HRPromotions {

     public boolean isPromotionDueThisYear(Employee employee){
         // Promotion logic
         return true;
     }
}

// This class would be in its own file FinITCalculations
class FinITCalculations {

    public boolean calcIncomeTaxForCurrentYear(Employee employee){
        // Income tax logic
        return true;
    }
}
