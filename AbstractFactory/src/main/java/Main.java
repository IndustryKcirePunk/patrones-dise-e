import imp.IServiceStackAbstractFactory;
import imp.ServiceStackAbstractFactory;
import service.IEmployeeService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();

        IEmployeeService employeeService = factory.getEmployeeService();

        System.out.println(Arrays.toString(employeeService.getEmployee()));
    }

}
