public class Student 
{
    private int studentCourse;
    private String dateOfBirth;
    private String fullName;
    private String maritalStatus;
    private String recordBook;
    private String familyInformation;
    
    public void setStudentCourse(int studentCourse){
        this.studentCourse = studentCourse;
    }
    
    public int getStudentCourse(){
        return studentCourse;
    }
    
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public void setMaritalStatus(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }
    
    public String getMaritalStatus(){
        return maritalStatus;
    }
    
    public void setRecordBook(String recordBook){
        this.recordBook = recordBook;
    }
    
    public String getRecordBook(){
        return recordBook;
    }
    
    public void setFamilyInformation(String familyInformation){
        this.familyInformation = familyInformation;
    }
    
    public String getFamilyInformation(){
        return familyInformation;
    }
}
