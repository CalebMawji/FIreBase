import java.util.HashMap;
import java.util.Map;
import com.firebase.client.Firebase;

public class FireBaseWithId {

	public static void main(String[] args) 
	{
		String url="https://project-4a819-default-rtdb.firebaseio.com/Star";
		
			Firebase fire=new Firebase(url);
			Map<String, String> map=new HashMap<String, String>();
			
				map.put("name", "Salimah");
				map.put("address", "39 Hillhurst Blvd");
				map.put("phone", "647 863 9026");
				
			fire.push().setValue(map);
			System.out.println("ajouté avec Id");

	}

}
