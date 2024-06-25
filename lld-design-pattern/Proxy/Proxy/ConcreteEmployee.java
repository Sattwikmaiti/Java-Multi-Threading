package Proxy.Proxy;



public class ConcreteEmployee implements EmployeeTable{

    @Override
    public void addEmployee(String name, EmployeeTable employee) throws Exception {
        System.out.println("Employee added");
    }

    @Override
    public void deleteEmployee(String name, int Employeeid) throws Exception {
        System.out.println("Employee deleted");
    }

    @Override
    public void getEmployee(String name, int Employeeid) throws Exception {
        System.out.println("Employee retrieved");
    }
    
}
