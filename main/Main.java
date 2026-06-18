package main;
import student.Student;
import student.StudentRecordSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    void main(){
        StudentRecordSystem sys= new StudentRecordSystem();
        ArrayList<Student> Studentrecord = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println(" STUDENT SYSTEM ");
            System.out.println(" 1. ADD ");
            System.out.println(" 2. SEARCH ");
            System.out.println(" 3. UPDATE ");
            System.out.println("4. DELETE ");
            System.out.println("5. REPORT ");
            System.out.println("6. BACKUP ");
             System.out.println("7. FILE INFO");
             System.out.println("0. EXIT ");
            int choice = sc.nextInt();
            













        }     
    }
}
