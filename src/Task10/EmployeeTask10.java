package Task10;

public class EmployeeTask10 {
   private String name;
    float salary,hours;
    public void getInfo(String n,float sal,float hr) {
        this.name = n;
        this.salary = sal;
        this.hours = hr;
    }
    public float addSal(){
        if (salary<500){
            salary = salary +10;
        }
        return salary;
    }
    public float addWork(){
        if(hours>6){
            salary = salary+5;
        }
        return salary;  
    }
}
