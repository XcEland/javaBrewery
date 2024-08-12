public class VAFfraudAssessment{
    @JsonProperty("applicationData") 
    public ApplicationData getApplicationData() { 
		 return this.applicationData; } 
    public void setApplicationData(ApplicationData applicationData) { 
		 this.applicationData = applicationData; } 
    ApplicationData applicationData;
    @JsonProperty("fraudCheckBPMData") 
    public FraudCheckBPMData getFraudCheckBPMData() { 
		 return this.fraudCheckBPMData; } 
    public void setFraudCheckBPMData(FraudCheckBPMData fraudCheckBPMData) { 
		 this.fraudCheckBPMData = fraudCheckBPMData; } 
    FraudCheckBPMData fraudCheckBPMData;
    @JsonProperty("Notes") 
    public Notes getNotes() { 
		 return this.notes; } 
    public void setNotes(Notes notes) { 
		 this.notes = notes; } 
    Notes notes;
    @JsonProperty("documentIDList") 
    public DocumentIDList getDocumentIDList() { 
		 return this.documentIDList; } 
    public void setDocumentIDList(DocumentIDList documentIDList) { 
		 this.documentIDList = documentIDList; } 
    DocumentIDList documentIDList;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
