package Task10;

import java.util.Scanner;

public class EmployeeSalaryDetails {

    public static void main(String[] args) {


        Scanner Input = new Scanner(System.in);
        System.out.println("eneter a name =");
        String n = Input.next();
        System.out.println("enter a salary = ");
        float sal = Input.nextInt();
        System.out.println("enetr a hour=");
        float hr = Input.nextInt();
        EmployeeTask10 Details = new EmployeeTask10();
        Details.getInfo("n",sal,hr);
        float Salary = Details.addSal();
        Salary = Details.addWork();
        System.out.println("Final salarey = "+ Salary);


    }
}


