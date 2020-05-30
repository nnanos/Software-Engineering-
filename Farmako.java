public class Farmako {

	private String[] name;
	private int id;
	private String description;
	private int quantity;
	private int price;
	
	public Farmako(String[] name, int id, String description, int quantity, int price) {
		
		this.name = name;
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void registerMed(Poliths civilian, Farmako med) {
		
		civilian.registered_meds = med.name;
	}
}
