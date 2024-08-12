package com.example.cbz_workflowintergration_backend_java.AML.java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class AccountDetails{
    public String cardNumber;
    public Metadata @metadata;
}

public class Address{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String type;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class AmendmentReason{
    public String reasonFirstNameChanged;
    public String reasonMiddleNameChanged;
    public String reasonLastNameChanged;
    public String reasonIdNumberChanged;
    public String reasonIdTypeChanged;
    public String reasonTitleChanged;
    public String reasonCountryOfResidenceChanged;
    public String reasonDateOfBirthChanged;
    public String reasonNationalityChanged;
    public String reasonHomePhoneNumberChanged;
    public String reasonWorkPhoneNumberChanged;
    public String reasonCellPhoneNumberChanged;
    public String reasonEmailAddressChanged;
    public Metadata @metadata;
}

public class AmlIntegrationDetails{
    public GetCustomerInput getCustomerInput;
    public GetCustomerRelatedPartiesOutput getCustomerRelatedPartiesOutput;
    public NonBiometricDHAOutput nonBiometricDHAOutput;
    public Object displayNotes;
    public InquireNoteRes inquireNoteRes;
    public MaintainComplianceRes maintainComplianceRes;
    public DocumentBoForTable documentBoForTable;
    public Metadata @metadata;
}

public class AmlProcessFlowStatus{
    public String flowAction;
    public String previousUser;
    public String amlReview;
    public String previousUserPendTask;
    public Metadata @metadata;
}

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

public class AntiMoneyLaunderingProcessDetails{
    public ProcessContext processContext;
    public AmlReviewDetails amlReviewDetails;
    public IdentityDetails identityDetails;
    public ResidentialDetails residentialDetails;
    public EmploymentDetails employmentDetails;
    public SourceOfFunds sourceOfFunds;
    public UploadedDocument uploadedDocument;
    public AmlProcessFlowStatus amlProcessFlowStatus;
    public PipDetails pipDetails;
    public Metadata @metadata;
}

public class AntiMoneyLaunderingReviewStartRequest{
    public ProcessContext processContext;
    public AmlReviewDetails amlReviewDetails;
    public IdentityDetails identityDetails;
    public ResidentialDetails residentialDetails;
    public EmploymentDetails employmentDetails;
    public SourceOfFunds sourceOfFunds;
    public UploadedDocument uploadedDocument;
    public AccountDetails accountDetails;
    public PipDetails pipDetails;
    public Metadata @metadata;
}

public class ApproveOrReject{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Business{
    public String businessStatusDate;
    public String businessType;
    public String businessStartDate;
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

public class ComplianceCnttDetails{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class ComplianceCnttStatus{
    public String complianceCnttStatusCode;
    public String description;
    public String validToDate;
    public StatusReason statusReason;
    public VerifiedBy verifiedBy;
    public Metadata @metadata;
    public boolean exemptionIndicator;
}

public class ComplianceInfo{
    public Date lastAssessDate;
    public ComplianceVerificationData complianceVerificationData;
    public ComplianceRoleStatus complianceRoleStatus;
    public Metadata @metadata;
    public boolean exemptionIndicator;
}

public class CompliancePartyInfo{
    public boolean relatedPartyIndicator;
    public String fullName;
    public Metadata @metadata;
}

public class ComplianceRecord{
    public PartyKeys partyKeys;
    public ComplianceInfo complianceInfo;
    public Metadata @metadata;
    public CompliancePartyInfo compliancePartyInfo;
}

public class ComplianceRoleStatus{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
    public String complianceRole;
    public String description;
    public CountryCode countryCode;
    public ComplianceStatus complianceStatus;
}

public class ComplianceStatus{
    public String complianceStatusCode;
    public String description;
    public Date effectiveDate;
    public StatusReason statusReason;
    public VerifiedBy verifiedBy;
    public Metadata @metadata;
}

public class ComplianceStatusRecord{
    public PartyKeys partyKeys;
    public ComplianceRoleStatus complianceRoleStatus;
    public Metadata @metadata;
}

public class ComplianceVerificationData{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class ContactDetails{
    public String homePhoneNumber;
    public String workPhoneNumber;
    public String cellPhoneNumber;
    public String emailAddress;
    public Metadata @metadata;
    public Physical physical;
    public Electronic electronic;
}

public class CountryCode{
    public String countryCodeValue;
    public Metadata @metadata;
    public String countryCodeSource;
}

public class CurrentEmployer{
    public String occupationStatus;
    public String employerName;
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

public class CustomerDetails{
    public String firstName;
    public String middleName;
    public String lastName;
    public String idType;
    public String idNumber;
    public String gender;
    public String countryOfResidence;
    public String title;
    public String bpId;
    public String nationality;
    public Metadata @metadata;
}

public class CustomerInitiatedReviewDetails{
    public String reasonCode;
    public Metadata @metadata;
}

public class CustomerResponseType{
    public RelatedPartiesSummary relatedPartiesSummary;
    public SoleProprietor soleProprietor;
    public Entity entity;
    public ContactDetails contactDetails;
    public Customer customer;
    public Header header;
    public Metadata @metadata;
}

public class Detail{
    public String kycStatus;
    public String taxNumber;
    @JsonProperty("ISICCode") 
    public String iSICCode;
    public String debtReview;
    public String countryOfOrigin;
    public Metadata @metadata;
}

public class DocumentBoForTable{
    public ArrayList<int> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class DocumentEnvr{
    public Date createdDate;
    public String creationUserId;
    public Metadata @metadata;
    public String lastUpdateDate;
    public String lastChangeUserId;
}

public class Electronic{
    public String fax;
    public String cellNumber;
    public String emailAddress;
    public String landline2;
    public String landline1;
    public Metadata @metadata;
}

public class EmailProcessBO{
    public String emailtype;
    public MessageContent messageContent;
    public String templateName;
    public Metadata @metadata;
}

public class Employment{
    public CurrentEmployer currentEmployer;
    public PreviousEmployer previousEmployer;
    public int totalYearsOfExperience;
    public Metadata @metadata;
}

public class EmploymentDetails{
    public String employerName;
    public String industry;
    public String industryDesc;
    public String designation;
    public String designationDesc;
    public String employmentType;
    public String employmentTypeDescription;
    public boolean staffInd;
    public String employmentStatus;
    public String employmentStatusDesc;
    public UnemploymentDetails unemploymentDetails;
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
    public String entityName;
}

public class EscalationBO{
    public Date reminderDay7;
    public Date expirySetDate;
    public int expiryCount;
    public Metadata @metadata;
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
    public String financialYearEnd;
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

public class GetCustomerInput{
    public String bpid;
    public String accountNumber;
    public String srcSystemID;
    public ServiceHeaderDetails serviceHeaderDetails;
    public Metadata @metadata;
}

public class GetCustomerRelatedPartiesOutput{
    @JsonProperty("CustomerResponse_Type") 
    public CustomerResponseType customerResponse_Type;
    public Metadata @metadata;
}

public class GetDataResponse{
    @JsonProperty("GetDataResult") 
    public GetDataResult getDataResult;
    public Metadata @metadata;
}

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

public class Header{
    public String kycStatus;
    public String accountNumber;
    public String customerType;
    public String marketSegment;
    public String applicationNumber;
    public String debtReview;
    public Entity entity;
    public Customer customer;
    public String bpdid;
    public String accountExecutive;
    public Metadata @metadata;
}

public class IdentityDetails{
    public ContactDetails contactDetails;
    public CustomerDetails customerDetails;
    public AmendmentReason amendmentReason;
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

public class InquireNoteRes{
    public NoteInfo noteInfo;
    public Metadata @metadata;
}

public class Item{
    @JsonProperty("Name") 
    public String name;
    @JsonProperty("Value") 
    public String value;
    @JsonProperty("Key") 
    public String key;
    public Metadata @metadata;
    public String sourceOfFundsDescription;
    public Object amendmentType;
    public String sourceOfFundsCategory;
    public double sourceOfFundsAmount;
    public String financialTypeCode;
    public String financialSubTypeCode;
    public boolean amountChanged;
    public Date uploadDate;
    public String documentId;
    public String sourceId;
    public String source;
    public String fileName;
    public String mimeType;
    public String fileSize;
    public String fileDescription;
    public String category;
    public String subCategory;
    public String reasonForChange;
    public String uploadedBy;
    public String complianceType;
    public boolean exemptionIndicator;
    public ComplianceCnttDetails complianceCnttDetails;
    public String cnttId;
    public String docType;
    public String docTypeName;
    public String docContentType;
    public String docContentTypeName;
    public String docTitle;
    public String cnttURL;
    public String description;
    public DocumentEnvr documentEnvr;
    public String language;
    public String languageName;
    public ComplianceCnttStatus complianceCnttStatus;
    public VerificationProperties verificationProperties;
    public String complianceStatusReasonCode;
    public String complianceReasonDescription;
    public String effectiveDate;
    public String dataKeyCode;
    public String dataKeyDescription;
    public String dataValue;
    public String complianceRole;
    public CountryCode countryCode;
    public ComplianceStatus complianceStatus;
    public ApproveOrReject approveOrReject;
    public ReasonForRejection reasonForRejection;
}

public class LanguageCode{
    public String code;
    public String description;
    public Metadata @metadata;
}

public class LoginIdent{
    public String loginAuthority;
    public String loginName;
    public Metadata @metadata;
}

public class MaintainComplianceRes{
    public ResponseStatus responseStatus;
    public ComplianceRecord complianceRecord;
    public Metadata @metadata;
    public ComplianceStatusRecord complianceStatusRecord;
}

public class MessageContent{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
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

public class NetworkTrnData{
    public String networkOwner;
    public String originatorName;
    public String acquirerIdent;
    public String contentTypeXSB;
    public String interfaceNameXSB;
    public Metadata @metadata;
}

public class NonBiometricDHAOutput{
    public ResponseHeader responseHeader;
    public GetDataResponse getDataResponse;
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
    public String noteDate;
    public String noteTime;
    public String noteText;
    public LanguageCode languageCode;
    public Metadata @metadata;
}

public class NoteObject{
    public NoteType noteType;
    public String linkedObjectId;
    public Metadata @metadata;
}

public class NoteType{
    public String code;
    public String description;
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

public class PartyKeys{
    public String partyId;
    public Metadata @metadata;
    public SvcIdent svcIdent;
    public LoginIdent loginIdent;
}

public class PeriodicReviewDetails{
    public String periodicFrequency;
    public Object dueDate;
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

public class PipDetails{
    public boolean pipInd;
    public boolean pipRelationshipInd;
    public String pipRelationshipType;
    public String pipRelationshipDesc;
    public String pipRelationshipName;
    public String pipRelationshipSurname;
    public Metadata @metadata;
}

public class PostalAddress{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String type;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class PreviousEmployer{
    public String employerName;
    public int yearsAtEmployer;
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

public class ReasonForRejection{
    public Reject reject;
    public String approve;
    public Metadata @metadata;
}

public class RegisteredAddress{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String type;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class Registration{
    public String registeredName;
    public String registrationDate;
    public String tradingName;
    public String previousName;
    public Metadata @metadata;
}

public class Reject{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class RelatedPartiesSummary{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class ResidentialAddress{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String type;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class ResidentialAddressPrevious{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String type;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class ResidentialDetails{
    public String countryOfResidence;
    public String buildingName;
    public String suburb;
    public String postalCode;
    public String unitFloorRoomNumber;
    public String streetNameAndNumber;
    public String cityTown;
    public String province;
    public String addressLine1;
    public String addressLine2;
    public String addressLine3;
    public String addressLine4;
    public String addressLine5;
    public String addressLine6;
    public Metadata @metadata;
}

public class ResponseBO{
    public String id;
    public String statusCode;
    public String statusDescription;
    public String serverStatusCode;
    public String severity;
    public Metadata @metadata;
}

public class ResponseHeader{
    public ResponseBO responseBO;
    public Metadata @metadata;
}

public class ResponseStatus{
    public String statusCode;
    public String serverStatusCode;
    public String severity;
    public Metadata @metadata;
    public String id;
    public String statusDescription;
}

public class Root{
    public EscalationBO escalationBO;
    public TrackingValues trackingValues;
    public EmailProcessBO emailProcessBO;
    @JsonProperty("DQMConsultant") 
    public String dQMConsultant;
    public MaintainComplianceRes maintainComplianceRes;
    public AntiMoneyLaunderingProcessDetails antiMoneyLaunderingProcessDetails;
    @JsonProperty("ReturnValue") 
    public String returnValue;
    public AntiMoneyLaunderingReviewStartRequest antiMoneyLaunderingReviewStartRequest;
    public AmlIntegrationDetails amlIntegrationDetails;
}

public class ServiceHeaderDetails{
    public String callerId;
    public String processInstanceId;
    public String loggedInUserName;
    public String logLevel;
    public String callerVersion;
    public String screenName;
    public String bpmProcessName;
    public String serviceName;
    public Metadata @metadata;
}

public class SoleProprietor{
    public Employment employment;
    public Financials financials;
    public Metadata @metadata;
}

public class SourceOfFunds{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class StatusReason{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class SvcIdent{
    public String svcProviderName;
    public String svcName;
    public Metadata @metadata;
}

public class TrackingValues{
    @JsonProperty("IDdocumentId") 
    public String iDdocumentId;
    public String addressDocumentId;
    public String sourceOfFundsDescription;
    public String sourceOfFundsAmount;
    public String amendmentType;
    public String amountChanged;
    public Metadata @metadata;
}

public class TradingAddress{
    public String postalCode;
    public String suburb;
    public String province;
    public String streetName;
    public String type;
    public String city;
    public String country;
    public Metadata @metadata;
}

public class UnemploymentDetails{
    public String unemploymentReason;
    public Date unemploymentStartDate;
    public Object unemploymentEndDate;
    public String unemploymentTypeDescription;
    public String orgCatIdentValue;
    public String occupation;
    public Metadata @metadata;
}

public class UploadedDocument{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class VerificationProperties{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class VerifiedBy{
    public String verifiedByAcquirerIdent;
    public Date verificationDate;
    public String sourceSystem;
    public Metadata @metadata;
    public String sourceSystemName;
}


