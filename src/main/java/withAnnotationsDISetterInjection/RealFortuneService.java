package withAnnotationsDISetterInjection;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("fortuneService")  // this will be auto-wired into "coach" Bean using setter injection
public class RealFortuneService implements FortuneService {

	public String getFortune() {
		Random rand = new Random();
		String[] fortunes = {
				"Happy Day",
				"Sad Day",
				"Lucky Day",
				"Unlucky Day",
				"Entirely Normal Day"
		};
		return fortunes[rand.nextInt(fortunes.length)];
	}
}
