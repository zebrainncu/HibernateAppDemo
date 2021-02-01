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

        		// 1.加載主配置文件
        		/*
        		 https://www.bilibili.com/video/BV1G4411K7Kx?p=17&spm_id_from=pageDriver
        		 
        		 Hibernate可以使用XML檔案或properties檔案來配置SessionFactory，
        		 預設的配置文件名稱為 hibernate.cfg.xml或hibernate.properties，
        		 使用下面的方式來讀入文件以配置Hibernate：
        			Configuration config = new Configuration().configure();
        			
        		當您使用new建構Configuration物件時，會讀取Classpath路徑下的 hibernate.properties，
        		如果您呼叫Configuration的configure()方法沒有指定路徑與檔案名稱時，則會再讀取 Classpath路徑下的hibernate.cfg.xml，如果有與hibernate.properties相同的屬性設定，
        		則 hibernate.cfg.xml中的設定會覆蓋hibernate.properties中的設定。			 
        		 */
        		Configuration configure = new Configuration().configure();//"hibernate.cfg.xml"
        		// 2.創建Session物件
        		SessionFactory sessionFactory = configure.buildSessionFactory();          
                
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return sessionFactory;
    }
}
