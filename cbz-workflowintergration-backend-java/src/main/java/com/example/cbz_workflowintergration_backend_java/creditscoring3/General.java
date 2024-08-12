public class General{
    public double aoRef;
    public String credRefNo;
    public String appDate;
    public String appTime;
    public String userId;
    public int callerCode;
    public String callerType;
    public String verNo;
    public int appProcess;
    public String partialApp;
    public int noOfApplicants;
    public UseCustInfo useCustInfo;
    public String ncaInActInd;
    public String ncaJuristicInd;
    public Metadata @metadata;
    public String returnCode;
    public String returnCodeType;
    @JsonProperty("PcRefNumber") 
    public String pcRefNumber;
    public String applicationProcess;
    public String totalSecureExposure;
    public String totalUnsecureExposure;
    public String enterpriseRiskIndicator;
    public String enterpriseRiskLimit;
    public String applicationRiskIndicator;
    public String probabilityOfDefault;
}
