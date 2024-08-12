public class RequestedSupportingDocuments{
    @JsonProperty("agreementNumber") 
    public String getAgreementNumber() { 
		 return this.agreementNumber; } 
    public void setAgreementNumber(String agreementNumber) { 
		 this.agreementNumber = agreementNumber; } 
    String agreementNumber;
    @JsonProperty("attachments") 
    public Attachments getAttachments() { 
		 return this.attachments; } 
    public void setAttachments(Attachments attachments) { 
		 this.attachments = attachments; } 
    Attachments attachments;
    @JsonProperty("statusCode") 
    public String getStatusCode() { 
		 return this.statusCode; } 
    public void setStatusCode(String statusCode) { 
		 this.statusCode = statusCode; } 
    String statusCode;
    @JsonProperty("statusDescription") 
    public String getStatusDescription() { 
		 return this.statusDescription; } 
    public void setStatusDescription(String statusDescription) { 
		 this.statusDescription = statusDescription; } 
    String statusDescription;
    @JsonProperty("Notes") 
    public Notes getNotes() { 
		 return this.notes; } 
    public void setNotes(Notes notes) { 
		 this.notes = notes; } 
    Notes notes;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
