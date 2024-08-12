public class EnterpriseConsents{
    @JsonProperty("underDebtReview") 
    public String getUnderDebtReview() { 
		 return this.underDebtReview; } 
    public void setUnderDebtReview(String underDebtReview) { 
		 this.underDebtReview = underDebtReview; } 
    String underDebtReview;
    @JsonProperty("underSequestration") 
    public String getUnderSequestration() { 
		 return this.underSequestration; } 
    public void setUnderSequestration(String underSequestration) { 
		 this.underSequestration = underSequestration; } 
    String underSequestration;
    @JsonProperty("underAdminOrder") 
    public String getUnderAdminOrder() { 
		 return this.underAdminOrder; } 
    public void setUnderAdminOrder(String underAdminOrder) { 
		 this.underAdminOrder = underAdminOrder; } 
    String underAdminOrder;
    @JsonProperty("extBureauConsent") 
    public String getExtBureauConsent() { 
		 return this.extBureauConsent; } 
    public void setExtBureauConsent(String extBureauConsent) { 
		 this.extBureauConsent = extBureauConsent; } 
    String extBureauConsent;
    @JsonProperty("businessRescue") 
    public String getBusinessRescue() { 
		 return this.businessRescue; } 
    public void setBusinessRescue(String businessRescue) { 
		 this.businessRescue = businessRescue; } 
    String businessRescue;
    @JsonProperty("insolvement") 
    public String getInsolvement() { 
		 return this.insolvement; } 
    public void setInsolvement(String insolvement) { 
		 this.insolvement = insolvement; } 
    String insolvement;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
