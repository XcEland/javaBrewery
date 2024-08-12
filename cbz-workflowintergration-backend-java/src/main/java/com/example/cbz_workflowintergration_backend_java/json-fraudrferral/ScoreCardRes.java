public class ScoreCardRes{
    @JsonProperty("ApplicationData") 
    public ApplicationData getApplicationData() { 
		 return this.applicationData; } 
    public void setApplicationData(ApplicationData applicationData) { 
		 this.applicationData = applicationData; } 
    ApplicationData applicationData;
    @JsonProperty("ResponseData") 
    public ResponseData getResponseData() { 
		 return this.responseData; } 
    public void setResponseData(ResponseData responseData) { 
		 this.responseData = responseData; } 
    ResponseData responseData;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
