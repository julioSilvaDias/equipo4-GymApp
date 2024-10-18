package gymApp.bbdd.pojos;

import java.util.Objects;

public class Workout {
	String video;
	int exercises;
	String name;
	int nivel;
	@Override
	public int hashCode() {
		return Objects.hash(exercises, name, nivel, video);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Workout other = (Workout) obj;
		return exercises == other.exercises && Objects.equals(name, other.name) && nivel == other.nivel
				&& Objects.equals(video, other.video);
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public int getExercises() {
		return exercises;
	}
	public void setExercises(int exercises) {
		this.exercises = exercises;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "Workout [video=" + video + ", exercises=" + exercises + ", name=" + name + ", nivel=" + nivel + "]";
	}
	
	
}
