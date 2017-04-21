package com.twhyd.hmr.suman;

public class MetroStation {
	
	private String stationCode;
	private String stationName;

	public MetroStation(String stationCode, String stationName) {
		this.stationCode = stationCode;
		this.stationName = stationName;
	}

	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}
