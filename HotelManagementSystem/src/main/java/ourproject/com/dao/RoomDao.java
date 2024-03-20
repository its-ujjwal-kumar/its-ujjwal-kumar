package ourproject.com.dao;
import java.util.List;
import ourproject.com.model.Room;

public interface RoomDao {
    Room createRoom(Room room);
    List<Room> getAllRooms();
    Room getRoom(int roomNumber);
    Room updateRoom(int roomNumber, Room room);
    String deleteRoom(int roomNumber);
}

