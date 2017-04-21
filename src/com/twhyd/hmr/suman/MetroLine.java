package com.twhyd.hmr.suman;

import java.util.ArrayList;
import java.util.List;

public class MetroLine {
	
	List<String> stationsList;
		
	MetroLine(String[] stationsList){
		this.stationsList = new ArrayList<>();
		for(String stationCode:stationsList){
			this.stationsList.add(stationCode);
		}
	}
	
	boolean hasStation(String stationCode){
		return this.stationsList.contains(stationCode);
	}
	
	int getStationNumOntheLine(String stationCode){
		return this.stationsList.indexOf(stationCode);
	}

}
