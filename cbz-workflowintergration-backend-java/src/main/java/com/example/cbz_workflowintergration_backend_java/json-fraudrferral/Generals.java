public class Generals{
    @JsonProperty("FE") 
    public FE getFE() { 
		 return this.fE; } 
    public void setFE(FE fE) { 
		 this.fE = fE; } 
    FE fE;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
