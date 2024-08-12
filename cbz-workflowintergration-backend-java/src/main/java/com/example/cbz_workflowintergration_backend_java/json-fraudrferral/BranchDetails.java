public class BranchDetails{
    @JsonProperty("officerId") 
    public String getOfficerId() { 
		 return this.officerId; } 
    public void setOfficerId(String officerId) { 
		 this.officerId = officerId; } 
    String officerId;
    @JsonProperty("officerName") 
    public String getOfficerName() { 
		 return this.officerName; } 
    public void setOfficerName(String officerName) { 
		 this.officerName = officerName; } 
    String officerName;
    @JsonProperty("branch") 
    public Branch getBranch() { 
		 return this.branch; } 
    public void setBranch(Branch branch) { 
		 this.branch = branch; } 
    Branch branch;
    @JsonProperty("center") 
    public Center getCenter() { 
		 return this.center; } 
    public void setCenter(Center center) { 
		 this.center = center; } 
    Center center;
    @JsonProperty("province") 
    public Province getProvince() { 
		 return this.province; } 
    public void setProvince(Province province) { 
		 this.province = province; } 
    Province province;
    @JsonProperty("region") 
    public Region getRegion() { 
		 return this.region; } 
    public void setRegion(Region region) { 
		 this.region = region; } 
    Region region;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
