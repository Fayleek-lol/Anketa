public class Faculty 
{
    private int yearFaculty;
    private String nameFaculty;
    private String nameDean;
    private int numberOfSpecialties;
    private int numberOfStudentsAll;
    public Specialty spec;
    
    public Faculty(){
        this.spec = new Specialty();
    }
    
    public Specialty getSpec(){
        return spec;
    }
    
    public void setYearFaculty(int yearFaculty){
        this.yearFaculty = yearFaculty;
    }
    
    public int getYearFaculty(){
        return yearFaculty;
    }
    
    public void setNameFaculty(String nameFaculty){
        this.nameFaculty = nameFaculty;        
    }
    
    public String getNameFaculty(){
        return nameFaculty;
    }
    
    public void setNameDean(String nameDean){
        this.nameDean = nameDean;
    }
    
    public String getNameDean(){
        return nameDean;
    }
    
    public void setNumberOfSpecialties(int numberOfSpecialties){
        this.numberOfSpecialties = numberOfSpecialties;
    }
    
    public int getNumberOfSpecialties(){
        return numberOfSpecialties;
    }
    
    public void setNumberOfStudentsAll(int numberOfStudentsAll){
        this.numberOfStudentsAll = numberOfStudentsAll;
    }
    
    public int getNumberOfStudentsAll(){
        return numberOfStudentsAll;
    }
}
