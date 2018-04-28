package cruds;

import model.MyEntity;

public interface ICRUD {
	boolean create(MyEntity entity);

	MyEntity read(int id);

	boolean update(MyEntity entity);

	boolean delete(int id);

}

