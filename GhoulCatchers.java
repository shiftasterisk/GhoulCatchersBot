package GhoulCatchersBot;

/**
 * run this class when on the actual ghoul catchers grid
 * may not move the ghoul catchers screen after execution. will calibrate after first execution
 * continues to run and process ghouls game after game.
 */
public class GhoulCatchers 
{
	static long startTime = System.currentTimeMillis();
	public static int gamesWon = 0;

	public static void main(String[] args) throws Exception
	{
		Thread.sleep(5000);
		Settings settings = new Settings();
		Game game = new Game(settings);

		while(gamesWon < settings.gamesToPlay)
		{
			game.autoPlay();
		}
		System.out.println("Total time - " + (System.currentTimeMillis() - startTime) / 60000 + " minutes");
	}
}
