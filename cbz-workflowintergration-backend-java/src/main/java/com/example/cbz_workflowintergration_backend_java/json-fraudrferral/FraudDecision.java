public class FraudDecision{
    @JsonProperty("DecisionCod") 
    public String getDecisionCod() { 
		 return this.decisionCod; } 
    public void setDecisionCod(String decisionCod) { 
		 this.decisionCod = decisionCod; } 
    String decisionCod;
    @JsonProperty("DecisionCod1") 
    public String getDecisionCod1() { 
		 return this.decisionCod1; } 
    public void setDecisionCod1(String decisionCod1) { 
		 this.decisionCod1 = decisionCod1; } 
    String decisionCod1;
    @JsonProperty("DecisionCod2") 
    public String getDecisionCod2() { 
		 return this.decisionCod2; } 
    public void setDecisionCod2(String decisionCod2) { 
		 this.decisionCod2 = decisionCod2; } 
    String decisionCod2;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
    @JsonProperty("DeclineCod1") 
    public String getDeclineCod1() { 
		 return this.declineCod1; } 
    public void setDeclineCod1(String declineCod1) { 
		 this.declineCod1 = declineCod1; } 
    String declineCod1;
    @JsonProperty("DeclineCod2") 
    public String getDeclineCod2() { 
		 return this.declineCod2; } 
    public void setDeclineCod2(String declineCod2) { 
		 this.declineCod2 = declineCod2; } 
    String declineCod2;
    @JsonProperty("DeclineCod3") 
    public String getDeclineCod3() { 
		 return this.declineCod3; } 
    public void setDeclineCod3(String declineCod3) { 
		 this.declineCod3 = declineCod3; } 
    String declineCod3;
    @JsonProperty("DeclineCod4") 
    public String getDeclineCod4() { 
		 return this.declineCod4; } 
    public void setDeclineCod4(String declineCod4) { 
		 this.declineCod4 = declineCod4; } 
    String declineCod4;
    @JsonProperty("RollDecision") 
    public String getRollDecision() { 
		 return this.rollDecision; } 
    public void setRollDecision(String rollDecision) { 
		 this.rollDecision = rollDecision; } 
    String rollDecision;
}
