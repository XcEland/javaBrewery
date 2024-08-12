public class ENTDecisions{
    @JsonProperty("ProductDecision") 
    public ProductDecision getProductDecision() { 
		 return this.productDecision; } 
    public void setProductDecision(ProductDecision productDecision) { 
		 this.productDecision = productDecision; } 
    ProductDecision productDecision;
    @JsonProperty("PreScreenDecision") 
    public PreScreenDecision getPreScreenDecision() { 
		 return this.preScreenDecision; } 
    public void setPreScreenDecision(PreScreenDecision preScreenDecision) { 
		 this.preScreenDecision = preScreenDecision; } 
    PreScreenDecision preScreenDecision;
    @JsonProperty("FraudDecision") 
    public FraudDecision getFraudDecision() { 
		 return this.fraudDecision; } 
    public void setFraudDecision(FraudDecision fraudDecision) { 
		 this.fraudDecision = fraudDecision; } 
    FraudDecision fraudDecision;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
