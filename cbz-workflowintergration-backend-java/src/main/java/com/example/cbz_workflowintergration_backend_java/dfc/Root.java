public class Root{
    public OriginatingProcessChannel originatingProcessChannel;
    public boolean prodOtherOutstandingConditions;
    public String aeNumber;
    public GetAfforadabilityRes getAfforadabilityRes;
    public boolean outstandingConditions;
    public String sbguid;
    public Object contractAgreement;
    public ListOfOutstandingConditions listOfOutstandingConditions;
    @JsonProperty("EAODfcFulfillmentType") 
    public EAODfcFulfillmentType eAODfcFulfillmentType;
    public String condition1;
    public Object docContentURL;
    public EaoDfcFulfillmentReq eaoDfcFulfillmentReq;
    public String appId;
    public boolean appOutstandingConditions;
    public String flowAction;
    public boolean isHNW;
    public ServiceHeaderDetails serviceHeaderDetails;
    public boolean prodIFAOutstandingConditions;
}
