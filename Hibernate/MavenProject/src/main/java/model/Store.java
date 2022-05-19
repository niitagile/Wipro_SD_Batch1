package model;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.ogm.cfg.OgmConfiguration;



public class Store {
	public static void main(String[] args) {
		
		 SessionFactory sessionFactory=new OgmConfiguration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
	   
		Transaction tx = session.beginTransaction();
		
		UserProfile userProfile = new UserProfile();
		
		userProfile.setName("Ajay Kumar Gupta");
		userProfile.setPhone("1234567890");
		userProfile.setEmail("ajay@domain.com");
		userProfile.setSummary("This is my Objective");
		userProfile.setGender("Male");
		userProfile.setDateOfBirth("02-Aug-1986");
		userProfile.setCreated_date(new Date());
		userProfile.setLast_modified(new Date());
		
		UserSkills skill1 = new UserSkills("Java,J2EE");
		UserSkills skill2 = new UserSkills("Spring");
		UserSkills skill3 = new UserSkills("Angular");
		UserSkills skill4 = new UserSkills("Big Database");
		UserSkills skill5 = new UserSkills("Hibernate");
		UserSkills skill6 = new UserSkills("C/C++");
		UserSkills skill7 = new UserSkills("Oracle");
		
		ArrayList<UserSkills> userSkills = new ArrayList<UserSkills>();
		userSkills.add(skill7);
		userSkills.add(skill6);
		userSkills.add(skill5);
		userSkills.add(skill4);
		userSkills.add(skill3);
		userSkills.add(skill2);
		userSkills.add(skill1);

		userProfile.setSkills(userSkills);
		
		// Save a Document into MongoDB
		session.save(userProfile);
		
		// fetch a Document from MongoDB
		System.out.println(userProfile.getId());
		UserProfile get_useProfile =  (UserProfile)session.get(UserProfile.class,userProfile.getId());
		System.out.println(" Fetch UserProfile Information :"+get_useProfile);
		
		tx.commit();
		session.close();

	    
	   
		
	}

}
