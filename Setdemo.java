import java.util.HashSet;
import java.util.Set;

public  class  Setdemo
{
	public static void main(String[] args) 
	{  
		HashSet<String> setlist1=new HashSet<>();
		setlist1.add("red");
		setlist1.add("yellow");
		setlist1.add("green");
        setlist1.add("black");
		System.out.println( "Object1:"+setlist1);
		   

        HashSet<String> setlist2=new HashSet<>();
		setlist2.add("red");
		setlist2.add("blue");
		setlist2.add("white");
        setlist2.add("pink");
		System.out.println( "Object2:"+setlist2);
		   
		   setlist1.addAll(setlist2);
		   System.out.println("after merge:"+setlist2);

	}
}
