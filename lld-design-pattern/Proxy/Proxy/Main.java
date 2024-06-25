package Proxy.Proxy;

public class Main {
    
    public static void main(String[] args) {
        EmployeeTable employee = new ConcreteEmployee();
        EmployeeTable employeeProxy = new EmployeeTableProxy(employee);
        try {
            employeeProxy.addEmployee("Admin", employee);
            employeeProxy.deleteEmployee("Admirn", 1);//accessDenied exited code 
            employeeProxy.getEmployee("Admin", 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
