public class Perioxi{
    protected String area_name;
    protected Medical_institution[] med_insts;
    protected Astheneia[] deseases;

	public  Perioxi(String name,Medical_institution[] area_Medical_institutions,Astheneia[] area_deseases){
		this.area_name = name;
		this.med_ints = area_Medical_institutions;
		this.deseases = area_deseases;
	}
	
	public Medical_institution[] getMedicalInsts(){
		return med_ints;
	}	
	
	/*
	calculateRemainingResources(Medical_institution med_int_under_considaration,Analwsimos_Poros poros){
	
	}
	
	estimateLackOfRecources(Medical_institution med_insts){
	}
	
	
	dangerEstimation(){
	}
	*/

}	
	

	
