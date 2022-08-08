package industry.kcirepuk;

import industry.kcirepuk.dto.Employee;

public class IndustryKcirePunk {

    public static void main(String[] args) {
        Employee emp = new Employee.EmployeeBuilder()
                .setName("Erick Torres")
                .setGender("Macho Alfa")
                .setAge(21)
                .setAdress("Getsemani calle 28 #10b-36", "Cartagena", "Colombia", "130001")
                .addContacs("Fadel Arteaga", "1232312", "123", "Casa")
                .addPhones("342234", null, "Cedular")
                .build();


        System.out.println(emp);


    }

}
