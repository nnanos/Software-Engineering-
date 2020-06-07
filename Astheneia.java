
public class Astheneia {

	private String name;
	private String description;
	private String[] symptoms;
	private String[] effective_meds;
	private int[] num_of_cases_per_period;
	
	public Astheneia(String name, String description, String[] symptoms, String[] effective_meds, int[] num_of_cases_per_period) {
		
		this.name = name;
		this.description = description;
		this.symptoms = symptoms;
		this.effective_meds = effective_meds;
		this.num_of_cases_per_period = num_of_cases_per_period;
	}
	
	public void deseasesPerPeriodGraph(int[] num_of_cases_per_period){
    	}
	
	public int[] get_num_of_cases_per_period(int periods_selected){
		int[] array = new int[num_of_cases_per_period.length];
		for (int i = 0; i < periods_selected.length; i++) {
			array[i] = num_of_cases_per_period[i];
		
		return array;
	}
		
	
}
