public class Address{
    @JsonProperty("line1") 
    public String getLine1() { 
		 return this.line1; } 
    public void setLine1(String line1) { 
		 this.line1 = line1; } 
    String line1;
    @JsonProperty("line2") 
    public String getLine2() { 
		 return this.line2; } 
    public void setLine2(String line2) { 
		 this.line2 = line2; } 
    String line2;
    @JsonProperty("suburb") 
    public String getSuburb() { 
		 return this.suburb; } 
    public void setSuburb(String suburb) { 
		 this.suburb = suburb; } 
    String suburb;
    @JsonProperty("city") 
    public String getCity() { 
		 return this.city; } 
    public void setCity(String city) { 
		 this.city = city; } 
    String city;
    @JsonProperty("postalCode") 
    public String getPostalCode() { 
		 return this.postalCode; } 
    public void setPostalCode(String postalCode) { 
		 this.postalCode = postalCode; } 
    String postalCode;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
