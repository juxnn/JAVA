package study.generic;

import java.util.Arrays;

public class WildCardExample {

	public static class Person{
		private String type;

		public Person(String type) {
			this.type = type;
		}
		
		@Override
		public String toString() {
			return type;
		}
	}
	
	public static class Student extends Person{

		public Student(String type) {
			super(type);
		}	
	}

	public static class Worker extends Person{
		public Worker(String type) {
			super(type);
		}
	}
	
	public static class HighStudent extends Student{
		public HighStudent(String type) {
			super(type);
		}
	}

	
	public static void registerCourse( Course<?> course ) {
		System.out.println( course.getName() + "수강생" + 
				Arrays.toString(course.getStudents()) );
	}
	
	public static void registerCourseStudent( Course<? extends Student> course ) {
		System.out.println(course.getName() + "수강생" + 
				Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker( Course<? super Worker> course ) {
		System.out.println(course.getName() + "수강생" + 
				Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<Student> highStudentCourse = new Course<Student>("고등학생 과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);
		//registerCourseWorker(highStudentCourse);
		
		//출력값이 참조로 나오는게 맞는 것 같은데,
		//책에서는 내가 작성한 field인 type으로 출력된다.
		//소스가 다 나와있지 않아서 잘 모르겠는데 고민을 해보자.
		
	}
	
}
