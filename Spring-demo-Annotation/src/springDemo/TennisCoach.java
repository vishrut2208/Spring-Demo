package springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("inside the default constructor");
	}
	//public TennisCoach(FortuneService fortuneService) {
		//this.fortuneService = fortuneService;
	//}
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("kjdkanskjdkjasbd");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("lakhuihqiuqhwduyd");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return " practice daily your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
