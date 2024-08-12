public class GeneralDecision{
    @JsonProperty("ReturnCode") 
    public String getReturnCode() { 
		 return this.returnCode; } 
    public void setReturnCode(String returnCode) { 
		 this.returnCode = returnCode; } 
    String returnCode;
    @JsonProperty("ReturnCodeType") 
    public String getReturnCodeType() { 
		 return this.returnCodeType; } 
    public void setReturnCodeType(String returnCodeType) { 
		 this.returnCodeType = returnCodeType; } 
    String returnCodeType;
    @JsonProperty("FIN") 
    public FIN getFIN() { 
		 return this.fIN; } 
    public void setFIN(FIN fIN) { 
		 this.fIN = fIN; } 
    FIN fIN;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
