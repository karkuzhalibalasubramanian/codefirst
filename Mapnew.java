import java.util.HashMap;
import java.util.*;

 public class Mapnew
{   
	public static Scanner in;
	public static void main(String[] args) 
	{
		HashMap <Integer,String> maplist= new HashMap<>();
		 Scanner in=new Scanner(System.in);
		 int size=in.nextInt();
		 System.out.println("Enter"+size+"items");
		 for(int i=0;i<size; i++){
			  Integer x=in.nextInt();
			  String y=in.next();
			  maplist.put(x,y);
		 }

		 System.out.println(maplist);
         
		maplist.put(04,"red");
		System.out.println("inserted values:"+maplist);

        String removekey= maplist.remove(02);
		System.out.println("removed value:"+maplist);
	}
}
