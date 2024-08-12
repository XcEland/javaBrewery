public class Customer{
    public String dateOfBirth;
    public String tempResidentDt;
    public String surname;
    public String maritalStatus;
    public String otherNames;
    public String resident;
    @JsonProperty("KYCStatus") 
    public String kYCStatus;
    public String id_passportNumber;
    public String countryOfBirth;
    public String title;
    @JsonProperty("PEPStatus") 
    public String pEPStatus;
    public String student;
    public String initials;
    public String graduate;
    public String gender;
    public String language;
    public String tempResident;
    public String firstName;
    public Metadata @metadata;
    public IdType idType;
    public String pep_Status;
}
