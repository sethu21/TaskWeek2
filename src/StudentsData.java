public class StudentsData {
    public static void main(String[] args) {
        Student Input1 = new Student("sam", 3, 12345678, "xys");
        Student Input = new Student("John",4,1236789,"hdaqkfkwue");
        System.out.println("Student");
        StudentsInformation.PrintStudentsDetails(Input1);
        System.out.println("********");
        StudentsInformation.PrintStudentsDetails(Input);



    }
}

