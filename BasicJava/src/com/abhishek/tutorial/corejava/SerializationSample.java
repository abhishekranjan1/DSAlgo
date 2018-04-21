package com.abhishek.tutorial.corejava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Person<T> implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	T age; // you can provide age in integer or in float or double if you like
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	public Person(String name, T age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}


public class SerializationSample {

	public static void main(String[] args) {
		
          Person<Double> Mike = new Person<>("Mike",23.3);
          Person<Integer> Duke = new Person<>("Duke", 33);
          
          System.out.println(Mike);
          System.out.println(Duke);
          
          try(FileOutputStream fs= new FileOutputStream("people.bin")) {
        	  
        	  ObjectOutputStream os = new ObjectOutputStream(fs);
        	  
        	  os.writeObject(Mike);
        	  os.writeObject(Duke);
        	  
        	  os.close();
        	  
          } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	     

	}

}
