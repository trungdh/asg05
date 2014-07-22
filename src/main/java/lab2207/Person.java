package lab2207;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Person
{
	String name;
	Date birthday;
	public Person(){
		name ="";
		birthday = new Date(1,1,1);
	}
	public Person(String name,Date birthday )
	{
		this.name = name;
		this.birthday = birthday;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return String.format("%s , %s", name,format.format(birthday));
	}
}