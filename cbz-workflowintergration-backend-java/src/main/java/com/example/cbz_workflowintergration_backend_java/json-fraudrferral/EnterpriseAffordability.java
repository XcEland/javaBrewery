public class EnterpriseAffordability{
    @JsonProperty("annualTurnover") 
    public double getAnnualTurnover() { 
		 return this.annualTurnover; } 
    public void setAnnualTurnover(double annualTurnover) { 
		 this.annualTurnover = annualTurnover; } 
    double annualTurnover;
    @JsonProperty("annualExpenses") 
    public double getAnnualExpenses() { 
		 return this.annualExpenses; } 
    public void setAnnualExpenses(double annualExpenses) { 
		 this.annualExpenses = annualExpenses; } 
    double annualExpenses;
    @JsonProperty("currentLiabilities") 
    public double getCurrentLiabilities() { 
		 return this.currentLiabilities; } 
    public void setCurrentLiabilities(double currentLiabilities) { 
		 this.currentLiabilities = currentLiabilities; } 
    double currentLiabilities;
    @JsonProperty("grossAssets") 
    public double getGrossAssets() { 
		 return this.grossAssets; } 
    public void setGrossAssets(double grossAssets) { 
		 this.grossAssets = grossAssets; } 
    double grossAssets;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
