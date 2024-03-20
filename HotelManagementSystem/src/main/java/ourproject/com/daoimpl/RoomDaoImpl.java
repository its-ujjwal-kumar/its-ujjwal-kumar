package ourproject.com.daoimpl;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import ourproject.com.dao.RoomDao;
import ourproject.com.model.Room;
import ourproject.com.util.HibernateUtil;

public class RoomDaoImpl implements RoomDao {

    public Room createRoom(Room room) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(room);
            session.getTransaction().commit();
            return room;
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Room> getAllRooms() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Room", Room.class).list();
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Room getRoom(int roomNumber) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Room.class, roomNumber);
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Room updateRoom(int roomNumber, Room room) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Room existingRoom = session.get(Room.class, roomNumber);
            if (existingRoom != null) {
                existingRoom.setType(room.getType());
                existingRoom.setPrice(room.getPrice());
                // set other fields as needed
                existingRoom.setRoomnumber(room.getRoomnumber()); // Setting room number
                session.update(existingRoom);
                session.getTransaction().commit();
                return existingRoom;
            }
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public String deleteRoom(int roomNumber) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Room room = session.get(Room.class, roomNumber);
            if (room != null) {
                session.delete(room);
                session.getTransaction().commit();
                return "Room deleted successfully.";
            }
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return "Failed to delete room.";
    }
}

