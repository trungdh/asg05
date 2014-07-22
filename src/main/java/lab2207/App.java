package lab2207;
import java.util.Date;
/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.Date;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Person [] person = new Person[3];
		Employee newbie = new Employee("Newbie", new Date("2/10/1989"),1000000);
		Manager boss = new Manager("Boss", new Date("2/23/1986"),4000000);
		boss.setAssistant(newbie);
		Manager biggerBoss = new Manager("Big Boss", new Date("3/12/1969"),10000000);
		biggerBoss.setAssistant(boss);
		for(int i = 0; i <3; i++)
		{
			switch(i)
			{
				case 0:
				{
					person[i] = newbie;
					break;
				}
				case 1:
				{
					person[i] = boss;
					break;
				}
				case 2: 
				{
					person[i] = biggerBoss;
					break;
				}
			}
			System.out.println(person[i].toString());
		}
		/* code phan A
		System.out.println(newbie.toString());
		System.out.println(boss.toString());
		System.out.println(biggerBoss.toString());
        System.out.println( "Hello World!" );
		*/
    }
}
