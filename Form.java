public class Form
{
    public Faculty facul;
    
    public Form(){
        this.facul = new Faculty();
    }
    
    public Faculty getFacul(){
        return facul;
    }
    
    public void printAboutObject(){
        System.out.println("Данные о студенте:");
        System.out.println();
        System.out.println("Личные данные:");
        System.out.println("Полное имя - " + this.facul.getSpec().getGroup().getStud().getFullName());
        System.out.println("Дата рождения - " + this.facul.getSpec().getGroup().getStud().getDateOfBirth());
        System.out.println("Курс - " + this.facul.getSpec().getGroup().getStud().getStudentCourse());
        System.out.println("Номер зачетной книжки - " + this.facul.getSpec().getGroup().getStud().getRecordBook());
        System.out.println("Семейное положение - " + this.facul.getSpec().getGroup().getStud().getMaritalStatus());
        System.out.println("Информация о семье - " + this.facul.getSpec().getGroup().getStud().getFamilyInformation());
        System.out.println();
        System.out.println("Факультет:");
        System.out.println("Название факультета - " + this.facul.getNameFaculty());
        System.out.println("Год создания факультета - " + this.facul.getYearFaculty());
        System.out.println("Декан - " + this.facul.getNameDean());
        System.out.println("Количество специальностей - " + this.facul.getNumberOfSpecialties());
        System.out.println("Количетво студентов на факультете - " + this.facul.getNumberOfStudentsAll());
        System.out.println();
        System.out.println("Специальность:");
        System.out.println("Название специальности - " + this.facul.getSpec().getNameSpecialty());
        System.out.println("Код специальности - " + this.facul.getSpec().getCodeSpecialty());
        System.out.println("Год создания - " + this.facul.getSpec().getYearSpecialty());
        System.out.println("Заведующий кафедры - " + this.facul.getSpec().getManagerName());
        System.out.println("Количество групп - " + this.facul.getSpec().getNumberOfGroup());
        System.out.println();
        System.out.println("Группа:");
        System.out.println("Номер группы - " + this.facul.getSpec().getGroup().getGroupNumber());
        System.out.println("Количество студентов в группе - " + this.facul.getSpec().getGroup().getNumberOfStudents());
    }
}
