public class EnterpriseDetails{
    public String entType;
    public String enterpriseType;
    public String organizationName;
    public String industryCode;
    public String tradingName;
    public String registrationNumber;
    public String registrationDate;
    public String businessType;
    public String ageOfBusiness;
    public String numberOfEmployees;
    public String numberOfShareholders;
    public String numberOfEntities;
    public String marketSegment;
    public String residenceIndicator;
    @JsonProperty("BEE_Code") 
    public String bEE_Code;
    public String physicalAddress;
    public String tradingAddressLine;
    public String telBusinessCode;
    public String telBusinessNum;
    public String telCellCode;
    public String telCellNum;
    public String physicalPostalCode;
    public String tradingPostalCode;
    public Metadata @metadata;
}
