package epam.cleancode_serialization;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger log = LogManager.getLogger(App.class);
	static {
		log.info("enter your specifications\nA.select material Standard:\n\t1.standard material"
	   			+ "\n\t2.above standard material\n\t3.high standard material\n\t4.high standard with fully automated\n");
		log.info("B.total area of house in squarefeet.\n");
		SpecificationsOfHouse house = new SpecificationsOfHouse();
		house.input();
		try {
			house.costCalculation();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public static void main( String[] args )
    {
        
    }
}
