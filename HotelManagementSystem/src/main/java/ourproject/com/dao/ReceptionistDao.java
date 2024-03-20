package ourproject.com.dao;

import ourproject.com.model.Receptionist;
import java.util.List;

public interface ReceptionistDao {
    Receptionist createReceptionist(Receptionist receptionist);
    List<Receptionist> getAllReceptionists();
    Receptionist getReceptionist(int receptionistId);
    Receptionist updateReceptionist(int receptionistId, Receptionist receptionist);
    String deleteReceptionist(int receptionistId);
}

