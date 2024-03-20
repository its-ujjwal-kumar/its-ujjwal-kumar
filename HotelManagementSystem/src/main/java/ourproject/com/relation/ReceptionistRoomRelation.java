package ourproject.com.relation;

import javax.persistence.*;

import ourproject.com.model.*;

@Entity
public class ReceptionistRoomRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "receptionist_id")
    private Receptionist receptionist;

    @ManyToOne
    @JoinColumn(name = "room_number")
    private Room room;

	public ReceptionistRoomRelation(int id, Receptionist receptionist, Room room) {
		super();
		this.id = id;
		this.receptionist = receptionist;
		this.room = room;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public ReceptionistRoomRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    // Constructors, getters, and setters
}

