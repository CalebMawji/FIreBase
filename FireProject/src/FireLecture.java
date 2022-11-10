import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class FireLecture {

	public static void main(String[] args) throws InterruptedException
	{
		String url="https://project-4a819-default-rtdb.firebaseio.com/Star";
		
			Firebase fire=new Firebase(url);
			fire.addValueEventListener(new ValueEventListener()
			{
				@Override
				public void onDataChange(DataSnapshot ds)
				{
					for(DataSnapshot data:ds.getChildren())
					{
						System.out.println(data.getKey());
					}
				}
				public void onCancelled(FirebaseError fe)
				{}
			});
			Thread.sleep(20000);

	}
}
