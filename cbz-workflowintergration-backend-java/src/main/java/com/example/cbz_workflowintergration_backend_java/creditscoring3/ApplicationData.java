public class ApplicationData{
    public General general;
    public EnterpriseCustomer enterpriseCustomer;
    public PrincipalPersonal principalPersonal;
    public PrincipalConsent principalConsent;
    public PrincipalAffordability principalAffordability;
    public Product product;
    @JsonProperty("Collateral") 
    public Collateral collateral;
    public boolean reScoreIndicator;
    public Metadata @metadata;
}
