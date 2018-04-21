package com.abhishek.tutorial.corejava;

class Container<T>
{
	T value;
	public void show()
	{
		System.out.println(value.getClass().getName());
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	
}

public class GenericsSample {

	public static void main(String[] args) {
		
		Container<Double> obj = new Container<>();
		obj.setValue(22.02);
		
		obj.show();

	}

}
