package shallowClone;

public class Student implements Cloneable{
	private String name;
	private int age;
	private Teacher teacher;
	
	
	public Student(String name,int age,Teacher teacher){
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Object clone(){
		Student student = null;
		try {
			student = (Student)super.clone();
			//student.teacher = (Teacher)teacher.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace(System.err);
		}
		return student;
	}
}
