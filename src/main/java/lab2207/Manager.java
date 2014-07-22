package lab2207;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Manager extends Employee{
	Employee assistant;
	public Manager()
	{
		super();
	}
	public Manager(String name, Date birthday, double salary)
	{
		super(name,birthday,salary);
	}
	public String toString()
	{
		String s = String.format("%1$,.2f", salary);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return "Name : " + name + ", Birthday : " + format.format(birthday) + ", Salary : "+ s;
		//String.format("%s",this.toString());
	}
	public void setAssistant(Employee newbie)
	{
		assistant = newbie;
	}
}