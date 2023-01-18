package Task10;

public class Employee {
    private final String name,address;
    private int year,salary;
    public Employee(String n, int y ,int s, String a){
        this.name = n;
        this.year  = y;
        this.salary = s;
        this.address = a;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;

    }
    public int getSalary(){
        return salary;

    }
    public String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert",1994,50000,"wall street");
        Employee employee2 = new Employee("Alex",1999,200000,"west street");
        Employee employee3 = new Employee("uhvoq",2000,3759153,"south street");
        System.out.println("Name  Year of Joining  Address ");
        System.out.println(employee1.getName()+"  "+employee1.getYear()+"  "+employee1.getSalary()+"  "+employee1.getAddress());
        System.out.println(employee2.getName()+"  "+employee2.getYear()+"  "+employee2.getSalary()+"  "+employee2.getAddress());
        System.out.println(employee3.getName()+"  "+employee3.getYear()+"  "+employee3.getSalary()+"  "+employee3.getAddress());

    }
}
