import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest2 {

	@Test
	public void testPlayer2wins()throws TennisGameException {
		// Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		//fail("Not yet implemented");
		String i = game.getScore();
		assertSame(i, "player2 wins");
	}

}
