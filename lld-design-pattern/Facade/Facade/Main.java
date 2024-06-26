package Facade.Facade;

public class Main {
    public static void main(String[] args) {
        EmployeeFacad employeeFacade = new EmployeeFacad();
        employeeFacade.insertEmployee();
        Employee employee = employeeFacade.getEmployee("    "); // This is a dummy email id  
    }
    
}
