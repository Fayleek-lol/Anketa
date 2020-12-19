public class Group
{
    private String groupNumber;
    private int numberOfStudents;
    private Student stud;
    
    public Group(){
        this.stud = new Student();
    }
    
    public Student getStud(){
        return stud;
    }
    
    public void setGroupNumber(String groupNumber){
        this.groupNumber = groupNumber;
    }
    
    public String getGroupNumber(){
        return groupNumber;
    }
    
    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents; 
    }
    
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}
