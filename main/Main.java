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
             System.out.println("8. DISPLAY ALL STUDENTS ");
             System.out.println("0. EXIT ");
            int choice = sc.nextInt();
            if (choice == 1){
              System.out.print("ENTER ID , NAME , DEPT , GPA : ");
            sys.addStudent(new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()));
            }
            else if(choice == 2){
                 System.out.print("ENTER ID : ");
                 System.out.println(sys.search(sc.nextInt()));
            }
            else if(choice == 3){
                 System.out.print("ENTER ID TO UPDATE , NAME, DEPT, GPA : ");
                sys.updateStudent(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
            }
            else if (choice == 4){
                 System.out.print("Enter ID to Delete : ");
                sys.deleteStudent(sc.nextInt());
            }
            else if (choice == 5 ){
                sys.generateReport();
                 System.out.println("Report saved to report.txt");
            }
            else if (choice ==6){
                sys.createBackup();
                 System.out.println("Backup created ");
            }
            else if (choice == 7){
                sys.showFileDetails();
            }
             else if (choice == 8) {
    System.out.println(" All Registered Students ");
    sys.displayAllStudents();
}   
            else break;

        }  
        sc.close();
    }
}
