package Facade.Facade;

public class EmployeeFacad {

    EmployeeDAO employeeDAO;

    public EmployeeFacad() {
        employeeDAO = new EmployeeDAO();
    }
    public void insertEmployee()
    {
        employeeDAO.insertEmployee();
    }
    
    public Employee getEmployee(String EmailId)
    {
        return employeeDAO.getEmployee(EmailId);
    } 
    
}
