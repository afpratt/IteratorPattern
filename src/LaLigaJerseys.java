
public class LaLigaJerseys implements Jersey{
	static final int MAX_ITEMS = 20;
	int numberOfItems = 0;
	JerseyItem[] jerseyItems;
	
	public LaLigaJerseys() {
		jerseyItems = new JerseyItem[MAX_ITEMS];
		
		addItem("Alaves",
				"2020/21 Home Alaves Jersey", 99.99);
		addItem("Athletic Bilbao",
				"2020/21 Home Athletic Bilbao Jersey", 99.99);
		addItem("Atletico Madrid",
				"2020/21 Home Atletico Madrid Jersey", 99.99);
		addItem("Barcelona",
				"2020/21 Home Barcelona Jersey", 99.99);
		addItem("Cadiz",
				"2020/21 Home Cadiz Jersey", 99.99);
		addItem("Celta Vigo",
				"2020/21 Home Celta Vigo Jersey", 99.99);
		addItem("Eibar",
				"2020/21 Home Eibar Jersey", 99.99);
		addItem("Elche",
				"2020/21 Home Elche Jersey", 99.99);
		addItem("Getafe",
				"2020/21 Home Getafe Jersey", 99.99);
		addItem("Granada",
				"2020/21 Home Granada Jersey", 99.99);
		addItem("Huesca",
				"2020/21 Home Huesca Jersey", 99.99);
		addItem("Levante",
				"2020/21 Home Levante Jersey", 99.99);
		addItem("Osasuna",
				"2020/21 Home Osasuna Jersey", 99.99);
		addItem("Real Betis",
				"2020/21 Home Real Betis Jersey", 99.99);
		addItem("Real Madrid",
				"2020/21 Home Real Madrid Jersey", 99.99);
		addItem("Real Sociedad",
				"2020/21 Home Real Sociedad Jersey", 99.99);
		addItem("Real Villadolid",
				"2020/21 Home Real Villadolid Jersey", 99.99);
		addItem("Sevilla FC",
				"2020/21 Home Sevilla FC Jersey", 99.99);
		addItem("Valencia",
				"2020/21 Home Valencia Jersey", 99.99);
		addItem("Villarreal",
				"2020/21 Home Villarreal Jersey", 99.99);
	}
	
	public void addItem(String name,
			String description,
			double price)
	{
		JerseyItem jerseyItem = new JerseyItem(name, description, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("All 20 La Liga teams are already listed. Unable to add new jersey.");
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
		return new LaLigaJerseyIterator(jerseyItems);
	}
}
