package com.alta.restapiframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import com.alta.enums.APIType;
import com.alta.models.AdapterSetup;
import com.alta.models.AnyConnectorSetup;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		loadAdapter();

	}

	public static void loadAdapter() throws IOException {
		
	}
}
