package com.example.FinalWebServices.RockPaperScissors;

import java.util.Random;

public class GameModel {
	
	//Generates computers choice.
	public static String computerChoice() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(2) + 1;
		
		switch(randomNumber) {
		case 0:
			return "rock";
					
		case 1:
			return "paper";
					
		case 2:
			return "scissors";
					
		}
		return null;
	}
	
	//Checks if user input either rock, paper or scissors.
	public static boolean validMove(String choice) {
		if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
			return true;
		}
		return false;
	}
	
	//Checks who wins the game.
	public static String whoWins(String choice) {
		String computerChoice = computerChoice();
		if(validMove(choice.toLowerCase())) {
			String playerChoice = choice;	
			if(playerChoice.equals("rock")) {
				if(computerChoice.equals("rock")) {
					Score.setTies(Score.getTies() +1);
					Score.setGames(Score.getGames() + 1);
					return "{ \"Result\":\"Tie\"}";
				}
				if(computerChoice.equals("paper")) {
					Score.setComputerScore(Score.getComputerScore() + 1);
					Score.setGames(Score.getGames() + 1);
					String pattern = "{ \"Player choose\":\"%s\", \n, \"Computer choose\":\"%s\", \n, \"Winner\":\"Computer\"}";
					return String.format(pattern, playerChoice, computerChoice);
				}
				if(computerChoice.equals("scissors")) {
					Score.setPlayerScore(Score.getPlayerScore() + 1);
					Score.setGames(Score.getGames() + 1);
					String pattern = "{ \"Player choose\":\"%s\", \n, \"Computer choose\":\"%s\", \n, \"Winner\":\"Player\"}";
					return String.format(pattern, playerChoice, computerChoice);
				}
				
			}
			
			if(playerChoice.equals("paper")) {
				if(computerChoice.equals("rock")) {
					Score.setPlayerScore(Score.getPlayerScore() + 1);
					Score.setGames(Score.getGames() + 1);
					String pattern = "{ \"Player choose\":\"%s\", \n, \"Computer choose\":\"%s\", \n, \"Winner\":\"Player\"}";
					return String.format(pattern, playerChoice, computerChoice);
				}
				if(computerChoice.equals("paper")) {
					Score.setTies(Score.getTies() +1);
					Score.setGames(Score.getGames() + 1);
					return "{ \"Result\":\"Tie\"}";
				}
				if(computerChoice.equals("scissors")) {
					Score.setComputerScore(Score.getComputerScore() + 1);
					Score.setGames(Score.getGames() + 1);
					String pattern = "{ \"Player choose\":\"%s\", \n, \"Computer choose\":\"%s\", \n, \"Winner\":\"Computer\"}";
					return String.format(pattern, playerChoice, computerChoice);
				}
			}
			
			if(playerChoice.equals("scissors")) {
				if(computerChoice.equals("rock")) {
					Score.setComputerScore(Score.getComputerScore() + 1);
					Score.setGames(Score.getGames() + 1);
					String pattern = "{ \"Player choose\":\"%s\", \n, \"Computer choose\":\"%s\", \n, \"Winner\":\"Computer\"}";
					return String.format(pattern, playerChoice, computerChoice);
				}
				if(computerChoice.equals("paper")) {
					Score.setPlayerScore(Score.getPlayerScore() + 1);
					Score.setGames(Score.getGames() + 1);
					String pattern = "{ \"Player choose\":\"%s\", \n, \"Computer choose\":\"%s\", \n, \"Winner\":\"Player\"}";
					return String.format(pattern, playerChoice, computerChoice);
				}
				if(computerChoice.equals("scissors")) {
					Score.setTies(Score.getTies() +1);
					Score.setGames(Score.getGames() + 1);
					return "{ \"Result\":\"Tie\"}";
				}
			}
		}return "wrong choice";
		
		

		
		
	}

}
