public class Poliths extends Xrhsths{
	public String symptoms;
	public String registered_meds;
	public int prescription_code;
	
	public Poliths(String username, String password, String email, int id, String announcement_feed) {
		super(username, password, email, id, announcement_feed);
	}
	
	public static void main(String[] args) {
		Poliths f = new Poliths("kappa", "keepo", "kappa@mail.com", 1, "fresko");
		System.out.println(f.username + f.password + f.email + f.id);
	}
}
