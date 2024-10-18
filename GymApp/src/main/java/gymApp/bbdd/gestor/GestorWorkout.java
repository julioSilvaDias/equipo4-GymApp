package gymApp.bbdd.gestor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import gymApp.bbdd.pojos.Workout;

public class GestorWorkout {
	public ArrayList<Workout> getAllWorkouts() {
		ArrayList<Workout> ret = null;
		try {
			FileInputStream fileInputStream = new FileInputStream("/bbdd/utils/gymapp.json");
			FirestoreOptions firestoreOptions = FirestoreOptions.getDefaultInstance().toBuilder()
					.setProjectId("gymapp-4565e").setCredentials(GoogleCredentials.fromStream(fileInputStream)).build();
			Firestore firestore = firestoreOptions.getService();
			
			ApiFuture<QuerySnapshot> query = firestore.collection("Workouts").get();
			QuerySnapshot querySnapshot = query.get();
			List<QueryDocumentSnapshot> workouts = querySnapshot.getDocuments();
			
			for(QueryDocumentSnapshot workout : workouts) {
				Workout workOut = new Workout();
				
			}
			
			
		} catch (FileNotFoundException fileNotFoundException) {

		}catch(IOException ioexception){
			
		}catch( ExecutionException executionException){
			
		}catch(InterruptedException interruptedException) {
			
		};
		return ret;
	}
}
