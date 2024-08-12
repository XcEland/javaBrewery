package com.example.cbz_workflowintergration_backend_java.json-creditarbitration.java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class AccommodationType{
    public String name;
    public Metadata @metadata;
}

public class AccountExecutiveDetails{
    public String name;
    public String email;
    public Metadata @metadata;
}

public class Address{
    public String addressLine1;
    public String suburb;
    public String city;
    public String postalCode;
    public AccommodationType accommodationType;
    public String province;
    public String country;
    public Metadata @metadata;
}

public class ApplicationDetails{
    public Date appDate;
    public String appStatus;
    public String custName;
    public String custSurname;
    public String custId;
    public MarketSegment marketSegment;
    public Offer offer;
    public String debtReview;
    public CustType custType;
    public ResidentialStatus residentialStatus;
    public String kycStatus;
    public AccountExecutiveDetails accountExecutiveDetails;
    public String bri;
    public String initial;
    public Metadata @metadata;
}

public class ArbitrationRqRs{
    public ProcessContext processContext;
    public ReferralDetails referralDetails;
    public DocumentDetails documentDetails;
    public int arbitrationCount;
    public boolean ifFirstArbitrationForOffer;
    public String productId;
    public MotivationDetails motivationDetails;
    public Metadata @metadata;
}

