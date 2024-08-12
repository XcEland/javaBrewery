public class GetDataResult{
    @JsonProperty("OnNPR") 
    public String onNPR;
    @JsonProperty("OnHANIS") 
    public String onHANIS;
    @JsonProperty("TranNo") 
    public String tranNo;
    @JsonProperty("IDNBlocked") 
    public String iDNBlocked;
    public String surname;
    @JsonProperty("DateOfDeath") 
    public String dateOfDeath;
    public String idIssueDate;
    public String convertedImageBase;
    @JsonProperty("Photo") 
    public String photo;
    public String smartCardIssued;
    @JsonProperty("Error") 
    public String error;
    @JsonProperty("IDSeqNo") 
    public String iDSeqNo;
    public String deadIndicator;
    @JsonProperty("BirthPlaceCountryCode") 
    public String birthPlaceCountryCode;
    public String name;
    @JsonProperty("MaritalStatus") 
    public String maritalStatus;
    @JsonProperty("DateOfMarriage") 
    public String dateOfMarriage;
    @JsonProperty("IDN") 
    public String iDN;
    public Metadata @metadata;
}
