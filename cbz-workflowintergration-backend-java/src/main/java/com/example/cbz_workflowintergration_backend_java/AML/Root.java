public class Root{
    public EscalationBO escalationBO;
    public TrackingValues trackingValues;
    public EmailProcessBO emailProcessBO;
    @JsonProperty("DQMConsultant") 
    public String dQMConsultant;
    public MaintainComplianceRes maintainComplianceRes;
    public AntiMoneyLaunderingProcessDetails antiMoneyLaunderingProcessDetails;
    @JsonProperty("ReturnValue") 
    public String returnValue;
    public AntiMoneyLaunderingReviewStartRequest antiMoneyLaunderingReviewStartRequest;
    public AmlIntegrationDetails amlIntegrationDetails;
}
