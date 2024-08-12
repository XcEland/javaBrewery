public class IdInfo{
    @JsonProperty("idType") 
    public String getIdType() { 
		 return this.idType; } 
    public void setIdType(String idType) { 
		 this.idType = idType; } 
    String idType;
    @JsonProperty("idNo") 
    public String getIdNo() { 
		 return this.idNo; } 
    public void setIdNo(String idNo) { 
		 this.idNo = idNo; } 
    String idNo;
    @JsonProperty("customerNo") 
    public String getCustomerNo() { 
		 return this.customerNo; } 
    public void setCustomerNo(String customerNo) { 
		 this.customerNo = customerNo; } 
    String customerNo;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
