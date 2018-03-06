package com.santha.examples;

public class LambdaExample1 {

	public static void main(String[] args) {

		//Imperative wey of calling it without param
		TennisInterface tennisInterface = new TennisInterface() {		
			public void play() {
				System.out.println("Play Tennis \n");				
			}
		};		
		tennisInterface.play();

		//Imperative wey of calling it with a param
		SoccerInterface soccerInterface = new SoccerInterface() {		
			public void play(String teamName) {
				System.out.println("Play Soccer for - " + teamName);				
			}
		};
		soccerInterface.play("Johnston Dragons \n");
		
		
		//Change project compliance to JRE 1.8
		
		//Lambda example without param
		TennisInterface lambdaInterface1 = () -> {
			System.out.println("[LAMBDA WAY] Play Tennis \n");
		};
		lambdaInterface1.play();
		
		//final String teamName = "Waukee Warriors";
		SoccerInterface lambdaInterface2 = (teamName) -> {
			System.out.println("[LAMBDA WAY] Play Soccer for " + teamName + "\n");
		};
		lambdaInterface2.play("Waukee Warriors!!");
		
	}

}
