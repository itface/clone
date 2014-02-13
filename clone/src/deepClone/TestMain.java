package deepClone;

import shallowClone.Teacher;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teacher teacher = new Teacher("wrt",26);
		Student student = new Student("lj",25,teacher);
		Student student2 = (Student)student.clone();
		student2.getTeacher().setAge(27);
		System.out.println(teacher.getAge()+":"+student.getTeacher().getAge()+":"+student2.getTeacher().getAge());

	}

}
