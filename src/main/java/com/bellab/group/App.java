package com.bellab.group;


import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.bellab.group.entity.Student;
import com.bellab.group.entity.Student_method2;
import com.bellab.group.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hi");			
        Transaction transaction = null;

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            //creating transaction object
            transaction = session.beginTransaction();


            Student_method2 student = new Student_method2("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");

//            session.save(student);
            session.persist(student);//persisting the object  

            transaction.commit();//transaction is committed  

            session.close();  

      } catch (Exception e) {
          if (transaction != null) {
          	transaction.rollback();
          }
          e.printStackTrace();
      }
          
          System.out.println("successfully saved");  
  	}        
        
//        try {
//        	Session session = HibernateUtil.getSessionFactory().openSession();
//            // start a transaction
//            transaction = session.beginTransaction();
//            // save the student objects
//            session.save(student);
//            session.save(student1);
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
        
//        https://github.com/RameshMF/Hibernate-ORM-Tutorials/blob/master/hibernate-java-config-example/src/main/java/net/javaguides/hibernate/App.java
//        List < Student > students = studentDao.getStudents();
//        students.forEach( s -> System.out.println(s.getFirstName()));        
        
        //creating configuration object  
//        Configuration cfg=new Configuration();  
//        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
//
//        //creating seession factory object  
//        SessionFactory factory=cfg.buildSessionFactory();  
//        
//        
//        //creating session object  
//        Session session=factory.openSession();  
        




}
