package ourproject.com.serviceimpl;

import java.util.List;

import ourproject.com.dao.ReceptionistDao;
import ourproject.com.daoimpl.ReceptionistDaoImpl;
import ourproject.com.model.Receptionist;
import ourproject.com.service.ReceptionistService;

public class ReceptionistServiceImpl implements ReceptionistService {

    ReceptionistDao receptionistDao = new ReceptionistDaoImpl();

    @Override
    public Receptionist createReceptionist(Receptionist receptionist) {
        return receptionistDao.createReceptionist(receptionist);
    }

    @Override
    public List<Receptionist> getAllReceptionists() {
        return receptionistDao.getAllReceptionists();
    }

    @Override
    public Receptionist getReceptionist(int receptionistId) {
        return receptionistDao.getReceptionist(receptionistId);
    }

    @Override
    public Receptionist updateReceptionist(int receptionistId, Receptionist receptionist) {
        return receptionistDao.updateReceptionist(receptionistId, receptionist);
    }

    @Override
    public String deleteReceptionist(int receptionistId) {
        return receptionistDao.deleteReceptionist(receptionistId);
    }
}


