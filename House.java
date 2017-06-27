package Session4Assignment2;
//Program to illustrate "Has a" relationship 
public class House extends Building{
	String owner;
	String name;
	Address addr;
	
	//House has "Address" . The Address object reference has to be passed here while constructing the House object.
	
	public House(int nfloor, int nrooms, String owner, String name, Address addr) {
		super(nfloor, nrooms);
		this.owner = owner;
		this.name = name;
		this.addr = addr;
	}

	


	public void display()
	{
		System.out.println("Name of the house is " +this.name);
		System.out.println("Owner of the house is " +this.owner);
		System.out.println("Number of rooms in the house are" +this.nrooms);
		System.out.println("Address :  " +" Dr.No : " + this.addr.drno +", " +this.addr.street+ ", " +this.addr.area );
	}

	
	

}
