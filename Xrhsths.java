
public class Xrhsths {
	
	public String username;
	public String password;
	public String email;
	public int  id;
	public String announcement_feed; 
	
	public Xrhsths(String username,String password,String email,int id,String announcement_feed){
		
	this.username=username;
	this.password=password;
	this.email=email;
	this.id=id;
	this.announcement_feed=announcement_feed;
	
	}
	
	public void viewFeed(String announcement_feed) {
		System.out.print(this.announcement_feed);
	
	}
	}
		
	


