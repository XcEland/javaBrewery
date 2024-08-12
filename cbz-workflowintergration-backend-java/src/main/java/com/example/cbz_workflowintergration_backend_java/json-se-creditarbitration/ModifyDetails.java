public class ModifyDetails{
    public Date limitReviewDate;
    public double maxRepaymentAmount;
    public double surplusAmount;
    public String comments;
    @JsonProperty("NCA_Status") 
    public NCAStatus nCA_Status;
    public ProductName productName;
    public ProductCategory productCategory;
    public double requestedLimit;
    public double offeredLimit;
    public JuristicInd juristicInd;
    public double maxCalculatedLimit;
    public String maxTerm;
    public Metadata @metadata;
}
