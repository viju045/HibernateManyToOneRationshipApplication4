package org.mahagan;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.User;
import org.mahagan.domain.Vehicles;

public class ManyToOneRelationshipApplicationHB4 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx =session.beginTransaction();

        //Vehical list of User1
        User user = new User();
        user.setUserName("Ajay");

        Vehicles vehicles = new Vehicles();
        vehicles.setVehicalName("BMW");
        vehicles.setVehicalType("Four_wheeler");
        vehicles.setVehicalNumber(9591);

        Vehicles vehicles1 = new Vehicles();
        vehicles1.setVehicalName("Honada");
        vehicles1.setVehicalType("To_wheeler");
        vehicles1.setVehicalNumber(7435);

        Vehicles vehicles2 = new Vehicles();
        vehicles2.setVehicalName("Hornet");
        vehicles2.setVehicalType("To_wheeler");
        vehicles2.setVehicalNumber(7211);

        vehicles.setUser( user);
        vehicles1.setUser( user);
        vehicles2.setUser( user);

        session.persist(vehicles);
        session.persist(vehicles1);
        session.persist(vehicles2);

        //Vehical List of User2
        User user1 = new User();
        user1.setUserName("Vijay");

        Vehicles vehicles3 = new Vehicles();
        vehicles3.setVehicalName("TATA");
        vehicles3.setVehicalType("Four_wheeler");
        vehicles3.setVehicalNumber(8486);

        Vehicles vehicles4 = new Vehicles();
        vehicles4.setVehicalName("Kawasaki");
        vehicles4.setVehicalType("To_wheeler");
        vehicles4.setVehicalNumber(0001);

        Vehicles vehicles5 = new Vehicles();
        vehicles5.setVehicalName("Scoda");
        vehicles5.setVehicalType("Four_wheeler");
        vehicles5.setVehicalNumber(7610);

        vehicles3.setUser(user1);
        vehicles4.setUser(user1);
        vehicles5.setUser(user1);

        session.persist(vehicles3);
        session.persist(vehicles4);
        session.persist(vehicles5);

        tsx.commit();
        session.close();

        System.out.println("Data Inserted successfully Ok!");

    }
}