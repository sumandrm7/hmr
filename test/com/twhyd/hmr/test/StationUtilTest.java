package com.twhyd.hmr.test;

import static org.junit.Assert.*;
import com.twhyd.hmr.suman.*;

import org.junit.Test;

public class StationUtilTest {

	@Test
	public void testCalculateStationsInBetween() {
		assertEquals(18, StationUtil.calculateStationsInBetween("A4","B12"));
		assertEquals(22, StationUtil.calculateStationsInBetween("C1","C23"));
		assertEquals(6, StationUtil.calculateStationsInBetween("X2","B16"));
	}

	@Test
	public void testCalculateFare(){
		assertEquals(10, StationUtil.calcualteFare("A1", "A2"),0.0f);
		assertEquals(25, StationUtil.calcualteFare("A1", "A10"),0.0f);
		assertEquals(24, StationUtil.calcualteFare("B1", "B11"),0.0f);
		assertEquals(13, StationUtil.calcualteFare("C1", "C5"),0.0f);

		assertEquals(46.50, StationUtil.calcualteFare("A4", "B12"),0.0f);
		assertEquals(10, StationUtil.calcualteFare("A10", "C13"),0.0f);
		assertEquals(13, StationUtil.calcualteFare("A10", "C10"),0.0f);
		
	}
	
	@Test
	public void testIsOnSameLine(){
		assertEquals(false, StationUtil.isOnSameLine("A1", "B1"));
		assertEquals(true, StationUtil.isOnSameLine("C1", "X3"));
		assertEquals(true, StationUtil.isOnSameLine("B7", "X2"));
	}
	
	@Test
	public void testGetInterChangeStationCode(){
		assertEquals("X2",StationUtil.getInterChangeStationCode("A1", "B14"));
		assertEquals("X3",StationUtil.getInterChangeStationCode("C8", "B16"));
		assertEquals("X1",StationUtil.getInterChangeStationCode("C20", "A1"));
	}
	
	@Test
	public void testGetLine(){
	    assertEquals("L1",StationUtil.getConnectingLine("A23", "A3"));
	    assertEquals("L3",StationUtil.getConnectingLine("X3", "C21"));
	    assertEquals("L2",StationUtil.getConnectingLine("B13", "X2"));
	}	
	
}
