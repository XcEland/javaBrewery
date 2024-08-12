public class VAFCreditScoringRq{
    @JsonProperty("VAFCreditScoringRq") 
    public VAFCreditScoringRq vAFCreditScoringRq;
    public CreditScoringAdditonalReq creditScoringAdditonalReq;
    public Metadata @metadata;
    public ApplicationData applicationData;
    public FraudCheckBPMData fraudCheckBPMData;
    @JsonProperty("Notes") 
    public Notes notes;
    public DocumentIDList documentIDList;
}
