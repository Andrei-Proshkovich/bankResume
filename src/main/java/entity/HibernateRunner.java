package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class HibernateRunner {

   private static SessionFactory sessionFactory;

   public static void main(String[] args) {

      sessionFactory = new Configuration().configure().buildSessionFactory();

      HibernateRunner hibernateRunner = new HibernateRunner();

      System.out.println("Adding developer's records to the DB");
         User user1 = new User(2L,"lol","lol","lol",new Date(1123132L),true);
      hibernateRunner.addDeveloper(user1);

      System.out.println("List of developers");

//      List developers = hibernateRunner.listDevelopers();
//      for (Developer developer : developers) {
//         System.out.println(developer);
//      }
//      System.out.println("===================================");
//      System.out.println("Removing Some Developer and updating Proselyte");
////      /**
//       * Update and Remove developers
//       */
//      hibernateRunner.updateDeveloper(10, 3);
//      hibernateRunner.removeDeveloper(11);
//
//      System.out.println("Final list of developers");
//      /**
//       * List developers
//       */
//      developers = hibernateRunner.listDevelopers();
//      for (Developer developer : developers) {
//         System.out.println(developer);
//      }
//      System.out.println("===================================");

   }

   public void addDeveloper(User user) {

      Session session = sessionFactory.openSession();
      Transaction transaction;

      transaction = session.beginTransaction();

      session.save(user);
      transaction.commit();
      session.close();
   }

//   public List listDevelopers() {
//      Session session = this.sessionFactory.openSession();
//      Transaction transaction = null;
//
//      transaction = session.beginTransaction();
//      List developers = session.createQuery("FROM Developer").list();
//
//      transaction.commit();
//      session.close();
//      return developers;
//   }
//
//   public void updateDeveloper(int developerId, int experience) {
//      Session session = this.sessionFactory.openSession();
//      Transaction transaction = null;
//
//      transaction = session.beginTransaction();
//      Developer developer = (Developer) session.get(Developer.class, developerId);
//      developer.setExperience(experience);
//      session.update(developer);
//      transaction.commit();
//      session.close();
//   }
//
//   public void removeDeveloper(int developerId) {
//      Session session = this.sessionFactory.openSession();
//      Transaction transaction = null;
//
//      transaction = session.beginTransaction();
//      Developer developer = (Developer) session.get(Developer.class, developerId);
//      session.delete(developer);
//      transaction.commit();
//      session.close();
//   }

}

