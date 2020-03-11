package epam.cleancode;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleIntrest {
	private static final Logger logger2 = LogManager.getLogger(App.class);
	Scanner scanner=new Scanner(System.in);
	public void si(){
		float principleAmount= scanner.nextFloat();
		logger2.debug("principle ammount = "+principleAmount);
		float timeInYears= scanner.nextFloat();
		logger2.debug("time in years = "+timeInYears);
		float ratePerAnnum= scanner.nextFloat();
		logger2.debug("rate per annum = "+ratePerAnnum);
		logger2.info("calculating simpleintrest......");
		float simpleIntrest=(principleAmount*timeInYears*ratePerAnnum)/100f;
		principleAmount=principleAmount+simpleIntrest;
		logger2.fatal("Simple Intrest = "+simpleIntrest);
		logger2.warn("Return amount = "+principleAmount);
	
	}
}