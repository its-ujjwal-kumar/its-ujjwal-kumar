package ourproject.com.relation;

import javax.persistence.*;

import ourproject.com.model.*;

@Entity
public class UserRoomRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_number")
    private Room room;

	public UserRoomRelation(int id, User user, Room room) {
		super();
		this.id = id;
		this.user = user;
		this.room = room;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public UserRoomRelation() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

    // Constructors, getters, and setters
}

