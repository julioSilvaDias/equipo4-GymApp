package gymApp.bbdd.pojos;

import java.util.Objects;

public class Ejercicio extends Workout{
	String description;
	String image;
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(description, image, name);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejercicio other = (Ejercicio) obj;
		return Objects.equals(description, other.description) && Objects.equals(image, other.image)
				&& Objects.equals(name, other.name);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Ejercicio [description=" + description + ", image=" + image + ", name=" + name + ", video=" + video
				+ ", exercises=" + exercises + ", nivel=" + nivel + "]";
	}
	
	
}
