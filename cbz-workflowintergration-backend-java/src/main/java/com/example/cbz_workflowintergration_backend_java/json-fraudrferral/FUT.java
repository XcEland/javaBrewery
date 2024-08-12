public class FUT{
    @JsonProperty("headRoom") 
    public String getHeadRoom() { 
		 return this.headRoom; } 
    public void setHeadRoom(String headRoom) { 
		 this.headRoom = headRoom; } 
    String headRoom;
    @JsonProperty("optimizerLimit") 
    public String getOptimizerLimit() { 
		 return this.optimizerLimit; } 
    public void setOptimizerLimit(String optimizerLimit) { 
		 this.optimizerLimit = optimizerLimit; } 
    String optimizerLimit;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
