import java.util.HashMap;
import java.util.Map;

import com.firebase.client.Firebase;

public class FireHash {

	public static void main(String[] args) 
	{
		String url="https://project-4a819-default-rtdb.firebaseio.com/";
		
			Firebase fire=new Firebase(url);
			Map<String, String> map=new HashMap<>();
				
				map.put("name", "Caleb");
				map.put("address", "39 Hillhurst Blvd");
				map.put("phone", "647 863 9026");
				
			fire.child("Students").setValue(map);
			System.out.println("ajouté....");

	}

}
