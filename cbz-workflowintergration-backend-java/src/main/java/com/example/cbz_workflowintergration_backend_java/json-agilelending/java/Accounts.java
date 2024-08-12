package com.example.cbz_workflowintergration_backend_java.json-agilelending.java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Accounts{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Address{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class AgileLendinfOfferDetails{
    public double total;
    public Holdback holdback;
    public Amount amount;
    public DailyRepayment dailyRepayment;
    public boolean isReferenceRequired;
    public double topUpDiscount;
    public double term;
    public double interest;
    public Repayment repayment;
    public String completionDate;
    public double balanceBroughtForward;
    public boolean isTopUp;
    public String collectionOption;
    public CollectionOptions collectionOptions;
    public Accounts accounts;
    public Metadata @metadata;
}

public class AgileLendingBusinessBO{
    public String tradingAddress;
    public String approvalStatus;
    public String billingAccount;
    public String businessEntityBPID;
    public String legalName;
    public String tradingName;
    public String businessRegNo;
    public String businessResolution;
    public String campaignRef;
    public String telephoneNumber;
    public Metadata @metadata;
}

public class AgileLendingDirectorBO{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class AgileLendingGlobalApprovalDetails{
    public String globalStatus;
    public ApproverDetails approverDetails;
    public Metadata @metadata;
}

public class AgileLendingInitiatorDetails{
    public String cellphoneNumber;
    public String digitalIdEmail;
    public String bpid;
    public String firstName;
    public String identificationNumber;
    public String lastName;
    public String identityType;
    public int digitalId;
    public Metadata @metadata;
}

public class AgileLendingProcessReq{
    public StartAgileSELendingOrigination startAgileSELendingOrigination;
    public boolean interestedInCrossSell;
    public Metadata @metadata;
}

public class AgileLendingReferences{
    public References references;
    public ReferencesResponse referencesResponse;
    public Metadata @metadata;
}

public class AgileSELendingOriginationProcessBO{
    public ProcessContext processContext;
    public AgileLendingBusinessBO agileLendingBusinessBO;
    public AgileLendingInitiatorDetails agileLendingInitiatorDetails;
    public AgileLendingDirectorBO agileLendingDirectorBO;
    public AgileLendinfOfferDetails agileLendinfOfferDetails;
    public AgileLendingGlobalApprovalDetails agileLendingGlobalApprovalDetails;
    public AgileLendingReferences agileLendingReferences;
    public GetMultipleCustomer getMultipleCustomer;
    public GetBillingAccountBranchDetails getBillingAccountBranchDetails;
    public Metadata @metadata;
}

public class Amount{
    public String message;
    public double min;
    public double max;
    public double quoted;
    public Metadata @metadata;
}

public class ApprovalHistory{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class ApprovalOtp{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class ApproverDetails{
    public String approvalDate;
    public String approverDigitalId;
    public String approverStatus;
    public Metadata @metadata;
}

public class Business{
    public String businessStatusDate;
    public String businessType;
    public String businessStatus;
    public Metadata @metadata;
}

public class ClientApp{
    public String org;
    public String name;
    public String version;
    public String srcSystemXSB;
    public Metadata @metadata;
}

public class CollectionOptions{
    public ArrayList<Object> selected;
    public ArrayList<String> items;
    public Metadata @metadata;
}

public class Company{
    public String tradingName;
    @JsonProperty("CompanyRegNo") 
    public String companyRegNo;
    public Metadata @metadata;
}

public class ContactDetails{
    public Physical physical;
    public Electronic electronic;
    public Metadata @metadata;
}

public class Contacts{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class CurrentEmployer{
    public String occupationStatus;
    public Address address;
    public String designation;
    public int yearsAtEmployer;
    public String occupationIndustry;
    public String workNumber;
    public Metadata @metadata;
}

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

public class DailyRepayment{
    public double lowValue;
    public double highValue;
    public Metadata @metadata;
}

public class Days{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Detail{
    @JsonProperty("ISICCode") 
    public String iSICCode;
    public String countryOfOrigin;
    public Metadata @metadata;
}

public class Electronic{
    public String fax;
    public String cellNumber;
    public String emailAddress;
    public String landline2;
    public String landline1;
    public Metadata @metadata;
}

public class Employment{
    public CurrentEmployer currentEmployer;
    public PreviousEmployer previousEmployer;
    public int totalYearsOfExperience;
    public String financials;
    public Metadata @metadata;
}

public class Entity{
    public Financial financial;
    public Detail detail;
    public Registration registration;
    public Business business;
    public Metadata @metadata;
    public String registrationNumber;
    public String ibtNumber;
    public String businessType;
}

public class Expense{
    public int totalMonthlyExpense;
    public int monthlyLivingExpense;
    public Metadata @metadata;
}

public class Financial{
    public String financialEffectiveDate;
    public int issueCapitalAmount;
    public String numberOfMonths;
    public String financialsSigned;
    public int authorisedCapitalAmount;
    public Metadata @metadata;
}

public class Financials{
    public Expense expense;
    public Income income;
    public String numberOfMonths;
    public int totalYearsEmployed;
    public String financialsSigned;
    public Metadata @metadata;
}

public class GetBillingAccountBranchDetails{
    public String branchName;
    public String branchCode;
    public String accountHolderName;
    public Metadata @metadata;
}

public class GetMultipleCustomer{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Header{
    public String customerType;
    public String marketSegment;
    public Entity entity;
    public Customer customer;
    public String bpdid;
    public Metadata @metadata;
}

public class Holdback{
    public String message;
    public double min;
    public double max;
    public double quoted;
    public Metadata @metadata;
}

public class IdType{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Income{
    public String incomeUpdatedDate;
    public int otherIncome;
    public int grossMonthlySalary;
    public int totalMonthlyIncome;
    public Metadata @metadata;
}

public class Item{
    public String objectId;
    public String objectType;
    public Metadata @metadata;
    public String identificationNumber;
    public boolean consentProvided;
    public String approvalStatus;
    public String cellphoneNumber;
    public String digitalIdEmail;
    public String directorBpid;
    public String firstName;
    public String lastName;
    public String referenceNumber;
    public String identityType;
    public String institution;
    public String maskedAccountNumber;
    public String accountNumber;
    public String type;
    public String phone;
    public String name;
    public boolean ownedByMerchant;
    public String email;
    public String revenueDate;
    public double minimumMonthlyRevenue;
    public double minimumDailyRevenue;
    public String bpid;
    public String cellNumber;
    public String referenceCode;
    public String idNumber;
    public int counter;
    public String surname;
    public String emailAddress;
    public Object approvalDate;
    public String taskId;
    public int digitalId;
    public double repaymentPerDay;
    public double businessRevenue;
    public RelatedPartiesSummary relatedPartiesSummary;
    public SoleProprietor soleProprietor;
    public Entity entity;
    public ContactDetails contactDetails;
    public Customer customer;
    public Header header;
    public String relationship;
    public String partType;
    public String fraudFlag;
    public String bpdid;
    public String accountRole;
    public String shareHoldingPercentage;
}

public class Metadata{
    public String objectID;
    public boolean dirty;
    public boolean invalid;
    public boolean shared;
    public String rootVersionContextID;
    public String className;
    public boolean contentObject;
    public String key;
    public int version;
}

public class MonthlyRevenues{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
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

public class ObjectKeys{
    public String primaryId;
    public String primaryType;
    public ObjectRef objectRef;
    public Metadata @metadata;
}

public class ObjectRef{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Physical{
    public PostalAddress postalAddress;
    public RegisteredAddress registeredAddress;
    public ResidentialAddressPrevious residentialAddressPrevious;
    public TradingAddress tradingAddress;
    public ResidentialAddress residentialAddress;
    public Metadata @metadata;
}

public class PostalAddress{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class PreviousEmployer{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String city;
    public String country;
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

public class References{
    public double holdback;
    public double amount;
    public Company company;
    public String campaignLineReference;
    public Contacts contacts;
    public boolean isTopUp;
    public Metadata @metadata;
}

public class ReferencesResponse{
    public ServiceHeader serviceHeader;
    public String accountNumber;
    public String contractNumber;
    public MonthlyRevenues monthlyRevenues;
    public double additionalAmount;
    public double expectedTerm;
    public double principalDebtCreditLimit;
    public String dateSignedBy;
    public double interestAmount;
    public double facilityAmount;
    public double creditFactor;
    public double holdbackPercentage;
    public double minimumRevenuePeriod;
    public double balanceBroughtForward;
    public String collectionOption;
    public Accounts accounts;
    public Metadata @metadata;
}

public class RegisteredAddress{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class Registration{
    public String registrationDate;
    public String registeredName;
    public String tradingName;
    public String previousName;
    public Metadata @metadata;
}

public class RelatedPartiesSummary{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Repayment{
    public String footer;
    public Days days;
    public String header;
    public Metadata @metadata;
}

public class ResidentialAddress{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class ResidentialAddressPrevious{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class Root{
    public String businessEntityBPID;
    public String variable1;
    public Date applicationExpiryDate;
    public AgileSELendingOriginationProcessBO agileSELendingOriginationProcessBO;
    public StartAgileSELendingOrigination startAgileSELendingOrigination;
    public String campaignRef;
    public ApprovalOtp approvalOtp;
    public ApprovalHistory approvalHistory;
    public String processId;
    public String refNumber;
    public AgileLendingProcessReq agileLendingProcessReq;
    public String flowAction;
    public String referenceCode;
}

public class ServiceHeader{
    public String id;
    public String statusCode;
    public String serverStatusCode;
    public String severity;
    public String statusDescription;
    public Metadata @metadata;
}

public class SoleProprietor{
    public Employment employment;
    public Financials financials;
    public Metadata @metadata;
}

public class StartAgileSELendingOrigination{
    public ProcessContext processContext;
    public AgileLendingBusinessBO agileLendingBusinessBO;
    public AgileLendingInitiatorDetails agileLendingInitiatorDetails;
    public AgileLendingDirectorBO agileLendingDirectorBO;
    public AgileLendinfOfferDetails agileLendinfOfferDetails;
    public AgileLendingReferences agileLendingReferences;
    public Metadata @metadata;
}

public class TradingAddress{
    public String postalCode;
    public String suburb;
    public String province;
    @JsonProperty("Untitled") 
    public String untitled;
    public String streetName;
    public String city;
    public String country;
    public Metadata @metadata;
}


