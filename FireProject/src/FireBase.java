import com.firebase.client.Firebase;

public class FireBase {

	public static void main(String[] args) 
	{
		String url="https://project-4a819-default-rtdb.firebaseio.com/";
		
			Firebase fire=new Firebase(url);
			fire.child("name").setValue("Caleb");
			fire.child("address").setValue("39 Hillhurst Blvd");
			System.out.println("Ajouté");
		

	}

}
