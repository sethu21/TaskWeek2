import javax.lang.model.element.Name;

public class Student {
    String Name;
    Integer RollNumber;
    Integer  phoneNumber;
    String Address;
    public Student(){

    }

    public Student(String name, Integer rollNumber, Integer phoneNumber, String address) {
        this.Name = name;
        this.RollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.Address = address;
    }
}
