package com.springpractice.demo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach coach = new BaseballCoach();
		Coach coach2 = new TrackCoach();
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
		
	}

}
