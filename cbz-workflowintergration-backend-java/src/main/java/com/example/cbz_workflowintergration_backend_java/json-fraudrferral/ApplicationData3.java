public class ApplicationData3{
    @JsonProperty("Generals") 
    public Generals getGenerals() { 
		 return this.generals; } 
    public void setGenerals(Generals generals) { 
		 this.generals = generals; } 
    Generals generals;
    @JsonProperty("Decisions") 
    public Decisions getDecisions() { 
		 return this.decisions; } 
    public void setDecisions(Decisions decisions) { 
		 this.decisions = decisions; } 
    Decisions decisions;
    @JsonProperty("Enterprise") 
    public Enterprise getEnterprise() { 
		 return this.enterprise; } 
    public void setEnterprise(Enterprise enterprise) { 
		 this.enterprise = enterprise; } 
    Enterprise enterprise;
    @JsonProperty("ENTDecisions") 
    public ENTDecisions getENTDecisions() { 
		 return this.eNTDecisions; } 
    public void setENTDecisions(ENTDecisions eNTDecisions) { 
		 this.eNTDecisions = eNTDecisions; } 
    ENTDecisions eNTDecisions;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
