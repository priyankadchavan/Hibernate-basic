package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarUpdate2 {
	public static void main(String []args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("priya");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		 
		Car car1= entityManager.find(Car.class, 2);
		car1.setBrand("hyundai");
		if(car1!=null) {
			entityTransaction.begin();
			entityManager.merge(car1);
			entityTransaction.commit();
			System.out.println("value updated");
			}
		else {
			System.out.println("value not updated");
		}
	}

}
