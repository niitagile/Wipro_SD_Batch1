package model;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.search.annotations.IndexedEmbedded;

@Entity
public class UserProfile {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private String name;
	private String email;
	private String phone;
	private String gender;
	private String dateOfBirth;

	private String summary;

	private Date created_date;
	private Date last_modified;

	@ElementCollection
	@IndexedEmbedded
	private List<UserSkills> skills;

	public UserProfile() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getLast_modified() {
		return last_modified;
	}

	public void setLast_modified(Date last_modified) {
		this.last_modified = last_modified;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserProfile [id=").append(id).append(", name=")
				.append(name).append(", email=").append(email)
				.append(", phone=").append(phone).append(", gender=")
				.append(gender).append(", dateOfBirth=").append(dateOfBirth)
				.append(", summary=").append(summary).append(", created_date=")
				.append(created_date).append(", last_modified=")
				.append(last_modified).append(", skills=").append(skills)
				.append("]");
		return builder.toString();
	}

	public List getSkills() {
		return skills;
	}

	public void setSkills(List <UserSkills>skills) {
		this.skills = skills;
	}
}