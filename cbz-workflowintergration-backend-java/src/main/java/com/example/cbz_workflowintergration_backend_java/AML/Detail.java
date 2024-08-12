public class Detail{
    public String kycStatus;
    public String taxNumber;
    @JsonProperty("ISICCode") 
    public String iSICCode;
    public String debtReview;
    public String countryOfOrigin;
    public Metadata @metadata;
}
