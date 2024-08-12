public class Root{
    @JsonProperty("uploadDocDetailNew") 
    public UploadDocDetailNew getUploadDocDetailNew() { 
		 return this.uploadDocDetailNew; } 
    public void setUploadDocDetailNew(UploadDocDetailNew uploadDocDetailNew) { 
		 this.uploadDocDetailNew = uploadDocDetailNew; } 
    UploadDocDetailNew uploadDocDetailNew;
    @JsonProperty("retryCount") 
    public int getRetryCount() { 
		 return this.retryCount; } 
    public void setRetryCount(int retryCount) { 
		 this.retryCount = retryCount; } 
    int retryCount;
    @JsonProperty("alfaErrorCode") 
    public String getAlfaErrorCode() { 
		 return this.alfaErrorCode; } 
    public void setAlfaErrorCode(String alfaErrorCode) { 
		 this.alfaErrorCode = alfaErrorCode; } 
    String alfaErrorCode;
    @JsonProperty("logger") 
    public Logger getLogger() { 
		 return this.logger; } 
    public void setLogger(Logger logger) { 
		 this.logger = logger; } 
    Logger logger;
    @JsonProperty("requestedSupportingDocuments") 
    public RequestedSupportingDocuments getRequestedSupportingDocuments() { 
		 return this.requestedSupportingDocuments; } 
    public void setRequestedSupportingDocuments(RequestedSupportingDocuments requestedSupportingDocuments) { 
		 this.requestedSupportingDocuments = requestedSupportingDocuments; } 
    RequestedSupportingDocuments requestedSupportingDocuments;
    @JsonProperty("action") 
    public String getAction() { 
		 return this.action; } 
    public void setAction(String action) { 
		 this.action = action; } 
    String action;
    @JsonProperty("fraudAssessmentDetails") 
    public FraudAssessmentDetails getFraudAssessmentDetails() { 
		 return this.fraudAssessmentDetails; } 
    public void setFraudAssessmentDetails(FraudAssessmentDetails fraudAssessmentDetails) { 
		 this.fraudAssessmentDetails = fraudAssessmentDetails; } 
    FraudAssessmentDetails fraudAssessmentDetails;
    @JsonProperty("notesFromAlfa") 
    public NotesFromAlfa getNotesFromAlfa() { 
		 return this.notesFromAlfa; } 
    public void setNotesFromAlfa(NotesFromAlfa notesFromAlfa) { 
		 this.notesFromAlfa = notesFromAlfa; } 
    NotesFromAlfa notesFromAlfa;
    @JsonProperty("VAFFraudReferralsRq") 
    public VAFFraudReferralsRq getVAFFraudReferralsRq() { 
		 return this.vAFFraudReferralsRq; } 
    public void setVAFFraudReferralsRq(VAFFraudReferralsRq vAFFraudReferralsRq) { 
		 this.vAFFraudReferralsRq = vAFFraudReferralsRq; } 
    VAFFraudReferralsRq vAFFraudReferralsRq;
    @JsonProperty("uploadDocDetailNewKey") 
    public String getUploadDocDetailNewKey() { 
		 return this.uploadDocDetailNewKey; } 
    public void setUploadDocDetailNewKey(String uploadDocDetailNewKey) { 
		 this.uploadDocDetailNewKey = uploadDocDetailNewKey; } 
    String uploadDocDetailNewKey;
    @JsonProperty("SupportTeam") 
    public String getSupportTeam() { 
		 return this.supportTeam; } 
    public void setSupportTeam(String supportTeam) { 
		 this.supportTeam = supportTeam; } 
    String supportTeam;
    @JsonProperty("scoreCardRes") 
    public ScoreCardRes getScoreCardRes() { 
		 return this.scoreCardRes; } 
    public void setScoreCardRes(ScoreCardRes scoreCardRes) { 
		 this.scoreCardRes = scoreCardRes; } 
    ScoreCardRes scoreCardRes;
}
