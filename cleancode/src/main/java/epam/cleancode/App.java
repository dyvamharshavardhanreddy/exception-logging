package epam.cleancode;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{
	private static final Logger log = LogManager.getLogger(App.class);
	static {
		log.info("enter 'simpleintrest or compoundintrest' for calculating simple intrest or compound intrest\n");
		Scanner scanner=new Scanner(System.in);
		String ch=scanner.next();
		log.debug(ch+"selected");
		switch(ch) {
		case "simpleintrest":
			SimpleIntrest o1=new SimpleIntrest();
				o1.si();
				break;
		case "compoundintrest":
			CompoundIntrest o2=new CompoundIntrest();
				o2.ci();
				break;
		default:log.error("check spelling and re run the program");
		}
    	scanner.close();
	}
    public static void main( String[] args )
    {
    		
    }
}
