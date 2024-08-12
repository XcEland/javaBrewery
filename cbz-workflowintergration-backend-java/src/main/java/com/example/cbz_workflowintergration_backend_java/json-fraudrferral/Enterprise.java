public class Enterprise{
    @JsonProperty("CustNo") 
    public String getCustNo() { 
		 return this.custNo; } 
    public void setCustNo(String custNo) { 
		 this.custNo = custNo; } 
    String custNo;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
