public class ExperienceReport{
    @JsonProperty("RespCode") 
    public int respCode;
    @JsonProperty("WorstCurr") 
    public String worstCurr;
    @JsonProperty("WorstEver") 
    public String worstEver;
    @JsonProperty("Worst6M") 
    public String worst6M;
    @JsonProperty("Worst24M") 
    public String worst24M;
    public Metadata @metadata;
}
