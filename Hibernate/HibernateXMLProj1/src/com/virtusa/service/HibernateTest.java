package com.virtusa.service;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.virtusa.beans.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			UserDetails user=new UserDetails();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter user id");
			user.setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter username");
			user.setUsername(sc.nextLine());
			
			
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
					Session session=sessionFactory.openSession();
					session.beginTransaction();
					session.save(user);
					
					session.getTransaction().commit();

			
	}

}
