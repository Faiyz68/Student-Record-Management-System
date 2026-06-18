package student;
import java.io.*;
import java.util.*;
public class StudentRecordSystem{
    private List<Student> students=new ArrayList<>();
    private final String OBJ_FILE="students.ser";

    public StudentRecordSystem(){
        File dir = new File("StudentDate");
        if (!dir.exists()) dir.mkdir();
    }
    public void addStudent (Student s) {students.add(s);  saveTOFile(); }
    public Student search(int ID){
        for(Student s : students) if (s.getID() == ID) return s;
        return null;
    } 
    public void deleteStudent(int ID){
        students.removeIf(s-> s.getID()==ID);
        savetoFile();
    }
    public void saveToFile(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(OBJ_FILE))){
            oos.writeObject(students);
        }catch (IOException e){System.out.println("ERROR SAVING : " + e.getMessage());
                              }
    }
    public void generateReport(){
        try (PrintWriter pw = new PrintWriter(new FileWriter("report.txt"))){
            double sum = 0;
            for (Student s : students ) sum+=s.getGPA();
            pw.println("Total Students : " + stidents.size());
            pw.println("Average GPA : " + (students.size()>0?sum/students.size() : 0));
            
        }catch (IOException e ) {e.printStackTrace();}
    }
    public void createBackup(){
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(OBJ_FILE));
            BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("backup.ser"))){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = bid.read(buffer)) > 0 ) bos.write(buffer, 0 , length);
            } catch (IOException e) { e.printStackTrace();}
    }
    public void showFiledetails(){
        File f = new File(OBJ_FILE);
        System.out.println("File : " + f.getNaime() + " | path : " + f.getAbsolutePath() + " | Size : " + f.length() + " bytes";
        
    }    
    
}
