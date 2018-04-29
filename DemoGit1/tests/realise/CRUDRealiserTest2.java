package realise;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.MyEntity;

public class CRUDRealiserTest2 extends Assert {
	private static CRUDRealiser crud;
	private MyEntity entity;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		crud = new CRUDRealiser();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// MyEntity entity = new MyEntity();
		entity = new MyEntity();
		entity.setId(1);
		entity.setName("User1");
		crud.create(entity);
	}

	@After
	public void tearDown() throws Exception {
		crud.delete(1);
	}

	@Test
	public void testCreate() {
		entity.setId(3);
		assertTrue(crud.create(entity));
		// no same entity second time
		assertFalse(crud.create(entity));

	}

	@Test
	public void testRead() {
		// if added return not null
		assertNotNull(crud.read(1));
		// if no such id return null
		assertNull(crud.read(2));
	}

	@Test
	public void testUpdate() {
		entity = new MyEntity();
		entity.setId(1);
		entity.setName("User2");
		assertTrue(crud.update(entity));
		// we try to update not exists id, return false
		entity.setId(2);
		assertFalse(crud.update(entity));
	}

	@Test
	public void testDelete() {

		assertTrue(crud.delete(1));
		assertFalse(crud.delete(2));
	}

}
