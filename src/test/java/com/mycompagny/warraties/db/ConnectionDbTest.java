package com.mycompagny.warraties.db;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class ConnectionDbTest {
	
	private ConnectionDb connectionDb = new ConnectionDb();
	
	
	@Ignore
	@Test
	public void getConnectionTest() {
		String result = connectionDb.getConnection();
		Assert.assertEquals("ssss", result);
		
	}
	
	@Test
	public void sommeTest() {
		int result = connectionDb.somme(5, 6);
		Assert.assertEquals(12, result);
		
	}

}
