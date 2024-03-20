package ourproject.com.daoimpl;

import org.hibernate.Session;
import ourproject.com.model.Receptionist;
import java.util.List;

import org.hibernate.HibernateException;
import ourproject.com.dao.ReceptionistDao;
import ourproject.com.util.HibernateUtil;

public class ReceptionistDaoImpl implements ReceptionistDao {

    @Override
    public Receptionist createReceptionist(Receptionist receptionist) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(receptionist);
            session.getTransaction().commit();
            return receptionist;
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Receptionist> getAllReceptionists() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Receptionist", Receptionist.class).list();
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Receptionist getReceptionist(int receptionistId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Receptionist.class, receptionistId);
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Receptionist updateReceptionist(int receptionistId, Receptionist receptionist) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Receptionist existingReceptionist = session.get(Receptionist.class, receptionistId);
            if (existingReceptionist != null) {
                existingReceptionist.setName(receptionist.getName());
                existingReceptionist.setPhone(receptionist.getPhone());
                // set other fields as needed
                existingReceptionist.setReceptionistid(receptionist.getReceptionistid()); // Setting receptionist id
                session.update(existingReceptionist);
                session.getTransaction().commit();
                return existingReceptionist;
            }
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public String deleteReceptionist(int receptionistId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Receptionist receptionist = session.get(Receptionist.class, receptionistId);
            if (receptionist != null) {
                session.delete(receptionist);
                session.getTransaction().commit();
                return "Receptionist deleted successfully.";
            }
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return "Failed to delete receptionist.";
    }
}





/*
public class ReceptionistDaoImpl implements ReceptionistDAO {

    private final SessionFactory sessionFactory;

    public ReceptionistDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addReceptionist(Receptionist receptionist) {
        Session session = sessionFactory.getCurrentSession();
        session.save(receptionist);
    }

    @Override
    public Receptionist getReceptionistById(int receptionistId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Receptionist.class, receptionistId);
    }

    @Override
    public void updateReceptionist(Receptionist receptionist) {
        Session session = sessionFactory.getCurrentSession();
        session.update(receptionist);
    }

    @Override
    public void deleteReceptionist(int receptionistId) {
        Session session = sessionFactory.getCurrentSession();
        Receptionist receptionist = session.get(Receptionist.class, receptionistId);
        if (receptionist != null) {
            session.delete(receptionist);
        }
    }
}*/
