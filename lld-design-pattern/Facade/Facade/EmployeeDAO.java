package Facade.Facade;
//DAO class to interact with the database Data Access Object
public class EmployeeDAO {

    public void insertEmployee()
    {
        System.out.println("EmployeeDAO: Inserting an employee record in the database");
    }
    public void updateEmployee()
    {
        System.out.println("EmployeeDAO: Updating an employee record in the database");
    }

    public void deleteEmployee()
    {
        System.out.println("EmployeeDAO: Deleting an employee record from the database");
    }

    public Employee getEmployee(String EmailId)
    {
        System.out.println("EmployeeDAO: Retrieving an employee record using EmailId from the database");
        return new Employee();
    }

    
}
