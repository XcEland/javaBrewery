public class FIN{
    @JsonProperty("TotSecExpos") 
    public String getTotSecExpos() { 
		 return this.totSecExpos; } 
    public void setTotSecExpos(String totSecExpos) { 
		 this.totSecExpos = totSecExpos; } 
    String totSecExpos;
    @JsonProperty("TotUnsecExpos") 
    public String getTotUnsecExpos() { 
		 return this.totUnsecExpos; } 
    public void setTotUnsecExpos(String totUnsecExpos) { 
		 this.totUnsecExpos = totUnsecExpos; } 
    String totUnsecExpos;
    @JsonProperty("EntRiskInd") 
    public String getEntRiskInd() { 
		 return this.entRiskInd; } 
    public void setEntRiskInd(String entRiskInd) { 
		 this.entRiskInd = entRiskInd; } 
    String entRiskInd;
    @JsonProperty("EntRiskLimit") 
    public String getEntRiskLimit() { 
		 return this.entRiskLimit; } 
    public void setEntRiskLimit(String entRiskLimit) { 
		 this.entRiskLimit = entRiskLimit; } 
    String entRiskLimit;
    @JsonProperty("FUT") 
    public FUT getFUT() { 
		 return this.fUT; } 
    public void setFUT(FUT fUT) { 
		 this.fUT = fUT; } 
    FUT fUT;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
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
    @JsonProperty("DeclineCod2") 
    public String getDeclineCod2() { 
		 return this.declineCod2; } 
    public void setDeclineCod2(String declineCod2) { 
		 this.declineCod2 = declineCod2; } 
    String declineCod2;
}
