package Task10;

import java.util.Scanner;

public class EmployeeSalaryDetails {
    public void EmployeeDetails(String[]arrays){
        Scanner Input = new Scanner(System.in);
        System.out.println("eneter a name =");
        String n = Input.next();
        System.out.println("enter a salary = ");
        int sal = Input.nextInt();
        System.out.println("enetr a hour=");
        int hr = Input.nextInt();
        EmployeeTask10 Details = new EmployeeTask10();
        Details.getInfo("n",sal,hr);
        System.out.println("salary ="+Details.addSal());
        System.out.println("hour ="+Details.addWork());

    }
}
