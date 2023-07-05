/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 7:46 PM
 * Project : ManyToOneRelationshipApplicationHB4
 **/

package org.mahagan;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.User;
import org.mahagan.domain.Vehicles;

import java.util.Iterator;
import java.util.List;

public class ManyToOneRelationshipApplicationFetchDataHB4 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx =session.beginTransaction();

        TypedQuery query = session.createQuery("from Vehicles vehicles");
        List<Vehicles>list = query.getResultList();
        Iterator<Vehicles>iterator = list.listIterator();

        while(iterator.hasNext())
        {
            Vehicles vehicles = iterator.next();
            System.out.println(vehicles.getVehicalName()+"-"+vehicles.getVehicalType()+"-"+vehicles.getVehicalNumber());

            User user = vehicles.getUser();
            System.out.println(user.getUserName());
        }
        session.close();
        System.out.println("Data Fetched Successfully");
    }
}
