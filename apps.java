package com.tele.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Teacher.class);
    	Configuration con1 = new Configuration().configure().addAnnotatedClass(Courses.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t=session.beginTransaction();
        
 
        
//        Course1 details
        Courses c=new Courses();
        c.setId(1);
        c.setCourse_name("Java Programming");
        c.setDutarion("4 Months");
  
//         course 2 details
        Courses c1=new Courses();
        c1.setId(2);
        c1.setCourse_name("Python Programming");
        c1.setDutarion("3 Months");
  
//         course2 details
        Courses c2=new Courses();
        c2.setId(3);
        c2.setCourse_name("Angular Programming");
        c2.setDutarion("3.5 Months");
        
//        teacher details
        Teacher t1=new Teacher();
        t1.setName("Mrudula");
        t1.setId(1);
        t1.getCourse().add(c);
        t1.getCourse().add(c1);
        t1.getCourse().add(c2);
        
        session.persist(t1);
        t.commit();
        session.close();

        System.out.println( "My name is Himanshu" );
        
    }
}
