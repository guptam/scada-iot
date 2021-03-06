package com.hashmap.ua.client;


import com.fasterxml.jackson.annotation.JsonProperty;

public class IOTMessage {
	@JsonProperty("serverName")
	private String serverName;

	@JsonProperty("serverIp")
	private String serverIp;

	@JsonProperty("topic")
	private String topic;

	@JsonProperty("tagName")
	private String tagName;	 

	@JsonProperty("tagDataType")
	private String tagDataType;	 

	@JsonProperty("tagValue")
	private String tagValue;	 

	@JsonProperty("serverReportTimestamp")
	private long serverReportTimestamp;	 

	@JsonProperty("acquistionTimestamp")
	private long acquistionTimestamp;

	@JsonProperty("quality")
	private String quality;	 	

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagDataType() {
		return tagDataType;
	}

	public void setTagDataType(String tagDataType) {
		this.tagDataType = tagDataType;
	}
	
	public String getTagValue() {
		return tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}
	
	public long getServerReportTimestamp() {
		return serverReportTimestamp;
	}

	public void setServerReportTimestamp(long serverReportTimestamp) {
		this.serverReportTimestamp = serverReportTimestamp;
	}
	
	public long getAcquistionTimestamp() {
		return acquistionTimestamp;
	}
	
	public void setAcquistionTimestamp(long acquistionTimestamp) {
		this.acquistionTimestamp = acquistionTimestamp;
	}
	
	public String getQuality() {
		return quality;
	}
	
	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override

	public String toString() {
		return "IotData [serverName=" + serverName
				+ ", serverIp=" + serverIp
				+ ", topic=" + topic
				+ ", tagName=" + tagName
				+ ", tagDataType=" + tagDataType
				+ ", tagValue=" + tagValue
				+ ", serverReportTimestamp=" + serverReportTimestamp
				+ ", acquistionTimestamp=" + acquistionTimestamp
				+ ", quality=" + quality + "]";

	}
}
