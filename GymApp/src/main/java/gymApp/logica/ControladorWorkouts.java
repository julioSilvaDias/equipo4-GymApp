package gymApp.logica;

import java.util.ArrayList;

import gymApp.bbdd.gestor.GestorWorkout;
import gymApp.bbdd.pojos.Workout;

public class ControladorWorkouts {
	
	public ArrayList<Workout> getAllWorkouts() {
		ArrayList<Workout> ret = null;
		
		GestorWorkout gestorWorkout = new GestorWorkout();
		ret = gestorWorkout.getAllWorkouts(); 
		
		return ret;
	}
}
