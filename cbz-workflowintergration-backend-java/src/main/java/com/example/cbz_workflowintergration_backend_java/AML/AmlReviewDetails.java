public class AmlReviewDetails{
    public String amlPeriodicStatus;
    public String originatingChannel;
    public String reviewType;
    public boolean identityDetailsChanged;
    public boolean addressChanged;
    public boolean employmentDetailsChanged;
    public boolean sourceOfFundsChanged;
    public boolean currentDetailsUpToDate;
    public PeriodicReviewDetails periodicReviewDetails;
    public CustomerInitiatedReviewDetails customerInitiatedReviewDetails;
    public Metadata @metadata;
}
