package springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	
	public void doMyStartupStuff() {
		
		System.out.println("inside startup");
	}
	
	// add a destroy method

	public void doMyCleanupStuff() {
		
		System.out.println("inside Cleanup");
	}
}
