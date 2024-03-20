package ourproject.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Room{
@Id

@Column(name="room_number",length=50)
int roomnumber;

@Column(name="type",length=50)
String type;

@Column(name="price",length=50)
String price;

public Room(int roomnumber, String type, String price) {
	super();
	this.roomnumber = roomnumber;
	this.type = type;
	this.price = price;
}

public Room() {
	super();
	// TODO Auto-generated constructor stub
}

public int getRoomnumber() {
	return roomnumber;
}

public void setRoomnumber(int roomnumber) {
	this.roomnumber = roomnumber;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}


}
