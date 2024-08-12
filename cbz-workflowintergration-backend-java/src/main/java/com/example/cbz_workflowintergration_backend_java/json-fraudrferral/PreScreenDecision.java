public class PreScreenDecision{
    @JsonProperty("DecisionCod") 
    public String getDecisionCod() { 
		 return this.decisionCod; } 
    public void setDecisionCod(String decisionCod) { 
		 this.decisionCod = decisionCod; } 
    String decisionCod;
    @JsonProperty("DeclineCod1") 
    public String getDeclineCod1() { 
		 return this.declineCod1; } 
    public void setDeclineCod1(String declineCod1) { 
		 this.declineCod1 = declineCod1; } 
    String declineCod1;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
    @JsonProperty("RollDecision") 
    public String getRollDecision() { 
		 return this.rollDecision; } 
    public void setRollDecision(String rollDecision) { 
		 this.rollDecision = rollDecision; } 
    String rollDecision;
}
