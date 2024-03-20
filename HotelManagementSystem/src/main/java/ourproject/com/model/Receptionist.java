package ourproject.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Receptionist{
@Id

@Column(name="receptionist_id",length=50)
int receptionistid;

@Column(name="name",length=50)
String name;

@Column(name="phone",length=50)
String phone;

public Receptionist(int receptionistid, String name, String phone) {
	super();
	this.receptionistid = receptionistid;
	this.name = name;
	this.phone = phone;
}

public int getReceptionistid() {
	return receptionistid;
}

public void setReceptionistid(int receptionistid) {
	this.receptionistid = receptionistid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public Receptionist() {
	super();
	// TODO Auto-generated constructor stub
}



}