public class Branch{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class BranchDetails{
    public String officerId;
    public String officerName;
    public Branch branch;
    public Center center;
    public Province province;
    public Region region;
    public Metadata @metadata;
}

public class ButiKomanaStandardbankCoZa{
    public String uid;
    public String uniqueName;
    public String externalName;
    public String repositoryId;
    public String cn;
    public String sn;
}

public class CardLinking{
    public String zzbCardNbr;
    public String zzbCardType;
    public String zzbAccType;
    public String zzbMnthLimit;
    public String zzbDailyLimit;
    public String zzbRefNumber;
    public Metadata @metadata;
}

public class Center{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Channel{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ClientApp{
    public String org;
    public String name;
    public String version;
    public String srcSystemXSB;
    public Metadata @metadata;
}

public class Conditions{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class ContactDetails{
    public String cellPhoneNumber;
    public PreferredContactType preferredContactType;
    public Metadata @metadata;
}

public class CreditAssessmentDetails{
    public HeaderDetails headerDetails;
    public ApplicationDetails applicationDetails;
    public BranchDetails branchDetails;
    public Notes notes;
    public String rafUniqueKey;
    public String bpId;
    public Channel channel;
    public String priority;
    public Date overDueDate;
    public double totCustomerExposure;
    public Documents documents;
    public String preferredBranch;
    public String staffInd;
    public Metadata @metadata;
}

public class CreditDeclineReasons{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class CurrentEmployer{
    public int years;
    public Address address;
    public Object workNumber;
    public OccupationStatus occupationStatus;
    public Designation designation;
    public OccupationIndustry occupationIndustry;
    public String _employerName;
    public Date employmentStartDate;
    public Date employmentEndDate;
    public String staffInd;
    public Metadata @metadata;
}

public class CustomerDetails{
    public PersonalDetails personalDetails;
    public PrevResidentialAddress prevResidentialAddress;
    public ResidentialAddress residentialAddress;
    public PostalAddress postalAddress;
    public EmploymentDetails employmentDetails;
    public Financials financials;
    public ContactDetails contactDetails;
    public Metadata @metadata;
}

public class CustType{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Dates{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class DeclineReasons{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Designation{
    public String value;
    public Metadata @metadata;
}

public class DocumentDetails{
    public String fileName;
    public String documentType;
    public String documentID;
    public String contentURL;
    public String createdDate;
    public String uploadedBy;
    public boolean isBranchUploaded;
    public boolean kycIndicator;
    public String kycVerificationDate;
    public String kycVerifiedBy;
    public String docucmentTypeDescription;
    public Metadata @metadata;
}

public class Documents{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class EmploymentDetails{
    public CurrentEmployer currentEmployer;
    public PreviousEmployer previousEmployer;
    public Metadata @metadata;
}

public class Financials{
    public Date incomeUpdatedDate;
    public double grossMonthlySalary;
    public double totalMonthlyIncome;
    public double otherMonthlyIncome;
    public double totalMonthlyExpenses;
    public double livingMonthlyExpenses;
    public int _totalYearsEmployes;
    public Metadata @metadata;
}

public class FraudReferralReasons{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Gender{
    public String value;
    public Metadata @metadata;
}

public class HeaderDetails{
    public String custFirstName;
    public String custSurname;
    public String custIdNumber;
    public String bpId;
    public String acntNo;
    public String offerId;
    public String acntExecutive;
    public MarketSegment marketSegment;
    public Metadata @metadata;
}

public class IdType{
    public String value;
    public Metadata @metadata;
}

public class Item{
    public String itemId;
    public ProdType prodType;
    public ProdCategory prodCategory;
    public ProdName prodName;
    public double requestedLimit;
    public double offerLimitMin;
    public double offerLimitMax;
    public double offeredLimit;
    public double selectedLimit;
    public String bri;
    public String accNumber;
    public double interestRate;
    public String term;
    public Conditions conditions;
    public double instalment;
    public Notes notes;
    public DeclineReasons declineReasons;
    public String creditStatus;
    public String applicationStatus;
    public String buttonVisibility;
    public CreditDeclineReasons creditDeclineReasons;
    public String rateType;
    public String maxTerm;
    public String minTerm;
    public CardLinking cardLinking;
    public String expiryDate;
    public Dates dates;
    public TempLimit tempLimit;
    public Metadata @metadata;
    public String name;
    public String value;
    public NoteInfo noteInfo;
    public MotivationReasons motivationReasons;
    public String motivationComments;
    public Date motivationDate;
    public String userId;
}

public class Language{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class LanguageCode{
    public Metadata @metadata;
}

public class LdapRqUserAttributes{
    public ArrayList<Object> selected;
    public ArrayList<String> items;
    public Metadata @metadata;
}

public class LdapRsUserAttributes{
    @JsonProperty("Buti.Komana@standardbank.co.za") 
    public ButiKomanaStandardbankCoZa buti.Komana@standardbank.co.za;
}

public class LdapUser{
    public String uid;
    public String uniqueName;
    public String externalName;
    public String repositoryId;
    public String cn;
    public String sn;
}

public class MaritalStatus{
    public String value;
    public Metadata @metadata;
}

public class MarketSegment{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Metadata{
    public String objectID;
    public boolean dirty;
    public boolean invalid;
    public boolean shared;
    public String rootVersionContextID;
    public String className;
    public boolean contentObject;
}

public class MotivationDetails{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class MotivationReasons{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class NetworkTrnData{
    public String networkOwner;
    public String originatorName;
    public String acquirerIdent;
    public String contentTypeXSB;
    public String interfaceNameXSB;
    public Metadata @metadata;
}

public class NoteCategoryInfo{
    public String code;
    public String description;
    public Metadata @metadata;
}

public class NoteInfo{
    public NoteObject noteObject;
    public NoteCategoryInfo noteCategoryInfo;
    public String noteCreatedBy;
    public Date noteDate;
    public Date noteTime;
    public String noteText;
    public LanguageCode languageCode;
    public Metadata @metadata;
}

public class NoteObject{
    public NoteType noteType;
    public String linkedObjectId;
    public Metadata @metadata;
}

public class Notes{
    public ArrayList<Object> selected;
    public ArrayList<String> items;
    public Metadata @metadata;
}

public class NoteType{
    public Metadata @metadata;
}

public class ObjectKeys{
    public String primaryId;
    public String primaryType;
    public ObjectRef objectRef;
    public Metadata @metadata;
}

public class ObjectRef{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class OccupationIndustry{
    public String value;
    public Metadata @metadata;
}

public class OccupationStatus{
    public String value;
    public Metadata @metadata;
}

public class Offer{
    public String offerId;
    public String offerStatus;
    public OfferDetails offerDetails;
    public String applicationDate;
    public String applicationTime;
    public FraudReferralReasons fraudReferralReasons;
    public double totalExposure;
    public double totalSelectedAmount;
    public double totalMonthlyRepayment;
    public double surplusAmount;
    public String originatingChannel;
    public String originatingProcess;
    public Metadata @metadata;
}

public class OfferDetails{
    public ArrayList<int> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Origin{
    public String value;
    public Metadata @metadata;
}

public class PersonalDetails{
    public Title title;
    public String initials;
    public String firstName;
    public String surname;
    public Date dob;
    public Language language;
    public Gender gender;
    public MaritalStatus maritalStatus;
    public IdType idType;
    public String idNumber;
    public String studentInd;
    public String medicalProfQualInd;
    public String cellNumber;
    public String email;
    public String kycStatus;
    public Origin origin;
    public String residentInd;
    public String tempResidentInd;
    public String preferredBranch;
    public Metadata @metadata;
}

public class PostalAddress{
    public String addressLine1;
    public String suburb;
    public String city;
    public String postalCode;
    public AccommodationType accommodationType;
    public String province;
    public String country;
    public Metadata @metadata;
}

public class PreferredContactType{
    public String value;
    public Metadata @metadata;
}

public class PreviousEmployer{
    public Metadata @metadata;
}

public class PrevResidentialAddress{
    public Metadata @metadata;
}

public class ProcessContext{
    public String msgGroupReference;
    public String clientTerminalSeqNum;
    public String partyId;
    public String bpdName;
    public NetworkTrnData networkTrnData;
    public ClientApp clientApp;
    public ObjectKeys objectKeys;
    public Metadata @metadata;
}

public class ProdCategory{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ProdName{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ProdType{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Province{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ReferralDetails{
    public String offerId;
    public Date appDate;
    public BranchDetails branchDetails;
    public MarketSegment marketSegment;
    public String rafUniqueKey;
    public boolean fraudReferral;
    public boolean creditReferral;
    public double existingExposure;
    public String creditEvaluationUser;
    public Metadata @metadata;
}

public class Region{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ResidentialAddress{
    public String addressLine1;
    public String suburb;
    public String city;
    public String postalCode;
    public AccommodationType accommodationType;
    public String province;
    public String country;
    public Metadata @metadata;
}

public class ResidentialStatus{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Root{
    public CreditAssessmentDetails creditAssessmentDetails;
    public LdapRqUserAttributes ldapRqUserAttributes;
    public String originatingOfficerId;
    public MotivationDetails motivationDetails;
    public LdapRsUserAttributes ldapRsUserAttributes;
    public String branchOfficerId;
    public String creditEvaluationUser;
    public Object employmentStartDate;
    public String msgGroupReference;
    public LdapUser ldapUser;
    public UsersSearchCriteria usersSearchCriteria;
    public Object employmentEndDate;
    public ArbitrationRqRs arbitrationRqRs;
    public String flowAction;
    public int arbitrationCounter;
    public CustomerDetails customerDetails;
}

public class TempLimit{
    public String limitIndicator;
    public String reviewStartDate;
    public String reviewEndDate;
    public Metadata @metadata;
}

public class Title{
    public String name;
    public Metadata @metadata;
}

public class UsersSearchCriteria{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

