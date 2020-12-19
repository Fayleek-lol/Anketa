public class Specialty
{
    private int codeSpecialty;
    private String nameSpecialty;
    private String managerName;
    private int yearSpecialty;
    private int numberOfGroup;
    private Group group;
    
    public Specialty(){
        this.group = new Group();
    } 
    
    public Group getGroup(){
        return group;
    }
    
    public void setCodeSpecialty(int codeSpecialty){
        this.codeSpecialty = codeSpecialty;
    }
    
    public int getCodeSpecialty(){
        return codeSpecialty;
    }
    
    public void setManagerName(String managerName){
        this.managerName = managerName;
    }
    
    public String getManagerName(){
        return managerName;
    }
    
    public void setNameSpecialty(String nameSpecialty){
        this.nameSpecialty = nameSpecialty;
    }
    
    public String getNameSpecialty(){
        return nameSpecialty;
    }
    
     public void setYearSpecialty(int yearSpecialty){
        this.yearSpecialty = yearSpecialty;
    }
    
    public int getYearSpecialty(){
        return yearSpecialty;
    }
    
    public void setNumberOfGroup(int numberOfGroup){
        this.numberOfGroup = numberOfGroup;
    }
    
    public int getNumberOfGroup(){
        return numberOfGroup;
    }
}