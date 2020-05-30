public class Poliths extends Xrhsths{
	public String symptoms;
	public String[] registered_meds;
	public int prescription_code;
	public ProgrammaTherapeias therapy_program;
	
	public Poliths(String username, String password, String email, int id, String announcement_feed, ProgrammaTherapeias therapy_program) {
		super(username, password, email, id, announcement_feed);
		
		this.registered_meds = registered_meds;
		this.prescription_code = prescription_code;
		this.therapy_program = therapy_program;
	}
	
	//test main
	public static void main(String[] args) {
		
	}
}
