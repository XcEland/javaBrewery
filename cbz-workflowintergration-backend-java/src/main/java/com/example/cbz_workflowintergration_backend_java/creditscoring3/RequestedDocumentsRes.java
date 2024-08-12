public class RequestedDocumentsRes{
    public String agreementNumber;
    public Attachments attachments;
    public String statusCode;
    public String statusDescription;
    public String realdocReference;
    @JsonProperty("Notes") 
    public Notes notes;
    public Metadata @metadata;
}
