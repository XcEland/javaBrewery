public class Root{
    public String currentUser;
    public Attachments attachments;
    public DocumentsFilenetRes documentsFilenetRes;
    public String trackingUser;
    public String alfaErrorCode;
    public RescoreDocsList rescoreDocsList;
    @JsonProperty("VAFCreditScoringRq") 
    public VAFCreditScoringRq vAFCreditScoringRq;
    public Logger logger;
    public String componentName;
    public NotesFromAlfa notesFromAlfa;
    public RequestedDocumentsRes requestedDocumentsRes;
    public String taskId;
}
