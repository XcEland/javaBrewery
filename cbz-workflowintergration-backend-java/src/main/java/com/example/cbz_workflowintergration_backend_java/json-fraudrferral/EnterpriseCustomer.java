public class EnterpriseCustomer{
    @JsonProperty("enterpriseDetails") 
    public EnterpriseDetails getEnterpriseDetails() { 
		 return this.enterpriseDetails; } 
    public void setEnterpriseDetails(EnterpriseDetails enterpriseDetails) { 
		 this.enterpriseDetails = enterpriseDetails; } 
    EnterpriseDetails enterpriseDetails;
    @JsonProperty("enterpriseConsents") 
    public EnterpriseConsents getEnterpriseConsents() { 
		 return this.enterpriseConsents; } 
    public void setEnterpriseConsents(EnterpriseConsents enterpriseConsents) { 
		 this.enterpriseConsents = enterpriseConsents; } 
    EnterpriseConsents enterpriseConsents;
    @JsonProperty("enterpriseAffordability") 
    public EnterpriseAffordability getEnterpriseAffordability() { 
		 return this.enterpriseAffordability; } 
    public void setEnterpriseAffordability(EnterpriseAffordability enterpriseAffordability) { 
		 this.enterpriseAffordability = enterpriseAffordability; } 
    EnterpriseAffordability enterpriseAffordability;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
