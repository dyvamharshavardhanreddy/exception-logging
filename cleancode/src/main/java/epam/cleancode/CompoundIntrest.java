package epam.cleancode;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CompoundIntrest {
	private static final Logger logger1 = LogManager.getLogger(App.class);
	Scanner scanner=new Scanner(System.in);
	public void ci(){
		float compoundIntrest = 0;
		float principleAmount= scanner.nextFloat();
		logger1.debug("principle ammount = "+principleAmount);
		float timeInYears= scanner.nextFloat();
		logger1.debug("time in years = "+timeInYears);
		float ratePerAnnum= scanner.nextFloat();
		logger1.debug("rate per annum = "+ratePerAnnum);
		logger1.info("calculating compoundintrest......");
			for(int i=1;i<=timeInYears;i++) {
				compoundIntrest=(principleAmount*ratePerAnnum)/100f;
				principleAmount=principleAmount+compoundIntrest;
			}
		    logger1.fatal("compound Intrest = "+ compoundIntrest);
		    logger1.warn("Return amount = "+ principleAmount);
	}
}
