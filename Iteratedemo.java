import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;

class  Iteratedemo
{
	public static void main(String[] args) 
	{
		List<String> newlist=new ArrayList<String>();
		newlist.add("1");
		newlist.add("2");
		newlist.add("3");
        newlist.add("4");
		newlist.add("5");
		newlist.add("6");
		newlist.add("7");
		newlist.add("8");
		newlist.add("9");
		newlist.add("1o");
		 System.out.println(newlist);
		 System.out.println("list numbers are:");
			 for(String strlist: newlist){
			 System.out.print(strlist+"\t");
  
			 }
	Iterator<String> mapvalue=newlist.iterator();
while(mapvalue.hasnext()){
	System.out.println(mapvalue.next());
	}
	}
}
