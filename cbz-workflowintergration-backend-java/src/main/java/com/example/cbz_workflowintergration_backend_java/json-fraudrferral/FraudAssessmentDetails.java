public class FraudAssessmentDetails{
    @JsonProperty("lastAnalyst") 
    public String getLastAnalyst() { 
		 return this.lastAnalyst; } 
    public void setLastAnalyst(String lastAnalyst) { 
		 this.lastAnalyst = lastAnalyst; } 
    String lastAnalyst;
    @JsonProperty("lastTeamLeader") 
    public String getLastTeamLeader() { 
		 return this.lastTeamLeader; } 
    public void setLastTeamLeader(String lastTeamLeader) { 
		 this.lastTeamLeader = lastTeamLeader; } 
    String lastTeamLeader;
    @JsonProperty("priority") 
    public String getPriority() { 
		 return this.priority; } 
    public void setPriority(String priority) { 
		 this.priority = priority; } 
    String priority;
    @JsonProperty("stepCounter") 
    public int getStepCounter() { 
		 return this.stepCounter; } 
    public void setStepCounter(int stepCounter) { 
		 this.stepCounter = stepCounter; } 
    int stepCounter;
    @JsonProperty("isApplicationEscalated") 
    public boolean getIsApplicationEscalated() { 
		 return this.isApplicationEscalated; } 
    public void setIsApplicationEscalated(boolean isApplicationEscalated) { 
		 this.isApplicationEscalated = isApplicationEscalated; } 
    boolean isApplicationEscalated;
    @JsonProperty("VAFfraudAssessment") 
    public VAFfraudAssessment getVAFfraudAssessment() { 
		 return this.vAFfraudAssessment; } 
    public void setVAFfraudAssessment(VAFfraudAssessment vAFfraudAssessment) { 
		 this.vAFfraudAssessment = vAFfraudAssessment; } 
    VAFfraudAssessment vAFfraudAssessment;
    @JsonProperty("referralOutcome") 
    public ReferralOutcome getReferralOutcome() { 
		 return this.referralOutcome; } 
    public void setReferralOutcome(ReferralOutcome referralOutcome) { 
		 this.referralOutcome = referralOutcome; } 
    ReferralOutcome referralOutcome;
    @JsonProperty("prevFlowAction") 
    public String getPrevFlowAction() { 
		 return this.prevFlowAction; } 
    public void setPrevFlowAction(String prevFlowAction) { 
		 this.prevFlowAction = prevFlowAction; } 
    String prevFlowAction;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}
