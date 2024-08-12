public class Item{
    @JsonProperty("Name") 
    public String name;
    @JsonProperty("Value") 
    public String value;
    @JsonProperty("Key") 
    public String key;
    public Metadata @metadata;
    public String sourceOfFundsDescription;
    public Object amendmentType;
    public String sourceOfFundsCategory;
    public double sourceOfFundsAmount;
    public String financialTypeCode;
    public String financialSubTypeCode;
    public boolean amountChanged;
    public Date uploadDate;
    public String documentId;
    public String sourceId;
    public String source;
    public String fileName;
    public String mimeType;
    public String fileSize;
    public String fileDescription;
    public String category;
    public String subCategory;
    public String reasonForChange;
    public String uploadedBy;
    public String complianceType;
    public boolean exemptionIndicator;
    public ComplianceCnttDetails complianceCnttDetails;
    public String cnttId;
    public String docType;
    public String docTypeName;
    public String docContentType;
    public String docContentTypeName;
    public String docTitle;
    public String cnttURL;
    public String description;
    public DocumentEnvr documentEnvr;
    public String language;
    public String languageName;
    public ComplianceCnttStatus complianceCnttStatus;
    public VerificationProperties verificationProperties;
    public String complianceStatusReasonCode;
    public String complianceReasonDescription;
    public String effectiveDate;
    public String dataKeyCode;
    public String dataKeyDescription;
    public String dataValue;
    public String complianceRole;
    public CountryCode countryCode;
    public ComplianceStatus complianceStatus;
    public ApproveOrReject approveOrReject;
    public ReasonForRejection reasonForRejection;
}
