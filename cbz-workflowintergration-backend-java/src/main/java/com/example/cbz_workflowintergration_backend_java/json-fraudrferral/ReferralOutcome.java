public class ReferralOutcome{
    @JsonProperty("rafDecision") 
    public String getRafDecision() { 
		 return this.rafDecision; } 
    public void setRafDecision(String rafDecision) { 
		 this.rafDecision = rafDecision; } 
    String rafDecision;
    @JsonProperty("referralDecision") 
    public ReferralDecision getReferralDecision() { 
		 return this.referralDecision; } 
    public void setReferralDecision(ReferralDecision referralDecision) { 
		 this.referralDecision = referralDecision; } 
    ReferralDecision referralDecision;
    @JsonProperty("adverseReasons") 
    public AdverseReasons getAdverseReasons() { 
		 return this.adverseReasons; } 
    public void setAdverseReasons(AdverseReasons adverseReasons) { 
		 this.adverseReasons = adverseReasons; } 
    AdverseReasons adverseReasons;
    @JsonProperty("referralAdverseReasons") 
    public ReferralAdverseReasons getReferralAdverseReasons() { 
		 return this.referralAdverseReasons; } 
    public void setReferralAdverseReasons(ReferralAdverseReasons referralAdverseReasons) { 
		 this.referralAdverseReasons = referralAdverseReasons; } 
    ReferralAdverseReasons referralAdverseReasons;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
