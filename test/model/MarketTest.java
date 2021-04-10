package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.jupiter.api.Test;

import exceptions.NotTodayException;
import exceptions.TIException;

public class MarketTest {
	
	private Market market;
	
	public void setupScenary1() {
	}
	
	public void setupScenary2() {
		market = new Market();
	}
	
	@Test
	public void test() {
		setupScenary1();
		
		Market mar = new Market();
		
		assertNotNull(mar.getDoc());
		assertTrue(mar.getDoc().isEmpty());
		
	}
	
	@Test
	public void testAdd1() throws NotTodayException, TIException{
		setupScenary2();
		
		String type = "PP";
		int numberId = 321213;
		int day = 14;
		
		boolean added = market.addDocument(type, numberId, day);
		assertTrue(added);
			
		List<Document> document = market.getDoc();
		assertEquals(1, document.size());
		
		Document doc = document.get(0);
		assertEquals(type,doc.getType());
		assertEquals(numberId,doc.getNumberId());
		assertEquals(day,doc.getDay());
	}
	
	@Test
	public void testAdd2(){
		setupScenary2();
		
		String type = "TI";
		int numberId = 12313213;
		int day = 14;
		try {
		boolean added = market.addDocument(type, numberId, day);
		assertFalse(added);
		}catch(TIException e){
			e.printStackTrace();
		}catch(NotTodayException e) {
			fail();
		}
	}

	@Test
	public void testAdd3() throws NotTodayException, TIException{
		setupScenary2();
		
		String type = "CC";
		int numberId = 1006426560;
		int day = 12;
		
		try {
			boolean added = market.addDocument(type, numberId, day);
			assertFalse(added);
			}catch(TIException e){
				fail();
			}catch(NotTodayException e) {
				e.printStackTrace();
			}
	}

}
