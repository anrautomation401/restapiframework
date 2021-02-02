package com.alta.models;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import com.alta.enums.SetPath;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


public class AdapterSetup {
	private String application_name;
	private String application_url;
	private String username;
	private String passsword;
	private String partnerID;
	private String apiKey; 
	private String postURL;


	private static AdapterSetup ADAPTER;

	private AdapterSetup(){

	}

	public static AdapterSetup getInstance() {
		if(ADAPTER==null) {
			InputStream fis = null;
			try {
				fis = new FileInputStream(SetPath.ADAPTER.getValue());
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			JsonReader jsonReader=Json.createReader(fis);
			JsonObject jsonObject=jsonReader.readObject();
			jsonReader.close();
			try {
				fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			JsonValue object=jsonObject.get(AnyConnectorSetup.getInstance().getAdapter());
			ObjectMapper mapper=new ObjectMapper();


			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			ADAPTER=new AdapterSetup();
			try {
				ADAPTER=mapper.readValue(object.toString(), AdapterSetup.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return ADAPTER;
	}

	public static void main(String[] args) {
		System.out.println(AdapterSetup.getInstance().getApplication_name());
	}


	public String getApplication_name() {
		return application_name;
	}
	public void setApplication_name(String application_name) {
		this.application_name = application_name;
	}
	public String getApplication_url() {
		return application_url;
	}
	public void setApplication_url(String application_url) {
		this.application_url = application_url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public String getPartnerID() {
		return partnerID;
	}
	public void setPartnerID(String partnerID) {
		this.partnerID = partnerID;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getPostURL() {
		return postURL;
	}
	public void setPostURL(String postURL) {
		this.postURL = postURL;
	}
}
