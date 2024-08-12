public class FE{
    @JsonProperty("GEN") 
    public GEN getGEN() { 
		 return this.gEN; } 
    public void setGEN(GEN gEN) { 
		 this.gEN = gEN; } 
    GEN gEN;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
