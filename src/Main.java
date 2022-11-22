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
                switch (option) {
                    case 1:
                        System.out.println("Enter student details");
                        Scanner obj = new Scanner(System.in);
                        System.out.println("Enter the name");
                        String name = obj.next();
                        System.out.println("Enter admission number");
                        int admnNo = obj.nextInt();
                        System.out.println("Enter roll number");
                        int rollNo = obj.nextInt();
                        System.out.println("Enter college");
                        String college = obj.next();
                        Student s = new Student(name, admnNo, rollNo, college);
                        arrStu.add(s);
                        break;

                    case 2 :
                        System.out.println("Showing student details");
                        for (Student stu : arrStu) {
                            System.out.println("Printing details of student " );
                            System.out.println(stu.name);
                            System.out.println(stu.admnNo);
                            System.out.println(stu.rollNo);
                            System.out.println(stu.college);

                        }
                        break;

                    case 3 :
                        System.out.println("Enter the admission number");
                        Scanner obj1 = new Scanner(System.in);
                        int admnNo1 = obj1.nextInt();
                        for (Student s1 : arrStu) {
                            if (admnNo1 == s1.admnNo) {
                                System.out.println("Details of student with admission number " + admnNo1 + "is ");
                                System.out.println(s1.name);
                                System.out.println(s1.admnNo);
                                System.out.println(s1.rollNo);
                                System.out.println(s1.college);

                                break;
                            }
                            else {
                                System.out.println("No such student found");

                            }
                        }
                }
            }
        }
    }
}
