package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("priya");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car car=entityManager.find(Car.class,1);
		car.setName("Thar");
		if(car!=null) {
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
			System.out.println("Value updated");
			
		}else {
			System.out.println("Value not updated");
		}
	}

}
