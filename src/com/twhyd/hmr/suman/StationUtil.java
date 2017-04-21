package com.twhyd.hmr.suman;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class StationUtil {

	static private Map<String,String> INTERCHANGE_STATION_MAP = new HashMap<>();
	static private Map<String,MetroStation> ALL_STATIONS_MAP = new HashMap<>();
	static private Map<String,Float> TARRIF_MAP = new HashMap<>();
	
	static private MetroLine LINE1 = new MetroLine(new String[]{"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10",
			                                            "X1","A12","A13","A14","A15","A16","A17","A18","A19","X2",
			                                            "A21","A22","A23","A24","A25","A26","A27"});
	
	static private MetroLine LINE2 = new MetroLine(new String[]{"B1","X3","B3","B4","B5","B6","B7","B8","B9","X2",
	                                                    "B11","B12","B13","B14","B15","B16"});
	
	static private MetroLine LINE3 = new MetroLine(new String[]{"C1","C2","C3","C4","C5","C6","C7","C8","X3","C10",
			                                            "C11","C12","C13","X1","C15","C16","C17","C18","C19","C20",
			                                            "C21","C22","C23"});

	static{
		intializeTarrifMap();
		intializeInterChangeStationMap();
		intializeAllStationsMap();
	}

	private static void intializeInterChangeStationMap() {
		INTERCHANGE_STATION_MAP.put("L1L2", "X2");
		INTERCHANGE_STATION_MAP.put("L2L3", "X3");
		INTERCHANGE_STATION_MAP.put("L1L3", "X1");
	}

	private static void intializeTarrifMap() {
		TARRIF_MAP.put("L1", (float) 2.5);
		TARRIF_MAP.put("L2", (float) 2);
		TARRIF_MAP.put("L3", (float) 3);
	}

	private static void intializeAllStationsMap() {

		ALL_STATIONS_MAP.put("X1", new MetroStation("X1","Ameerpet"));
		ALL_STATIONS_MAP.put("X2", new MetroStation("X2","MG Bus station"));
		ALL_STATIONS_MAP.put("X3", new MetroStation("X3","Parade Grounds"));
		
		ALL_STATIONS_MAP.put("A1", new MetroStation("A1","Miyapur"));
		ALL_STATIONS_MAP.put("A2", new MetroStation("A2","JNTU College"));
		ALL_STATIONS_MAP.put("A3", new MetroStation("A3","KPHB Colony"));
		ALL_STATIONS_MAP.put("A4", new MetroStation("A4","Kukatpally"));
		ALL_STATIONS_MAP.put("A5", new MetroStation("A5","Balanagar"));
		ALL_STATIONS_MAP.put("A6", new MetroStation("A6","Moosapet"));
		ALL_STATIONS_MAP.put("A7", new MetroStation("A7","Bharat Nagar"));
		ALL_STATIONS_MAP.put("A8", new MetroStation("A8","Erragadda"));
		ALL_STATIONS_MAP.put("A9", new MetroStation("A9","ESI Hospital"));
		ALL_STATIONS_MAP.put("A10", new MetroStation("A10","S R Nagar"));
		
		ALL_STATIONS_MAP.put("A12", new MetroStation("A12","Punjagutta"));
		ALL_STATIONS_MAP.put("A13", new MetroStation("A13","Irrum Manzil"));
		ALL_STATIONS_MAP.put("A14", new MetroStation("A14","Khairtabad"));
		ALL_STATIONS_MAP.put("A15", new MetroStation("A15","Lakdikapul"));
		ALL_STATIONS_MAP.put("A16", new MetroStation("A16","Assembly"));
		ALL_STATIONS_MAP.put("A17", new MetroStation("A17","Nampally"));
		ALL_STATIONS_MAP.put("A18", new MetroStation("A18","Gandhi Bhavan"));
		ALL_STATIONS_MAP.put("A19", new MetroStation("A19","Osmania Medical College"));
		
		ALL_STATIONS_MAP.put("A21", new MetroStation("A21","Malakpet"));
		ALL_STATIONS_MAP.put("A22", new MetroStation("A22","New Market"));		
		ALL_STATIONS_MAP.put("A23", new MetroStation("A23","Musarambagh"));
		ALL_STATIONS_MAP.put("A24", new MetroStation("A24","Dilsukhnagar"));
		ALL_STATIONS_MAP.put("A25", new MetroStation("A25","Chaitanyapuri"));
		ALL_STATIONS_MAP.put("A26", new MetroStation("A26","Victoria Memorial"));
		ALL_STATIONS_MAP.put("A27", new MetroStation("A27","L B Nagar"));		
		
		ALL_STATIONS_MAP.put("B1", new MetroStation("B1","JBS"));
		
		ALL_STATIONS_MAP.put("B3", new MetroStation("B3","Secundrabad"));
		ALL_STATIONS_MAP.put("B4", new MetroStation("B4","Gandhi Hospital"));
		ALL_STATIONS_MAP.put("B5", new MetroStation("B5","Musheerabad"));
		ALL_STATIONS_MAP.put("B6", new MetroStation("B6","RTC Cross Roads"));
		ALL_STATIONS_MAP.put("B7", new MetroStation("B7","Chikkadpally"));
		ALL_STATIONS_MAP.put("B8", new MetroStation("B8","Narayanguda"));
		ALL_STATIONS_MAP.put("B9", new MetroStation("B9","Sultan Bazar"));
		
		ALL_STATIONS_MAP.put("B11", new MetroStation("B11","Salarjung Museum"));
		ALL_STATIONS_MAP.put("B12", new MetroStation("B12","Charminar"));
		ALL_STATIONS_MAP.put("B13", new MetroStation("B13","Shalibanda"));
		ALL_STATIONS_MAP.put("B14", new MetroStation("B14","Shamsher Gunj"));
		ALL_STATIONS_MAP.put("B15", new MetroStation("B15","Jungametta"));
		ALL_STATIONS_MAP.put("B16", new MetroStation("B16","Falaknuma"));
		
		ALL_STATIONS_MAP.put("C1", new MetroStation("C1","Nagole"));
		ALL_STATIONS_MAP.put("C2", new MetroStation("C2","Uppal"));
		ALL_STATIONS_MAP.put("C3", new MetroStation("C3","Survey of India"));
		ALL_STATIONS_MAP.put("C4", new MetroStation("C4","NGRI"));
		ALL_STATIONS_MAP.put("C5", new MetroStation("C5","Habsiguda"));
		ALL_STATIONS_MAP.put("C6", new MetroStation("C6","Tarnaka"));
		ALL_STATIONS_MAP.put("C7", new MetroStation("C7","Mettuguda"));
		ALL_STATIONS_MAP.put("C8", new MetroStation("C8","Secundrabad"));

		ALL_STATIONS_MAP.put("C10", new MetroStation("C10","Paradise"));
		ALL_STATIONS_MAP.put("C11", new MetroStation("C11","Rasool Pura"));
		ALL_STATIONS_MAP.put("C12", new MetroStation("C12","Prakash Nagar"));
		ALL_STATIONS_MAP.put("C13", new MetroStation("C13","Begumpet"));

		ALL_STATIONS_MAP.put("C15", new MetroStation("C15","Madhura Nagar"));
		ALL_STATIONS_MAP.put("C16", new MetroStation("C16","Yusuf Guda"));
		ALL_STATIONS_MAP.put("C17", new MetroStation("C17","Road No 5 Jubliee Hills"));
		ALL_STATIONS_MAP.put("C18", new MetroStation("C18","Jubliee Hills Check Post"));
		ALL_STATIONS_MAP.put("C19", new MetroStation("C19","Pedamma Temple"));
		ALL_STATIONS_MAP.put("C20", new MetroStation("C20","Madhapur"));
		ALL_STATIONS_MAP.put("C21", new MetroStation("C21","Durgam Cheruvu"));
		ALL_STATIONS_MAP.put("C22", new MetroStation("C22","HITEC City"));
		ALL_STATIONS_MAP.put("C23", new MetroStation("C23","Shilparamam"));
	}
	
	public static String getLine(String MetroStationCode){
		
		String line = "";
	
		if (LINE1.hasStation(MetroStationCode))
			line = "L1";
		if (LINE2.hasStation(MetroStationCode))
			line = "L2";
		if (LINE3.hasStation(MetroStationCode))
			line = "L3";
		return line;
		
	}

	public static String getConnectingLine(String sourceCode, String destinationCode){
		
		String line = "";

		if(isOnSameLine(sourceCode, destinationCode)){
			if((LINE1.hasStation(sourceCode) && LINE1.hasStation(destinationCode)))
				line = "L1";
			if((LINE2.hasStation(sourceCode) && LINE2.hasStation(destinationCode)))
				line = "L2";
			if((LINE3.hasStation(sourceCode) && LINE3.hasStation(destinationCode)))
				line = "L3";
		}
		return line;
		
	}
	
public static String getInterChangeStationCode(String sourceCode, String destinationCode){
		
		String sourceLine = StationUtil.getLine(sourceCode);
		String destionationLine = StationUtil.getLine(destinationCode);;
		return (INTERCHANGE_STATION_MAP.get(sourceLine+destionationLine)==null)?
				    INTERCHANGE_STATION_MAP.get(destionationLine+sourceLine):
					INTERCHANGE_STATION_MAP.get(sourceLine+destionationLine);
	}

public static boolean isOnSameLine(String sourceCode, String destinationCode){

		return ((LINE1.hasStation(sourceCode) && LINE1.hasStation(destinationCode)) ||
		        (LINE2.hasStation(sourceCode) && LINE2.hasStation(destinationCode)) ||
		        (LINE3.hasStation(sourceCode) && LINE3.hasStation(destinationCode)));
	}
	
	public static float calcualteFare(String sourceCode, String destinationCode){

		float fare = 10f;
		boolean isJourneyOnSameLine = StationUtil.isOnSameLine(sourceCode, destinationCode);
		
		if(isJourneyOnSameLine){
			int stationsInBetween = StationUtil.calculateStationsOnSameLine(sourceCode, destinationCode);
			if(stationsInBetween>3){
				stationsInBetween-=3;
				fare += stationsInBetween * TARRIF_MAP.get(StationUtil.getConnectingLine(sourceCode, destinationCode));
			}
		}else{

			String interChangeStation = StationUtil.getInterChangeStationCode(sourceCode, destinationCode);
			int stationsInBetween = StationUtil.calculateStationsOnSameLine(sourceCode, interChangeStation);

			int stationWithInBaseFare = 3;
			
			if(stationsInBetween>stationWithInBaseFare){
				stationsInBetween-=3;
				stationWithInBaseFare=0;
			}else{
				stationsInBetween=0;
				stationWithInBaseFare-=stationsInBetween;
			}
			fare += stationsInBetween * TARRIF_MAP.get(StationUtil.getConnectingLine(sourceCode, interChangeStation));

			stationsInBetween = StationUtil.calculateStationsOnSameLine(interChangeStation, destinationCode);
			if(stationsInBetween>stationWithInBaseFare){
				stationsInBetween-=stationWithInBaseFare;
				fare += stationsInBetween * TARRIF_MAP.get(StationUtil.getConnectingLine(interChangeStation, destinationCode));
			}
		}
		
		return fare;
	}
	
	public static int calculateStationsOnSameLine(String sourceCode, String destinationCode){
		int stationsInBetween=0;
	
		if(isOnSameLine(sourceCode, destinationCode)){
			if((LINE1.hasStation(sourceCode) && LINE1.hasStation(destinationCode)))
				stationsInBetween = LINE1.getStationNumOntheLine(sourceCode) - LINE1.getStationNumOntheLine(destinationCode);
			if((LINE2.hasStation(sourceCode) && LINE2.hasStation(destinationCode)))
				stationsInBetween = LINE2.getStationNumOntheLine(sourceCode) - LINE2.getStationNumOntheLine(destinationCode);
			if((LINE3.hasStation(sourceCode) && LINE3.hasStation(destinationCode)))
				stationsInBetween = LINE3.getStationNumOntheLine(sourceCode) - LINE3.getStationNumOntheLine(destinationCode);
		}
		
		return Math.abs(stationsInBetween);
	}

	public static int calculateStationsInBetween(String sourceCode, String destinationCode){
		int stationsInBetween=0;

		boolean isJourneyOnSameLine = StationUtil.isOnSameLine(sourceCode, destinationCode);
		if(isJourneyOnSameLine){
			stationsInBetween = StationUtil.calculateStationsOnSameLine(sourceCode, destinationCode);
		}else{
			String interChangeStation = StationUtil.getInterChangeStationCode(sourceCode, destinationCode);
			stationsInBetween = StationUtil.calculateStationsOnSameLine(sourceCode, interChangeStation);
			stationsInBetween += StationUtil.calculateStationsOnSameLine(interChangeStation, destinationCode);
		}

		return stationsInBetween;
	}
	
	
	static void validateStationCode(String stationCode){
		if(LINE1.hasStation(stationCode) ||
		   LINE2.hasStation(stationCode) ||
		   LINE3.hasStation(stationCode)){
			return;
		}else{
			throw new InputMismatchException("Invalid Station Code: " + stationCode);
		}
	}
	
	static void printTicket(String sourceCode, String destinationCode){
		
		String sourceName = ALL_STATIONS_MAP.get(sourceCode).getStationName();
	    String destinationName = ALL_STATIONS_MAP.get(destinationCode).getStationName();
	    int distance = StationUtil.calculateStationsInBetween(sourceCode, destinationCode);
	    float fare = StationUtil.calcualteFare(sourceCode, destinationCode);
		MetroTicket t = new MetroTicket(sourceName,destinationName,distance,fare);
		t.printTicket();
	}

	
}
