package com.roshanonjava.hibernate.HibernateOneToMany;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("unchecked")
    public static void main(String[] args) {
 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
 
       /* Department department = new Department();
        department.setDepartmentName("Sales");
        session.save(department);
         
        Employee emp1 = new Employee("Nina", "Mayers", "111");
        Employee emp2 = new Employee("Tony", "Almeida", "222");
 
        emp1.setDepartment(department);
        emp2.setDepartment(department);
         
        session.save(emp1);
        session.save(emp2);
        */		
        
        Transaction transaction= new Transaction();
        transaction.setFirstName("Puspa");
        transaction.setLastName("Mutha");
        transaction.setCreatedDate(new Date());
        session.save(transaction);
        
        Item item= new Item();
        item.setAmount(500L);
        item.setItemName("Shirt");
        item.setItemDescription("NA");
        item.setCreatedDate(new Date());
        item.setTransaction(transaction);
        session.save(item);
        Item item1= new Item();
        item1.setAmount(1000L);
        item1.setItemName("Pant");
        item1.setItemDescription("NA");
        item1.setCreatedDate(new Date());
        item1.setTransaction(transaction);
        session.save(item1);
        session.getTransaction().commit();
        session.close();
        //Get values.
        /*Session session1 = sf.openSession();
        session1.beginTransaction();
        Object obj = session1.get(Transaction.class, 2L);
        if(obj!=null){
        	Transaction tr= (Transaction)obj;
        	System.out.println(tr.getItems().size());
        }
        session1.getTransaction().commit();
        session1.close();*/
    }
}
