package com.example.cbz_workflowintergration_backend_java.dfc.java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class AccommodationType{
    public String name;
    public Metadata @metadata;
}

public class AccountExecutiveCenter{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class AccountInfoDetails{
    public RetrieveAccountInfoReq retrieveAccountInfoReq;
    public RetrieveAccountInfoRes retrieveAccountInfoRes;
    public RetrieveAccountInfoErrorDetails retrieveAccountInfoErrorDetails;
    public Metadata @metadata;
}

public class AccountResponseInfo{
    @JsonProperty("VarPortions") 
    public VarPortions varPortions;
    public Metadata @metadata;
}

public class Accounts{
    public Metadata @metadata;
}

public class AccountTypeFrom{
    public Metadata @metadata;
}

public class AccountTypeTo{
    public Metadata @metadata;
}

public class AdditionalStatus{
    @JsonProperty("SubjectElement") 
    public SubjectElement subjectElement;
    public Metadata @metadata;
}

public class Address{
    public Metadata @metadata;
}

public class AutoCardLinkDetails{
    public CardLinkingReq cardLinkingReq;
    public CardLinkingRes cardLinkingRes;
    public CardLinkingErrorDetails cardLinkingErrorDetails;
    public Metadata @metadata;
}

public class AutoInterAccountTransferDetails{
    public InterAccountTransferReq interAccountTransferReq;
    public InterAccountTransferRes interAccountTransferRes;
    public InterAccountTransferSoapError interAccountTransferSoapError;
    public Metadata @metadata;
}

public class Branch{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class BranchDetails{
    public Metadata @metadata;
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

public class CardLinkingDetails{
    public AutoCardLinkDetails autoCardLinkDetails;
    public ManualCardLinkingDetails manualCardLinkingDetails;
    public boolean rcpLinkedToCard;
    public Metadata @metadata;
}

public class CardLinkingErrorDetails{
    public Metadata @metadata;
}

public class CardLinkingReq{
    public Metadata @metadata;
}

public class CardLinkingRes{
    public Metadata @metadata;
}

public class Center{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class CenterType{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Channel{
    public String originatingChannel;
    public String description;
    public Metadata @metadata;
}

public class ChannelDetails{
    public String officerId;
    public String officerName;
    public Channel channel;
    public Branch branch;
    public Center center;
    public Province province;
    public Region region;
    public AccountExecutiveCenter accountExecutiveCenter;
    public Metadata @metadata;
}

public class ClientApp{
    public String org;
    public String name;
    public String version;
    public String srcSystemXSB;
    public Metadata @metadata;
}

public class CompletedBy{
    public Metadata @metadata;
}

public class Condition{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class Conditions{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class ContactDetails{
    public String homeNumber;
    public PreferredContactType preferredContactType;
    public Metadata @metadata;
}

public class ContextRsHdr{
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

public class Dates{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class DateX{
    public Metadata @metadata;
}

public class Designation{
    public String value;
    public Metadata @metadata;
}

public class DetailsOfLink{
    public String cardNumber;
    public String accountNumber;
    public String position;
    public Metadata @metadata;
}

public class DisbursementDetails{
    public InterAccountTransferDetails interAccountTransferDetails;
    public Metadata @metadata;
}

public class EaoDfcFulfillmentReq{
    public ProcessContext processContext;
    public String offerId;
    public String bpId;
    public Conditions conditions;
    public ChannelDetails channelDetails;
    public MarketSegment marketSegment;
    public CenterType centerType;
    public Metadata @metadata;
}

public class EAODfcFulfillmentType{
    public String channel;
    public HeaderDetails headerDetails;
    public CustomerDetails customerDetails;
    public OfferDetails offerDetails;
    public Condition condition;
    public BranchDetails branchDetails;
    public FulfilmentRelease fulfilmentRelease;
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

public class FulfilmentNotification{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class FulfilmentRelease{
    public AccountInfoDetails accountInfoDetails;
    public CardLinkingDetails cardLinkingDetails;
    public FulfilmentNotification fulfilmentNotification;
    public DisbursementDetails disbursementDetails;
    public Metadata @metadata;
}

public class Gender{
    public String value;
    public Metadata @metadata;
}

public class GetAfforadabilityRes{
    public double totalIncome;
    public double totalExpense;
    public Metadata @metadata;
}

public class HeaderDetails{
    public String bpId;
    public String offerId;
    public MarketSegment marketSegment;
    public Metadata @metadata;
}

public class IdType{
    public String value;
    public Metadata @metadata;
}

public class InteraccountResponseInfo{
    public Metadata @metadata;
}

public class InterAccountResponseInfo2{
    @JsonProperty("DateX") 
    public DateX dateX;
    @JsonProperty("Personal") 
    public Personal personal;
    public Metadata @metadata;
}

public class InterAccountTransferDetails{
    public AutoInterAccountTransferDetails autoInterAccountTransferDetails;
    public ManualInterAccountTransferDetails manualInterAccountTransferDetails;
    public boolean fundstransferred;
    public Metadata @metadata;
}

public class InterAccountTransferReq{
    public AccountTypeTo accountTypeTo;
    public ServiceHeaderDetails serviceHeaderDetails;
    public AccountTypeFrom accountTypeFrom;
    public Metadata @metadata;
}

public class InterAccountTransferRes{
    public Response response;
    public MsgHeader msgHeader;
    public InterAccountResponseInfo interAccountResponseInfo;
    public Metadata @metadata;
}

public class InterAccountTransferSoapError{
    public Metadata @metadata;
}

public class Item{
    public String itemId;
    public ProdType prodType;
    public ProdName prodName;
    public double requestedLimit;
    public double offerLimitMin;
    public double offerLimitMax;
    public double selectedLimit;
    public String accNumber;
    public double interestRate;
    public String term;
    public String applicationStatus;
    public String rateType;
    public CardLinking cardLinking;
    public String expiryDate;
    public Dates dates;
    public Metadata @metadata;
    public String apptType;
    public String date;
    public CompletedBy completedBy;
    public SendSMSNotificationReq sendSMSNotificationReq;
    public SendSMSNotificationRes sendSMSNotificationRes;
}

public class Language{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ListOfOutstandingConditions{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class ManualCardLinkingDetails{
    public Object consultantName;
    public String status;
    public String failureCode;
    public String failureDescription;
    public DetailsOfLink detailsOfLink;
    public Metadata @metadata;
}

public class ManualInterAccountTransferDetails{
    public TransferDetails transferDetails;
    public Metadata @metadata;
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

public class MsgHeader{
    @JsonProperty("ContextRsHdr") 
    public ContextRsHdr contextRsHdr;
    @JsonProperty("InteraccountResponseInfo") 
    public InteraccountResponseInfo interaccountResponseInfo;
    public Metadata @metadata;
}

public class MsgRsHdr{
    @JsonProperty("ContextRsHdr") 
    public ContextRsHdr contextRsHdr;
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
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class OccupationIndustry{
    public String value;
    public Metadata @metadata;
}

public class OccupationStatus{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class OfferDetails{
    public String offerId;
    public String offerStatus;
    public OfferDetails offerDetails;
    public String applicationDate;
    public String applicationTime;
    public double totalExposure;
    public double totalSelectedAmount;
    public double totalMonthlyRepayment;
    public double surplusAmount;
    public Metadata @metadata;
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
}

public class Origin{
    public String value;
    public Metadata @metadata;
}

public class OriginatingProcess{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class OriginatingProcessChannel{
    public String originatingChannel;
    public Product product;
    public double existingLimit;
    public OriginatingProcess originatingProcess;
    public Metadata @metadata;
}

public class Personal{
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
    public String homeNumber;
    public String email;
    public String kycStatus;
    public Origin origin;
    public String residentInd;
    public String tempResidentInd;
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

public class Product{
    public Metadata @metadata;
}

public class Province{
    public String name;
    public String value;
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

public class Response{
    public Metadata @metadata;
}

public class RetrieveAccountInfoErrorDetails{
    public Metadata @metadata;
}

public class RetrieveAccountInfoReq{
    public ServiceHeaderDetails serviceHeaderDetails;
    public Accounts accounts;
    public Metadata @metadata;
}

public class RetrieveAccountInfoRes{
    @JsonProperty("AccountResponseInfo") 
    public AccountResponseInfo accountResponseInfo;
    public Status status;
    @JsonProperty("MsgRsHdr") 
    public MsgRsHdr msgRsHdr;
    public Metadata @metadata;
}

public class Root{
    public OriginatingProcessChannel originatingProcessChannel;
    public boolean prodOtherOutstandingConditions;
    public String aeNumber;
    public GetAfforadabilityRes getAfforadabilityRes;
    public boolean outstandingConditions;
    public String sbguid;
    public Object contractAgreement;
    public ListOfOutstandingConditions listOfOutstandingConditions;
    @JsonProperty("EAODfcFulfillmentType") 
    public EAODfcFulfillmentType eAODfcFulfillmentType;
    public String condition1;
    public Object docContentURL;
    public EaoDfcFulfillmentReq eaoDfcFulfillmentReq;
    public String appId;
    public boolean appOutstandingConditions;
    public String flowAction;
    public boolean isHNW;
    public ServiceHeaderDetails serviceHeaderDetails;
    public boolean prodIFAOutstandingConditions;
}

public class SendSMSNotificationReq{
    public ServiceHeaderDetails serviceHeaderDetails;
    public Metadata @metadata;
}

public class SendSMSNotificationRes{
    public Metadata @metadata;
}

public class ServiceHeaderDetails{
    public Metadata @metadata;
    public String callerId;
    public String callerVersion;
    public String bpmProcessName;
    public String processInstanceId;
    public String loggedInUserName;
    public String screenName;
    public String serviceName;
    public String logLevel;
}

public class Status{
    @JsonProperty("AdditionalStatus") 
    public AdditionalStatus additionalStatus;
    public Metadata @metadata;
}

public class SubjectElement{
    public Metadata @metadata;
}

public class Title{
    public String name;
    public Metadata @metadata;
}

public class TransferDetails{
    public TransferFrom transferFrom;
    public TransferTo transferTo;
    public Metadata @metadata;
}

public class TransferFrom{
    public String accountNumber;
    public Metadata @metadata;
}

public class TransferTo{
    public Metadata @metadata;
}

public class VarPortions{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}


