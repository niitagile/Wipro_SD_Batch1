package model;
import javax.persistence.Embeddable;

@Embeddable
public class UserSkills {
	private String name;

	public UserSkills() {
	}

	public UserSkills(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserSkills [name=").append(name).append("]");
		return builder.toString();
	}

}
