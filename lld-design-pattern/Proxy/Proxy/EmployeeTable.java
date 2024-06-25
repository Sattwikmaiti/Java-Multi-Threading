package Proxy.Proxy;

public interface EmployeeTable {
    public void addEmployee(String name, EmployeeTable employee) throws Exception;
    public void deleteEmployee(String name,int Employeeid) throws Exception;
    public void getEmployee(String name,int Employeeid) throws Exception;
    
}
