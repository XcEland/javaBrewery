public class ApplicationData{
    @JsonProperty("general") 
    public General getGeneral() { 
		 return this.general; } 
    public void setGeneral(General general) { 
		 this.general = general; } 
    General general;
    @JsonProperty("enterpriseCustomer") 
    public EnterpriseCustomer getEnterpriseCustomer() { 
		 return this.enterpriseCustomer; } 
    public void setEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) { 
		 this.enterpriseCustomer = enterpriseCustomer; } 
    EnterpriseCustomer enterpriseCustomer;
    @JsonProperty("principalPersonal") 
    public PrincipalPersonal getPrincipalPersonal() { 
		 return this.principalPersonal; } 
    public void setPrincipalPersonal(PrincipalPersonal principalPersonal) { 
		 this.principalPersonal = principalPersonal; } 
    PrincipalPersonal principalPersonal;
    @JsonProperty("principalConsent") 
    public PrincipalConsent getPrincipalConsent() { 
		 return this.principalConsent; } 
    public void setPrincipalConsent(PrincipalConsent principalConsent) { 
		 this.principalConsent = principalConsent; } 
    PrincipalConsent principalConsent;
    @JsonProperty("principalAffordability") 
    public PrincipalAffordability getPrincipalAffordability() { 
		 return this.principalAffordability; } 
    public void setPrincipalAffordability(PrincipalAffordability principalAffordability) { 
		 this.principalAffordability = principalAffordability; } 
    PrincipalAffordability principalAffordability;
    @JsonProperty("product") 
    public Product getProduct() { 
		 return this.product; } 
    public void setProduct(Product product) { 
		 this.product = product; } 
    Product product;
    @JsonProperty("Collateral") 
    public Collateral getCollateral() { 
		 return this.collateral; } 
    public void setCollateral(Collateral collateral) { 
		 this.collateral = collateral; } 
    Collateral collateral;
    @JsonProperty("reScoreIndicator") 
    public boolean getReScoreIndicator() { 
		 return this.reScoreIndicator; } 
    public void setReScoreIndicator(boolean reScoreIndicator) { 
		 this.reScoreIndicator = reScoreIndicator; } 
    boolean reScoreIndicator;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
