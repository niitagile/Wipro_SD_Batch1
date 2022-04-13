package OOPs;

public class DriveClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setName("Heena");
		student.setMarks(34);
		
		Teacher teacher=new Teacher();
		teacher.setId(101);
		teacher.setName("Mohit");
		teacher.setSalary(500000.34f);

		
		//Read values
		System.out.println("Teacher's Information");
		System.out.println("id="+teacher.getId());
		System.out.println("name="+teacher.getName());
		System.out.println("salary="+teacher.getSalary());

	}

}
