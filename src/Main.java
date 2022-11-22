import java.util.ArrayList;
import java.util.Scanner;
class Student
{
    String name;
    int admnNo;
    int rollNo;
    String college;

    public Student(String name, int admnNo, int rollNo, String college) {
        this.name = name;
        this.admnNo = admnNo;
        this.rollNo = rollNo;
        this.college = college;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrStu = new ArrayList<Student>();
        while (true) {
            System.out.println("Select an option\n1.Add student\n2.View student\n3.Search student\n4.Delete student\n5.Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if (option == 5) {
                System.out.println("You are exiting from the program");
                System.exit(0);
            } else {

            }
        }
    }
}
