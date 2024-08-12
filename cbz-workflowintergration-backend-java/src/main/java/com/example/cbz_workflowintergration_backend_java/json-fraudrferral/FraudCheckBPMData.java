public class FraudCheckBPMData{
    @JsonProperty("alfaCreditRefNo") 
    public String getAlfaCreditRefNo() { 
		 return this.alfaCreditRefNo; } 
    public void setAlfaCreditRefNo(String alfaCreditRefNo) { 
		 this.alfaCreditRefNo = alfaCreditRefNo; } 
    String alfaCreditRefNo;
    @JsonProperty("applicationId") 
    public String getApplicationId() { 
		 return this.applicationId; } 
    public void setApplicationId(String applicationId) { 
		 this.applicationId = applicationId; } 
    String applicationId;
    @JsonProperty("bpGuid") 
    public String getBpGuid() { 
		 return this.bpGuid; } 
    public void setBpGuid(String bpGuid) { 
		 this.bpGuid = bpGuid; } 
    String bpGuid;
    @JsonProperty("partyId") 
    public String getPartyId() { 
		 return this.partyId; } 
    public void setPartyId(String partyId) { 
		 this.partyId = partyId; } 
    String partyId;
    @JsonProperty("msgReference") 
    public String getMsgReference() { 
		 return this.msgReference; } 
    public void setMsgReference(String msgReference) { 
		 this.msgReference = msgReference; } 
    String msgReference;
    @JsonProperty("fraudRefIndicator") 
    public boolean getFraudRefIndicator() { 
		 return this.fraudRefIndicator; } 
    public void setFraudRefIndicator(boolean fraudRefIndicator) { 
		 this.fraudRefIndicator = fraudRefIndicator; } 
    boolean fraudRefIndicator;
    @JsonProperty("credRefIndicator") 
    public boolean getCredRefIndicator() { 
		 return this.credRefIndicator; } 
    public void setCredRefIndicator(boolean credRefIndicator) { 
		 this.credRefIndicator = credRefIndicator; } 
    boolean credRefIndicator;
    @JsonProperty("branchDetails") 
    public BranchDetails getBranchDetails() { 
		 return this.branchDetails; } 
    public void setBranchDetails(BranchDetails branchDetails) { 
		 this.branchDetails = branchDetails; } 
    BranchDetails branchDetails;
    @JsonProperty("orginatingSystem") 
    public String getOrginatingSystem() { 
		 return this.orginatingSystem; } 
    public void setOrginatingSystem(String orginatingSystem) { 
		 this.orginatingSystem = orginatingSystem; } 
    String orginatingSystem;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
