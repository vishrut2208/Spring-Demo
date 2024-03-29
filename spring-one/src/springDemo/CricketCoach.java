package springDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		
	}
	
	
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 mins";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	
	

}
