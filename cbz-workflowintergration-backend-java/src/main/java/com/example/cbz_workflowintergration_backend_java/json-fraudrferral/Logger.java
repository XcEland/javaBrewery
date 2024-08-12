public class Logger{
    @JsonProperty("initializedLogger") 
    public String getInitializedLogger() { 
		 return this.initializedLogger; } 
    public void setInitializedLogger(String initializedLogger) { 
		 this.initializedLogger = initializedLogger; } 
    String initializedLogger;
    @JsonProperty("applicationMode") 
    public String getApplicationMode() { 
		 return this.applicationMode; } 
    public void setApplicationMode(String applicationMode) { 
		 this.applicationMode = applicationMode; } 
    String applicationMode;
    @JsonProperty("logGuid") 
    public String getLogGuid() { 
		 return this.logGuid; } 
    public void setLogGuid(String logGuid) { 
		 this.logGuid = logGuid; } 
    String logGuid;
    @JsonProperty("bpmFeatureTeam") 
    public String getBpmFeatureTeam() { 
		 return this.bpmFeatureTeam; } 
    public void setBpmFeatureTeam(String bpmFeatureTeam) { 
		 this.bpmFeatureTeam = bpmFeatureTeam; } 
    String bpmFeatureTeam;
    @JsonProperty("serviceType") 
    public String getServiceType() { 
		 return this.serviceType; } 
    public void setServiceType(String serviceType) { 
		 this.serviceType = serviceType; } 
    String serviceType;
    @JsonProperty("callerAcronym") 
    public String getCallerAcronym() { 
		 return this.callerAcronym; } 
    public void setCallerAcronym(String callerAcronym) { 
		 this.callerAcronym = callerAcronym; } 
    String callerAcronym;
    @JsonProperty("upn") 
    public String getUpn() { 
		 return this.upn; } 
    public void setUpn(String upn) { 
		 this.upn = upn; } 
    String upn;
    @JsonProperty("digitalId") 
    public String getDigitalId() { 
		 return this.digitalId; } 
    public void setDigitalId(String digitalId) { 
		 this.digitalId = digitalId; } 
    String digitalId;
    @JsonProperty("empNo") 
    public String getEmpNo() { 
		 return this.empNo; } 
    public void setEmpNo(String empNo) { 
		 this.empNo = empNo; } 
    String empNo;
    @JsonProperty("consumerBpmApplication") 
    public String getConsumerBpmApplication() { 
		 return this.consumerBpmApplication; } 
    public void setConsumerBpmApplication(String consumerBpmApplication) { 
		 this.consumerBpmApplication = consumerBpmApplication; } 
    String consumerBpmApplication;
    @JsonProperty("callerProcessInstanceId") 
    public String getCallerProcessInstanceId() { 
		 return this.callerProcessInstanceId; } 
    public void setCallerProcessInstanceId(String callerProcessInstanceId) { 
		 this.callerProcessInstanceId = callerProcessInstanceId; } 
    String callerProcessInstanceId;
    @JsonProperty("location") 
    public String getLocation() { 
		 return this.location; } 
    public void setLocation(String location) { 
		 this.location = location; } 
    String location;
    @JsonProperty("message") 
    public String getMessage() { 
		 return this.message; } 
    public void setMessage(String message) { 
		 this.message = message; } 
    String message;
    @JsonProperty("payload") 
    public String getPayload() { 
		 return this.payload; } 
    public void setPayload(String payload) { 
		 this.payload = payload; } 
    String payload;
    @JsonProperty("businessFunction") 
    public String getBusinessFunction() { 
		 return this.businessFunction; } 
    public void setBusinessFunction(String businessFunction) { 
		 this.businessFunction = businessFunction; } 
    String businessFunction;
    @JsonProperty("startTime") 
    public String getStartTime() { 
		 return this.startTime; } 
    public void setStartTime(String startTime) { 
		 this.startTime = startTime; } 
    String startTime;
    @JsonProperty("endTime") 
    public String getEndTime() { 
		 return this.endTime; } 
    public void setEndTime(String endTime) { 
		 this.endTime = endTime; } 
    String endTime;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
