package teachmeskills.diplom.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import teachmeskills.diplom.entity.User;

import java.sql.Date;

public class HibernateRunner {

   private static SessionFactory sessionFactory;

   public static void main(String[] args) {

      sessionFactory = new Configuration().configure().buildSessionFactory();

      HibernateRunner hibernateRunner = new HibernateRunner();

      System.out.println("Adding user's records to the DB");
         User user1 = new User(2L,"lol","lol","lol",new Date(1123132L),true);
      hibernateRunner.addUser(user1);

      System.out.println("List of developers");

//      List users = hibernateRunner.listDevelopers();
//
//         System.out.println(users);
//
//      System.out.println("===================================");
//      System.out.println("Removing Some User and updating Proselyte");
////      /**
//       * Update and Remove developers
//       */
//      hibernateRunner.updateDeveloper(10, 3);
      hibernateRunner.removeUser(1L);
//
//      System.out.println("Final list of developers");
//      /**
//       * List developers
//       */
//      developers = hibernateRunner.listDevelopers();
//      for (User user : developers) {
//         System.out.println(user);
//      }
//      System.out.println("===================================");

   }

   public void addUser(User user) {

      Session session = sessionFactory.openSession();
      Transaction transaction;

      transaction = session.beginTransaction();

      session.save(user);
      transaction.commit();
      session.close();
   }

//   public List listUser(() {
//      Session session = this.sessionFactory.openSession();
//      Transaction transaction = null;
//
//      transaction = session.beginTransaction();
//      List users = (List) session.createQuery("FROM User").list();
//
//      transaction.commit();
//      session.close();
//      return users;
//   }

   public void updateUsers(int userId, String email) {
      Session session = this.sessionFactory.openSession();
      Transaction transaction = null;

      transaction = session.beginTransaction();
      User user = session.get(User.class, userId);
      user.setEmail(email);
      session.update(user);
      transaction.commit();
      session.close();
   }

   public void removeUser(Long userId) {
      Session session = this.sessionFactory.openSession();
      Transaction transaction = null;

      transaction = session.beginTransaction();
      User user = (User) session.get(User.class, userId);
      session.delete(user);
      transaction.commit();
      session.close();
   }

}

