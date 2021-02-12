
public class LaLigaJerseyIterator implements Iterator {
	JerseyItem[] items;
	int position = 0;
	
	public LaLigaJerseyIterator(JerseyItem[] items) {
		this.items = items;
	}
	
	public JerseyItem next() {
		return items[position++];
	}
	
	public boolean hasNext() {
		return items.length > position;
	}
}
