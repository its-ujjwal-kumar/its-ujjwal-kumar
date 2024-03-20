package ourproject.com.serviceimpl;


import java.util.List;

import ourproject.com.dao.RoomDao;
import ourproject.com.daoimpl.RoomDaoImpl;
import ourproject.com.model.Room;
import ourproject.com.service.RoomService;

public class RoomServiceImpl implements RoomService {

    RoomDao roomDao = new RoomDaoImpl();

    @Override
    public Room createRoom(Room room) {
        return roomDao.createRoom(room);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomDao.getAllRooms();
    }

    @Override
    public Room getRoom(int roomNumber) {
        return roomDao.getRoom(roomNumber);
    }

    @Override
    public Room updateRoom(int roomNumber, Room room) {
        return roomDao.updateRoom(roomNumber, room);
    }

    @Override
    public String deleteRoom(int roomNumber) {
        return roomDao.deleteRoom(roomNumber);
    }
}

