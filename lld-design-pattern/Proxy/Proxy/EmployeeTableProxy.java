package Proxy.Proxy;

public class EmployeeTableProxy implements EmployeeTable{
//has a relationship
    private EmployeeTable employeeTable;

    public EmployeeTableProxy(EmployeeTable employeeTable){
        this.employeeTable = employeeTable;
    }

    @Override
    public void addEmployee(String name, EmployeeTable employee) throws Exception {
        if(name.equalsIgnoreCase("Admin"))
        employeeTable.addEmployee(name, employee);
        else 
        throw new Exception("Access Denied . Employee not added .");
    }

    @Override
    public void deleteEmployee(String name, int Employeeid) throws Exception {
        if(name.equalsIgnoreCase("Admin")) 
        employeeTable.deleteEmployee(name, Employeeid);
        else  throw new Exception("Access Denied . Employee not deleted .");
    }

    @Override
    public void getEmployee(String name, int Employeeid) throws Exception {
        if(name.equalsIgnoreCase("Admin")) 
        employeeTable.getEmployee(name, Employeeid);
        else throw new Exception("Access Denied . Employee Valuenot fetched .");
    }
    
}
