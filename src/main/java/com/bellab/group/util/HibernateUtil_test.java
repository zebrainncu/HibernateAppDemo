package com.bellab.group.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil_test {	

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

        		// 1.�[���D�t�m���
        		/*
        		 https://www.bilibili.com/video/BV1G4411K7Kx?p=17&spm_id_from=pageDriver
        		 
        		 Hibernate�i�H�ϥ�XML�ɮש�properties�ɮרӰt�mSessionFactory�A
        		 �w�]���t�m���W�٬� hibernate.cfg.xml��hibernate.properties�A
        		 �ϥΤU�����覡��Ū�J���H�t�mHibernate�G
        			Configuration config = new Configuration().configure();
        			
        		��z�ϥ�new�غcConfiguration����ɡA�|Ū��Classpath���|�U�� hibernate.properties�A
        		�p�G�z�I�sConfiguration��configure()��k�S�����w���|�P�ɮצW�ٮɡA�h�|�AŪ�� Classpath���|�U��hibernate.cfg.xml�A�p�G���Phibernate.properties�ۦP���ݩʳ]�w�A
        		�h hibernate.cfg.xml�����]�w�|�л\hibernate.properties�����]�w�C			 
        		 */
        		Configuration configure = new Configuration().configure();//"hibernate.cfg.xml"
        		// 2.�Ы�Session����
        		SessionFactory sessionFactory = configure.buildSessionFactory();          
                
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return sessionFactory;
    }
}
