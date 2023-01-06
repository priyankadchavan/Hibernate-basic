package com.jsp.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllCars {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("priya");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    String sql="Select c FROM Car c";
	    Query query=entityManager.createQuery(sql);
	    List<Car> cars=query.getResultList();
	    for(Car c:cars) {
	    	System.out.println("================");
	    	System.out.println(c.getBrand());
	    	System.out.println(c.getName());
	    	System.out.println(c.getId());
	    }
	   
	}
}
