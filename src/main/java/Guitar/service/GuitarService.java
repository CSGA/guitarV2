package Guitar.service;
import java.util.List;

import Guitar.dao.GuitarDao;
import Guitar.dao.GuitarDaoImpl;
import Guitar.entity.Guitar;
import Guitar.entity.GuitarSpec;

public class GuitarService {

	private GuitarDaoImpl guitarDao=new GuitarDaoImpl();
	
	public List<Guitar> getAll(GuitarSpec spec) {
		// TODO Auto-generated method stub
		return guitarDao.getAll(spec);
	}

	public GuitarDaoImpl getGuitarDaoImpl() {
		return guitarDao;
	}

	public void setGuitarDaoImpl(GuitarDaoImpl guitarDaoImpl) {
		this.guitarDao = guitarDaoImpl;
	}


}
