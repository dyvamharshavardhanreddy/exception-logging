package epam.cleancode_serialization;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
public class SpecificationsOfHouse   {
	private static final Logger logger = LogManager.getLogger(App.class);
	public int materialStandard;
	public float totalAreaOfHouse;
	public float cost;
	public void input() {
		Scanner scanner=new Scanner(System.in);
		materialStandard = scanner.nextInt();
		totalAreaOfHouse = scanner.nextFloat();
		scanner.close();
	}
	public void costCalculation() throws IOException {
		if(materialStandard== 1) {
			logger.debug("you have selected STANDARD MATERIAL");
			logger.debug("the given area in square feet="+totalAreaOfHouse);
			float cost = totalAreaOfHouse*1200;
		    logger.info("construction cost = "+ cost);
		    logger.warn("Low cost");
		}
		else if(materialStandard==2) {
			logger.debug("you have selected ABOVE STANDARD MATERIAL");
			logger.debug("the given area in square feet="+totalAreaOfHouse);
			float cost = totalAreaOfHouse*1500;
			logger.info("construction cost = "+ cost);
			logger.warn("Medium cost");
		}
		else if(materialStandard==3) {
			logger.debug("you have selected HIGH STANDARD MATERIAL");
			logger.debug("the given area in square feet="+totalAreaOfHouse);
			float cost = totalAreaOfHouse*1800;
			logger.info("construction cost = "+ cost);
		    logger.warn("High cost");
		}
		else if(materialStandard==4) {
			logger.debug("you have selected HIGH STANDARD MATERIAL WITH FULLY AUTOMATED");
			logger.debug("the given area in square feet="+totalAreaOfHouse);
			float cost = totalAreaOfHouse*2500;
			logger.info("construction cost = "+ cost);
		    logger.warn("Too High cost");
		}
		else {
			logger.error("\ninvalid data");
		}
		
	}
}
