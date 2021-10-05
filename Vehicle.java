interface Vehicledispinfo
{
public abstract void VehicleDisplay(); 
}
   class  Vehicledetails implements Vehicledispinfo{
     
	 public void VehicleDisplay(){
		 final int registrationnum=67465;
		 final int vehiclenumber=1234;
		 String vehicletype= "4 tier ";
		 System.out.println("registration num is=" + registrationnum);
		 System.out.println("vehicle number is=" + vehiclenumber);
		 System.out.println("vehicle type ="+ vehicletype);

	 }
	 void Vehicleprice()
	   {
		 double price=50000.0;
	
		System.out.println("price is :" + price);
	}
}
class Vehicle{
	public static void main(String[] args){
		Vehicledispinfo refobj= new Vehicledetails();
		Vehicledetails obj =new Vehicledetails();
		refobj.VehicleDisplay();
		obj.Vehicleprice();
	}
}

