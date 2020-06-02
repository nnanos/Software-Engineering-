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
	
	public String getSymptoms()
    {
        return symptoms;
    }
    
    public void setSymptoms(String symptoms){
        this.symptoms=symptoms;}
        
        
    public String[] getRegisteredMeds()
    {
        return registered_meds;
    }
    
    public void setRegisteredMeds(String[] registered_meds){
        this.registered_meds=registered_meds;}
        
    public int getPrescriptionCode()
    {
        return prescription_code;
    }
    
    public void setPrescriptionCode(int prescription_code){
        this.prescription_code=prescription_code;}   
        
	
	//test main
	public static void main(String[] args) {
		
	}
}
