package Java_Assignment51;
/*
 * This class will help to master the concepts of Inheritance and Abstract class .
 * Problem Statement:
 * Create an abstract class Parent and define an abstract methods in it and implement it in the child
class

 */

public class Java_Assignment5_1 
{


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AbstractDemo Ab = new AbstractDemo(); // creating the instance of AbstractDemo class
		Ab.callme();//calling abstract method
		Ab.normal();//calling normal method

	}

}
abstract class BaseA // Abstract class 
{
	abstract void callme(); // Abstract method
	public void normal() // public method
	{
		System.out.println("\nThis is concrete method");
	}  
}
class AbstractDemo extends BaseA //Derived class from  abstract class
{
	void callme() // defined the defination for callme method by overriding the abstract function
	{
	   System.out.println("\nThis is callme."); 
	}
}