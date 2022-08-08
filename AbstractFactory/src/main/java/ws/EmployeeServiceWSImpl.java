package ws;

import service.IEmployeeService;

public class EmployeeServiceWSImpl implements IEmployeeService {

    private static final String[] EMPLOYEES = new String[]{"Maria", "Rebeca" , "Liliana"};

    @Override
    public String[] getEmployee() {
        return EMPLOYEES;
    }
}
