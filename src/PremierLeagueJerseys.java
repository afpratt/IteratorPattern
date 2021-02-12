
public class PremierLeagueJerseys implements Jersey {
	static final int MAX_ITEMS = 20;
	int numberOfItems = 0;
	JerseyItem[] jerseyItems;
	
	public PremierLeagueJerseys() {
		jerseyItems = new JerseyItem[MAX_ITEMS];
		
		addItem("Arsenal",
				"2020/21 Home Arsenal Jersey", 99.99);
		addItem("Aston Villa",
				"2020/21 Home Aston Villa Jersey", 99.99);
		addItem("Brighton and Hove Albion",
				"2020/21 Home Brighton and Hove Albion Jersey", 99.99);
		addItem("Burnley",
				"2020/21 Home Burnley Jersey", 99.99);
		addItem("Chelsea",
				"2020/21 Home Chelsea Jersey", 99.99);
		addItem("Crystal Palace",
				"2020/21 Home Crystal Palace Jersey", 99.99);
		addItem("Everton",
				"2020/21 Home Everton Jersey", 99.99);
		addItem("Fulham",
				"2020/21 Home Fulham Jersey", 99.99);
		addItem("Leeds United",
				"2020/21 Home Leeds United Jersey", 99.99);
		addItem("Leicester City",
				"2020/21 Home Leicester City Jersey", 99.99);
		addItem("Liverpool",
				"2020/21 Home Liverpool Jersey", 99.99);
		addItem("Manchester City",
				"2020/21 Home Manchester City Jersey", 99.99);
		addItem("Manchester United",
				"2020/21 Home Manchester United Jersey", 99.99);
		addItem("Newcastle United",
				"2020/21 Home Newcastle United Jersey", 99.99);
		addItem("Sheffield United",
				"2020/21 Home Sheffield United Jersey", 99.99);
		addItem("Southampton",
				"2020/21 Home Southampton Jersey", 99.99);
		addItem("Tottenham Hotspur",
				"2020/21 Home Tottenham Hotspur Jersey", 99.99);
		addItem("West Bromwich Albion",
				"2020/21 Home West Bromwich Albion Jersey", 99.99);
		addItem("West Ham United",
				"2020/21 Home West Ham United Jersey", 99.99);
		addItem("Wolverhampton Wanderers",
				"2020/21 Home Wolverhampton Wanderers Jersey", 99.99);
	}
	
	public void addItem(String name,
			String description,
			double price)
	{
		JerseyItem jerseyItem = new JerseyItem(name, description, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("All 20 Premier League teams are already listed. Unable to add new jersey.");
		}
		else {
			jerseyItems[numberOfItems] = jerseyItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public JerseyItem[] getJerseyItems() {
		return jerseyItems;
	}

	public Iterator createIterator() {
		return new PremierLeagueJerseyIterator(jerseyItems);
	}
}
