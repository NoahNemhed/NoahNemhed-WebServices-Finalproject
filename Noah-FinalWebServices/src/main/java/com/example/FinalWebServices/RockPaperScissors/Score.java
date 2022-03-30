package com.example.FinalWebServices.RockPaperScissors;

public class Score {
	static int playerScore;
	static int computerScore;
	static int games;
	static int ties;
	public static int getPlayerScore() {
		return playerScore;
	}
	public static void setPlayerScore(int playerScore) {
		Score.playerScore = playerScore;
	}
	public static int getComputerScore() {
		return computerScore;
	}
	public static void setComputerScore(int computerScore) {
		Score.computerScore = computerScore;
	}
	public static int getGames() {
		return games;
	}
	public static void setGames(int games) {
		Score.games = games;
	}
	public static int getTies() {
		return ties;
	}
	public static void setTies(int ties) {
		Score.ties = ties;
	}
	
	
	
	

}
