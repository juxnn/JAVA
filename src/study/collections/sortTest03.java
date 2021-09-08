package study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortTest03 {

	static class Person{
		
		String name;
		int age;

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

		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}


		@Override
		public String toString() {
			return "Person[name="+ name + ", age=" + age +"]";
		}
	}
	
	static class nameLengthCompare implements Comparator<Person>{
		
		@Override
		public int compare(Person p1, Person p2) {
			
			return p1.getName().length() > p2.getName().length() ? 1
					: p1.getName().length() < p2.getName().length() ? -1 : 0;
		}
	}
	
	public static void main(String[] args) {
		
		List<Person> nameList = new ArrayList<>();
		
		nameList.add(new Person("Parkkk", 30));
		nameList.add(new Person("Choi", 26));
		nameList.add(new Person("Kim", 29));
		
		System.out.println("- 정렬 전" + nameList);
		
		Collections.sort(nameList, new nameLengthCompare());
		
		System.out.println("- 정렬 후" + nameList);
		
	}
}
