public class GeneralCaf{
    @JsonProperty("apMarketGrpCode") 
    public String getApMarketGrpCode() { 
		 return this.apMarketGrpCode; } 
    public void setApMarketGrpCode(String apMarketGrpCode) { 
		 this.apMarketGrpCode = apMarketGrpCode; } 
    String apMarketGrpCode;
    @JsonProperty("appType") 
    public String getAppType() { 
		 return this.appType; } 
    public void setAppType(String appType) { 
		 this.appType = appType; } 
    String appType;
    @JsonProperty("agreementType") 
    public String getAgreementType() { 
		 return this.agreementType; } 
    public void setAgreementType(String agreementType) { 
		 this.agreementType = agreementType; } 
    String agreementType;
    @JsonProperty("dicCatg") 
    public String getDicCatg() { 
		 return this.dicCatg; } 
    public void setDicCatg(String dicCatg) { 
		 this.dicCatg = dicCatg; } 
    String dicCatg;
    @JsonProperty("requestedLimit") 
    public double getRequestedLimit() { 
		 return this.requestedLimit; } 
    public void setRequestedLimit(double requestedLimit) { 
		 this.requestedLimit = requestedLimit; } 
    double requestedLimit;
    @JsonProperty("initialFees") 
    public double getInitialFees() { 
		 return this.initialFees; } 
    public void setInitialFees(double initialFees) { 
		 this.initialFees = initialFees; } 
    double initialFees;
    @JsonProperty("monthlySerFee") 
    public double getMonthlySerFee() { 
		 return this.monthlySerFee; } 
    public void setMonthlySerFee(double monthlySerFee) { 
		 this.monthlySerFee = monthlySerFee; } 
    double monthlySerFee;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
