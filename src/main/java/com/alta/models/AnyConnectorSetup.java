package com.alta.models;





import java.io.File;
import java.io.IOException;

import javax.activation.MailcapCommandMap;



import com.alta.enums.SetPath;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.xsom.impl.scd.Iterators.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"prtSiteID",
	"validateUi",
	"busiDate",
	"adapter"
})
public class AnyConnectorSetup {

	@JsonProperty("prtSiteID")
	private String prtSiteID;
	@JsonProperty("validateUi")
	private Boolean validateUi;
	@JsonProperty("busiDate")
	private String busiDate;
	@JsonProperty("adapter")
	private String adapter;

	private static AnyConnectorSetup ANYCONNECT;

	public AnyConnectorSetup() {
	}

	public static AnyConnectorSetup getInstance() {
		if (ANYCONNECT == null) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				ANYCONNECT = mapper.readValue(new File(SetPath.ANYCONNECTOR.getValue()), AnyConnectorSetup.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ANYCONNECT;
	}


	@JsonProperty("prtSiteID")
	public String getPrtSiteID() {
		return prtSiteID;
	}

	@JsonProperty("prtSiteID")
	public void setPrtSiteID(String prtSiteID) {
		this.prtSiteID = prtSiteID;
	}

	@JsonProperty("validateUi")
	public Boolean getValidateUi() {
		return validateUi;
	}

	@JsonProperty("validateUi")
	public void setValidateUi(Boolean validateUi) {
		this.validateUi = validateUi;
	}

	@JsonProperty("busiDate")
	public String getBusiDate() {
		return busiDate;
	}

	@JsonProperty("busiDate")
	public void setBusiDate(String busiDate) {
		this.busiDate = busiDate;
	}

	@JsonProperty("adapter")
	public String getAdapter() {
		return adapter;
	}

	@JsonProperty("adapter")
	public void setAdapter(String adapter) {
		this.adapter = adapter;
	}

}
