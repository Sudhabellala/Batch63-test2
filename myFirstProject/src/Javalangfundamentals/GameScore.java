package Javalangfundamentals;

public class GameScore {
	int score=100;
	void resetScore() {
		score=0;
		System.out.println("Score After Reset: "+score);	
	}

	public static void main(String[] args) {
		GameScore g=new GameScore();
		g.resetScore();
		
	}

}
