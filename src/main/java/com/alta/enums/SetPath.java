package com.alta.enums;

public enum SetPath {

	ANYCONNECTOR("setup/AnyConnectorSetup.json"),
	GSSO("setup/GssoSetup.json"),
	ADAPTER("setup/AdapterSetup.json");
	
	private final String value;
	
	SetPath(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	@Override
	public String toString(){
		return String.valueOf(value);
	}
}
