package com.example.cbz_workflowintergration_backend_java.creditscoring3.java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Address{
    public String line1;
    public String line2;
    public String suburb;
    public String city;
    public String postalCode;
    public Metadata @metadata;
}

public class ApplicationData{
    public General general;
    public EnterpriseCustomer enterpriseCustomer;
    public PrincipalPersonal principalPersonal;
    public PrincipalConsent principalConsent;
    public PrincipalAffordability principalAffordability;
    public Product product;
    @JsonProperty("Collateral") 
    public Collateral collateral;
    public boolean reScoreIndicator;
    public Metadata @metadata;
}

public class AssetDecision{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Attachments{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Branch{
    public String name;
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

public class Center{
    public String name;
    public Metadata @metadata;
}

public class Collateral{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class CreditScoringAdditonalReq{
    public General general;
    public EntityDecisons entityDecisons;
    public GeneralProductDecison generalProductDecison;
    public GeneralPrimaryDecision generalPrimaryDecision;
    public AssetDecision assetDecision;
    public EntityFraudDecision entityFraudDecision;
    public PrincipleFraudDecision principleFraudDecision;
    public String skipScorecard;
    public ExperienceReport experienceReport;
    public Optimizer optimizer;
    public Metadata @metadata;
}

public class DocumentIDList{
    public ArrayList<Object> selected;
    public ArrayList<String> items;
    public Metadata @metadata;
}

public class DocumentsFilenetRes{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class EnterpriseAffordability{
    public double annualTurnover;
    public double annualExpenses;
    public double currentLiabilities;
    public double grossAssets;
    public Metadata @metadata;
}

public class EnterpriseConsents{
    public String underDebtReview;
    public String underSequestration;
    public String underAdminOrder;
    public String extBureauConsent;
    public String businessRescue;
    public String insolvement;
    public Metadata @metadata;
}

public class EnterpriseCustomer{
    public EnterpriseDetails enterpriseDetails;
    public EnterpriseConsents enterpriseConsents;
    public EnterpriseAffordability enterpriseAffordability;
    public Metadata @metadata;
}

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

public class EntityDecisons{
    public ProductDecision productDecision;
    public PreScreenDecision preScreenDecision;
    public Metadata @metadata;
}

public class EntityFraudDecision{
    public String decision;
    public String customerNumber;
    public String rollUp;
    public Metadata @metadata;
}

public class ExperienceReport{
    @JsonProperty("RespCode") 
    public int respCode;
    @JsonProperty("WorstCurr") 
    public String worstCurr;
    @JsonProperty("WorstEver") 
    public String worstEver;
    @JsonProperty("Worst6M") 
    public String worst6M;
    @JsonProperty("Worst24M") 
    public String worst24M;
    public Metadata @metadata;
}

public class FraudCheckBPMData{
    public String alfaCreditRefNo;
    public String applicationId;
    public String bpGuid;
    public String partyId;
    public String msgReference;
    public boolean fraudRefIndicator;
    public boolean credRefIndicator;
    public BranchDetails branchDetails;
    public String orginatingSystem;
    public Metadata @metadata;
}

public class General{
    public double aoRef;
    public String credRefNo;
    public String appDate;
    public String appTime;
    public String userId;
    public int callerCode;
    public String callerType;
    public String verNo;
    public int appProcess;
    public String partialApp;
    public int noOfApplicants;
    public UseCustInfo useCustInfo;
    public String ncaInActInd;
    public String ncaJuristicInd;
    public Metadata @metadata;
    public String returnCode;
    public String returnCodeType;
    @JsonProperty("PcRefNumber") 
    public String pcRefNumber;
    public String applicationProcess;
    public String totalSecureExposure;
    public String totalUnsecureExposure;
    public String enterpriseRiskIndicator;
    public String enterpriseRiskLimit;
    public String applicationRiskIndicator;
    public String probabilityOfDefault;
}

public class GeneralCaf{
    public String apMarketGrpCode;
    public String appType;
    public String agreementType;
    public String dicCatg;
    public double requestedLimit;
    public double initialFees;
    public double monthlySerFee;
    public Metadata @metadata;
}

public class GeneralPrimaryDecision{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class GeneralProductDecison{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class HeaderDetailsJSON{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class IdInfo{
    public String idType;
    public String idNo;
    public String customerNo;
    public Metadata @metadata;
}

public class Item{
    public String description;
    public String attachmentType;
    public String fileName;
    public String identifier;
    public Metadata @metadata;
    public String decisionCode;
    public String customerNumber;
    public String adverseCode1Product1;
    public Object adverseCode2Product1;
    public String decision;
    public String rollUp;
    public String author;
    public String date;
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
    public String customerType;
    public String title;
    public String initial;
    public String firstName;
    public String surname;
    public String dateOfBirth;
    public String gender;
    public int cutsomerAge;
    public String marketSegment;
    public Address address;
    public String citizenCode;
    public TelephoneHome telephoneHome;
    public TelephoneBusiness telephoneBusiness;
    public TelephoneCell telephoneCell;
    public String email;
    public String nonResident;
    public IdInfo idInfo;
    public String addResPOCod;
    public String underDebtReview;
    public String underSequestration;
    public String underAdminOrder;
    public String extBureauConsent;
    public String insolvent;
    public double grossIncome;
    public double otherMonthlyIncome;
    public double netIncome;
    public double totalIncome;
    public double totalMonthlyExpense;
    @JsonProperty("GeneralCaf") 
    public GeneralCaf generalCaf;
    @JsonProperty("ProductCaf") 
    public ProductCaf productCaf;
    public String collateralHeld;
    public String astClass;
    public String collateralOwnership;
    public String collateralType;
    public String serialNo;
}

public class Logger{
    public String initializedLogger;
    public String applicationMode;
    public String logGuid;
    public String bpmFeatureTeam;
    public String serviceType;
    public String callerAcronym;
    public String upn;
    public String empNo;
    public String consumerBpmApplication;
    public String callerProcessInstanceId;
    public Object location;
    public String message;
    public String payload;
    public String response;
    public HeaderDetailsJSON headerDetailsJSON;
    public String userId;
    public String businessFunction;
    public String startTime;
    public String endTime;
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
    public String key;
    public int version;
}

public class Notes{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class NotesFromAlfa{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Optimizer{
    public String headRoom;
    public String optimizerLimit;
    public Metadata @metadata;
}

public class PreScreenDecision{
    public String decisionCode;
    public String customerNumber;
    public String adverseCode1Product1;
    public String rollDecision;
    public Metadata @metadata;
}

public class PrincipalAffordability{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class PrincipalConsent{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class PrincipalPersonal{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class PrincipleFraudDecision{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Product{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class ProductCaf{
    public double loanTerm;
    public int instalNo;
    public double extr1Amount;
    public double extr2Amount;
    public String extr1Desc;
    public String extr2Desc;
    public String goodsDesc;
    public int goodsAge;
    public double resAmount;
    public String channelIndicator;
    public String goodsTypeCode;
    public double digstPriceAmnt;
    public String newUsed;
    public double depAmnt;
    public double cashValueAmnt;
    public double equityOfGoods;
    public double interestP;
    public int itemAge;
    public double totalExpsreAmnt;
    public double dealerNo;
    public double installSettlement;
    public double cashAssetPrice;
    public int residualP;
    public double deliveryInstFuel;
    public double mwiWarPrem;
    public double paintechPrem;
    public double mmcode;
    public double vehDigestExtr;
    public double setExpsreAmnt;
    public String balloonPercent;
    public double cashPriceAmnt;
    public Metadata @metadata;
}

public class ProductDecision{
    public String decisionCode;
    public String customerNumber;
    public String adverseCode1Product1;
    public String adverseCode2Product1;
    public String adverseCode3Product1;
    public String adverseCode4Product1;
    public String adverseCode5Product1;
    public String adverseCode6Product1;
    public String adverseCode7Product1;
    public String adverseCode8Product1;
    public String adverseCode9Product1;
    public String adverseCode10Product1;
    public String verificationCode;
    public String rollDecision;
    public Metadata @metadata;
}

public class Province{
    public String name;
    public Metadata @metadata;
}

public class Region{
    public String name;
    public Metadata @metadata;
}

public class RequestedDocumentsRes{
    public String agreementNumber;
    public Attachments attachments;
    public String statusCode;
    public String statusDescription;
    public String realdocReference;
    @JsonProperty("Notes") 
    public Notes notes;
    public Metadata @metadata;
}

public class RescoreDocsList{
    public Attachments attachments;
    public Metadata @metadata;
}

public class Root{
    public String currentUser;
    public Attachments attachments;
    public DocumentsFilenetRes documentsFilenetRes;
    public String trackingUser;
    public String alfaErrorCode;
    public RescoreDocsList rescoreDocsList;
    @JsonProperty("VAFCreditScoringRq") 
    public VAFCreditScoringRq vAFCreditScoringRq;
    public Logger logger;
    public String componentName;
    public NotesFromAlfa notesFromAlfa;
    public RequestedDocumentsRes requestedDocumentsRes;
    public String taskId;
}

public class TelephoneBusiness{
    public String telephoneCode;
    public String telephoneNumber;
    public Metadata @metadata;
}

public class TelephoneCell{
    public String telephoneCode;
    public String telephoneNumber;
    public Metadata @metadata;
}

public class TelephoneHome{
    public String telephoneCode;
    public String telephoneNumber;
    public Metadata @metadata;
}

public class UseCustInfo{
    public ArrayList<Object> selected;
    public ArrayList<String> items;
    public Metadata @metadata;
}

public class VAFCreditScoringRq{
    @JsonProperty("VAFCreditScoringRq") 
    public VAFCreditScoringRq vAFCreditScoringRq;
    public CreditScoringAdditonalReq creditScoringAdditonalReq;
    public Metadata @metadata;
    public ApplicationData applicationData;
    public FraudCheckBPMData fraudCheckBPMData;
    @JsonProperty("Notes") 
    public Notes notes;
    public DocumentIDList documentIDList;
}

