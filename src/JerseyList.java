
public class JerseyList {
	Jersey premierLeagueJerseys;
	Jersey laLigaJerseys;
	
	public JerseyList(Jersey premierLeagueJerseys, Jersey laLigaJerseys) {
		this.premierLeagueJerseys = premierLeagueJerseys;
		this.laLigaJerseys = laLigaJerseys;
	}
	
	public void printJerseyList() {
		Iterator premierLeagueIterator = premierLeagueJerseys.createIterator();
		Iterator laLigaIterator = laLigaJerseys.createIterator();
		
		System.out.println("-PREMIER LEAGUE JERSEYS-");
		printJerseyList(premierLeagueIterator);
		System.out.println("\n-LA LIGA JERSEYS-");
		printJerseyList(laLigaIterator);
	}
	
	private void printJerseyList(Iterator iterator) {
		while (iterator.hasNext()) {
			JerseyItem jerseyItem = iterator.next();
			System.out.println(jerseyItem.getName() + ", $" + jerseyItem.getPrice() + ", ");
			System.out.println(jerseyItem.getDescription() + "\n");
		}
	}
}
