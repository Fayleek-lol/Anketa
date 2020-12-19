public class Main
{
	public static void main(String[] args) {
		Form form = new Form();
		
		form.getFacul().getSpec().getGroup().getStud().setStudentCourse(2);
		form.getFacul().getSpec().getGroup().getStud().setDateOfBirth("09.09.2001");
		form.getFacul().getSpec().getGroup().getStud().setFullName("Горин С.М.");
		form.getFacul().getSpec().getGroup().getStud().setMaritalStatus("не женат");
		form.getFacul().getSpec().getGroup().getStud().setRecordBook("90123456");
		form.getFacul().getSpec().getGroup().getStud().setFamilyInformation("отсутствует");
		
		form.getFacul().getSpec().getGroup().setGroupNumber("90001997");
		form.getFacul().getSpec().getGroup().setNumberOfStudents(1024);
		
		form.getFacul().getSpec().setCodeSpecialty(123);
		form.getFacul().getSpec().setManagerName("Арийцев Г.И.");
		form.getFacul().getSpec().setNameSpecialty("электроники");
		form.getFacul().getSpec().setYearSpecialty(1997);
		form.getFacul().getSpec().setNumberOfGroup(104);
		
		form.getFacul().setYearFaculty(1997);
		form.getFacul().setNameFaculty("Информационщики");
		form.getFacul().setNameDean("Сталин В.А.");
		form.getFacul().setNumberOfSpecialties(115);
		form.getFacul().setNumberOfStudentsAll(100006);
		
		form.printAboutObject();
	}
}
