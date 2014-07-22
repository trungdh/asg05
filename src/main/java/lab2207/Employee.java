package lab2207;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Employee extends Person{
	double salary;
	public Employee()
	{
		super();
		salary = 0;
	}
	public Employee(String name, Date birthday, double salary)
	{
		super(name, birthday);
		this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		String s = String.format("%1$,.2f", salary);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return "name : " + name + ", Birthday : " + format.format(birthday) + ", Salary : " + s; 
		//this.toString();
		//String.format("%s,%d",super.toString(),salary);
	}
}