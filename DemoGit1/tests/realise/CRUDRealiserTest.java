package realise;

import org.junit.Assert;
import org.junit.Test;

import model.MyEntity;

public class CRUDRealiserTest extends Assert {

	@Test
	public void testCreate() {
		CRUDRealiser crud = new CRUDRealiser();
		MyEntity entity = new MyEntity();
		entity.setId(1);
		assertTrue(crud.create(entity ));
		// no same entity second time 
		assertFalse(crud.create(entity ));
		
		// if added return not null
 		assertNotNull(crud.read(1 ));
 		// if no such id return null
 		assertNull(crud.read(2));
 		
 	// 	
 		assertTrue(crud.update(entity));
 		// we try to update not exists id, return false
 		entity.setId(2);
 		assertFalse(crud.update(entity));
 		
 		assertTrue(crud.delete(1));
 		assertFalse(crud.delete(2));
	}

	@Test
	public void testRead() {
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testDelete() {
	}

}
