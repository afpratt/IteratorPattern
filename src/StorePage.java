
public class StorePage {

	public static void main(String[] args) {
		Jersey premierLeagueJerseys = new PremierLeagueJerseys();
		Jersey laLigaJerseys = new LaLigaJerseys();
		
			JerseyList jerseyList = new JerseyList(premierLeagueJerseys, laLigaJerseys);
			
			jerseyList.printJerseyList();
	}

}
