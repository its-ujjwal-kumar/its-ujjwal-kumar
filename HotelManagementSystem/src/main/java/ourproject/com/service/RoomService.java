package ourproject.com.service;
import ourproject.com.model.Room;
import java.util.List;

public interface RoomService {
    Room createRoom(Room room);
    List<Room> getAllRooms();
    Room getRoom(int roomNumber);
    Room updateRoom(int roomNumber, Room room);
    String deleteRoom(int roomNumber);
}

