package com.abhishek.tutorial.examples;

class Person
{
	int id;
	String name;
	public Person(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString()
		{
			return "Person [id ="+id+" name ="+name+"]";
		
		}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class ComparisonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(1, "Abhishek");
		Person p2 = new Person(1, "Abhishek");
		System.out.println(p1.equals(p2));
		
		System.out.println((p1==p2));
		
		Double d1 = 4.7;
		Double d2 = 4.7;
		
		System.out.println(d1.equals(d2));
		
		System.out.println((d1==d2));
		
		Integer i1= 5;
		Integer i2=5;
		
        System.out.println(i1.equals(i2));
		System.out.println((i1==i2));
		
		
		String s1="Hello";
		String s2="Hello".substring(0, 5);
		
		System.out.println(s1.equals(s2));
		System.out.println((s1==s2));

	}

}
