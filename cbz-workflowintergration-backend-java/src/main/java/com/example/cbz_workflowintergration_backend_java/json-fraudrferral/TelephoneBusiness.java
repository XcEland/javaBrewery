public class TelephoneBusiness{
    @JsonProperty("telephoneCode") 
    public String getTelephoneCode() { 
		 return this.telephoneCode; } 
    public void setTelephoneCode(String telephoneCode) { 
		 this.telephoneCode = telephoneCode; } 
    String telephoneCode;
    @JsonProperty("telephoneNumber") 
    public String getTelephoneNumber() { 
		 return this.telephoneNumber; } 
    public void setTelephoneNumber(String telephoneNumber) { 
		 this.telephoneNumber = telephoneNumber; } 
    String telephoneNumber;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
