public class GEN{
    @JsonProperty("TestProdFlag") 
    public String getTestProdFlag() { 
		 return this.testProdFlag; } 
    public void setTestProdFlag(String testProdFlag) { 
		 this.testProdFlag = testProdFlag; } 
    String testProdFlag;
    @JsonProperty("AORef") 
    public String getAORef() { 
		 return this.aORef; } 
    public void setAORef(String aORef) { 
		 this.aORef = aORef; } 
    String aORef;
    @JsonProperty("CrdtRefNo") 
    public String getCrdtRefNo() { 
		 return this.crdtRefNo; } 
    public void setCrdtRefNo(String crdtRefNo) { 
		 this.crdtRefNo = crdtRefNo; } 
    String crdtRefNo;
    @JsonProperty("AppProcess") 
    public String getAppProcess() { 
		 return this.appProcess; } 
    public void setAppProcess(String appProcess) { 
		 this.appProcess = appProcess; } 
    String appProcess;
    @JsonProperty("CustNo") 
    public CustNo getCustNo() { 
		 return this.custNo; } 
    public void setCustNo(CustNo custNo) { 
		 this.custNo = custNo; } 
    CustNo custNo;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
