
public class Iatros extends Xrhsths{
	String field;
	String patient_history;
	String appointments;
	String related_diseases;
	Boolean availability;
	
	
	Iatros(String username,String password,String email,int id,String announcement_feed,String field,String patient_history,String appointments,	String related_diseases,Boolean availability){
		super(username,password,email,id,announcement_feed);
		this.field=field;
		this.patient_history=patient_history;
		this.appointments=appointments;
		this.related_diseases=related_diseases;
		this.availability=availability;
	}

}
