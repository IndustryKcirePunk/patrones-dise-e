package rest;

import service.IEmployeeService;

public class EmployeeServiceRestImp implements IEmployeeService {

    private static final String[] EMPLOYEES = new String[]{"Juan", "Pedro", "Manuel"};

    @Override
    public String[] getEmployee() {
        return EMPLOYEES;
    }
}
