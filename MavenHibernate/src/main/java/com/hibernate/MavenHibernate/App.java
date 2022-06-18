package com.hibernate.MavenHibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException, IOException
    {
        System.out.println( "Running..." );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
//        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
        
        //creating movie
        Movie movie= new Movie();
        movie.setId(1);
        movie.setName("Schindlers list");
        movie.setDirector("Steven Spielberg");
        System.out.println(movie);
        
        //creating object of DirectorName
        DirectorName dn = new DirectorName();
        dn.setFirstName("Rajkumar");
        dn.setSecondName("Hirani");
        dn.setPopular(true);
        dn.setAddedDate(new Date());
        dn.setX(11.1111);
        
        //reading image 
        FileInputStream file= new FileInputStream("/home/ahimsha/eclipse-workspace/Hibernate/MavenHibernate/src/main/java/rick.png");
        byte[] data= new byte[file.available()];
        file.read(data);
        dn.setImage(data);
        
        Session session= factory.openSession();
        //open session is used to open session for the first time 
       Transaction tx= session.beginTransaction();
        session.save(movie);
        session.save(dn);
//        session.getTransaction().commit();
        tx.commit();
        session.close();
    }
}
