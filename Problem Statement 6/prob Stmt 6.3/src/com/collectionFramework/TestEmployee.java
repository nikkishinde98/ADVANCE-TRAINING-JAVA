package com.collectionFramework;

import java.util.Vector;


public class TestEmployee {
	public static void main(String[]args) {
		Vector<Employee> v=addInput();
		display(v);
	}
	public static Vector<Employee> addInput(){
		Employee e1=new Employee(701,"Megha","Shendge");
		Employee e2=new Employee(702,"Pooja","Rawal");
		Employee e3=new Employee(703,"Abhishek","Nikam");
		Vector<Employee>v = new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;



	}
	public static void display(Vector<Employee>v)
	{
		for(Employee e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}

}
