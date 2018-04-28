package realise;

import java.util.HashMap;
import java.util.Map;

import cruds.ICRUD;
import model.MyEntity;

public class CRUDRealiser implements ICRUD {
	private Map<Integer, MyEntity> base = new HashMap<>();

	@Override
	public boolean create(MyEntity entity) {
		boolean flag = false;
		if(base.containsKey(entity.getId())) {
		
		} else {
			flag = true;
			base.put(entity.getId(), entity);
		}
		return flag;
	}

	@Override
	public MyEntity read(int id) {
		return base.get(id);
	}

	/** if we try to update not existing id, return false */
	@Override
	public boolean update(MyEntity entity) {
		boolean flag = false;
		if(!base.containsKey(entity.getId())) {
		
		} else {
			flag = true;
			base.put(entity.getId(), entity);
		}
		return flag;
	}

	@Override
	public boolean delete(int id) {
		boolean flag = false;
		if(!base.containsKey(id)) {
		
		} else {
			flag = true;
			base.remove(id);
		}
		return flag;
	}

}
