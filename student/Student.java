package student;
import java.io.Serializable;
public class Student implements Serializable{
    private static final long serialVersionUID=1L;
    private int ID;
    private String name;
    private String department;
    private double GPA;
    public Student(int ID , String name, String department, double GPA){
        this.ID = ID;
        this.name=name;
        this.department=department;
        this.GPA=GPA;

    }
    public int getID(){return ID;}
    public void setID(int ID){this.ID=ID;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getDepartment(){return department;}
    public void setDepartment(String department){this.department=department;}
    public double getGPA(){return GPA;}
    public void setGPA(double GPA){
        if(GPA>=0.0&&GPA<=4.0){
            this.GPA=GPA;
        }
        else{
            System.out.println("INVALID GPA : SETTING TO 0.0");
            this.GPA=0.0;
        }

    }
    @Override
    public String toString(){
        return "Student ID : " +ID+ " NAME : "  +name+" Department : " + department+  " GPA : "+GPA;
    }


}
