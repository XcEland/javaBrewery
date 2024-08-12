package com.example.cbz_workflowintergration_backend_java.json-se-creditarbitration.java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class AccountExecutiveCenter{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class AccountExecutiveDetails{
    public String name;
    public Metadata @metadata;
}

public class ApplicationDetails{
    public String customerFirstName;
    public String customerSurname;
    public String entityName;
    public String customerSalutation;
    public String applicationNumber;
    public String customerBPID;
    public OtherApplicationDetails otherApplicationDetails;
    public Metadata @metadata;
    public Date appDate;
    public String appStatus;
    public Offer offer;
    public String custType;
    public String debtReview;
    public String kycStatus;
    public AccountExecutiveDetails accountExecutiveDetails;
    public RelatedPartiesSummary relatedPartiesSummary;
    public String bri;
    public CurrentApplicationInformation currentApplicationInformation;
}

public class ApprovalConditions{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class ArbitrationDetails{
    public MotivationDetails motivationDetails;
    public int arbitrationCount;
    public boolean ifFirstArbitrationForOffer;
    public String productId;
    public Metadata @metadata;
}

public class Area{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Attribute{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
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
    public AccountExecutiveCenter accountExecutiveCenter;
    public Metadata @metadata;
}

public class BureauDetail{
    public EntityBureauDetails entityBureauDetails;
    public JudgementDetails judgementDetails;
    public RelatedPartiesBureauDetails relatedPartiesBureauDetails;
    public Metadata @metadata;
}

public class CatchmentRoutingDetails{
    public String rmEmailAddress;
    public String preferredCentre;
    public String originatingCentre;
    public boolean staffIndicator;
    public String bpmTeam;
    public String cemEmailAddress;
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

public class CreditAssessmentDetails{
    public HeaderDetails headerDetails;
    public ApplicationDetails applicationDetails;
    public BranchDetails branchDetails;
    public Notes notes;
    public String rafUniqueKey;
    public Channel channel;
    public String priority;
    public double totCustomerExposure;
    public Documents documents;
    public OuBpId ouBpId;
    public RoutingDetails routingDetails;
    public MotivationDetails motivationDetails;
    public Metadata @metadata;
}

public class CreditDeclineReasons{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class CreditOfficerDetails{
    public String personnelNumber;
    public String emailAddress;
    public String officerType;
    public Metadata @metadata;
}

public class CurrentApplicationInformation{
    public double currentBalance;
    public double currentLimit;
    public double currentInstallment;
    public double currentInterestRate;
    public int currentLoanTerm;
    public Metadata @metadata;
}

public class Customer{
    public String firstName;
    public String surname;
    public String id_passportNumber;
    public IdType idType;
    public String initials;
    public String pep_Status;
    public Metadata @metadata;
}

public class Decision{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
    public String name;
    public String value;
}

public class DeclineReasons{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class DocGUIDs{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class Documents{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class Entity{
    public String entityName;
    public String registrationNumber;
    public String ibtNumber;
    public String businessType;
    public Metadata @metadata;
}

public class EntityBureauDetails{
    public Metadata @metadata;
}

public class FraudReferralReasons{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class HeaderDetails{
    public Customer customer;
    public Entity entity;
    public String bpdid;
    public String applicationNumber;
    public String marketSegment;
    public String accountExecutive;
    public String customerType;
    public String accountNumber;
    public String debtReview;
    public String kycStatus;
    public Metadata @metadata;
    public String bpGuid;
}

public class IdType{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Item{
    public String name;
    public String value;
    public Metadata @metadata;
    public double lowerLimit;
    public double upperLimit;
    public ReferenceRateDescription referenceRateDescription;
    public double marUpDwn;
    public double effectiveRate;
    public double referenceRate;
    public Object idNumber;
    public String noRelatedPartyDataFound;
    public MotivationReasons motivationReasons;
    public String motivationComments;
    public Date motivationDate;
    public String userId;
    public String itemId;
    public ProdType prodType;
    public ProdName prodName;
    public double requestedLimit;
    public double offerLimitMin;
    public double offerLimitMax;
    public double offeredLimit;
    public double selectedLimit;
    public Object bri;
    public Object accNumber;
    public double interestRate;
    public String term;
    public Conditions conditions;
    public Object installment;
    public Object notes;
    public DeclineReasons declineReasons;
    public String creditDecision;
    public Object prodStatus;
    public CreditDeclineReasons creditDeclineReasons;
    public String decisionVisibility;
    public Date limitReviewDate;
    public NcaStatus ncaStatus;
    public JuristicInd juristicInd;
    public Object maxCalculatedLimit;
    public String referralCode;
    public String referralDescription;
    public String source;
    public String bpId;
    public String fullName;
    public String bpdid;
    public String partType;
    public String relationship;
    public String accountRole;
    public String shareHoldingPercentage;
    public String fraudFlag;
    public Object status;
    public NoteInfo noteInfo;
    public Decision decision;
    public ApprovalConditions approvalConditions;
    public ModifyDetails modifyDetails;
    public TierLimits tierLimits;
    public String decisionComment;
    public TempLimit tempLimit;
}

public class JudgementDetails{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class JuristicInd{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class LanguageCode{
    public String code;
    public String description;
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

public class ModifyDetails{
    public Date limitReviewDate;
    public double maxRepaymentAmount;
    public double surplusAmount;
    public String comments;
    @JsonProperty("NCA_Status") 
    public NCAStatus nCA_Status;
    public ProductName productName;
    public ProductCategory productCategory;
    public double requestedLimit;
    public double offeredLimit;
    public JuristicInd juristicInd;
    public double maxCalculatedLimit;
    public String maxTerm;
    public Metadata @metadata;
}

public class MotivationDetails{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
    public MotivationReasons motivationReasons;
    public String motivationComment;
    public String userId;
    public MotivationDocuments motivationDocuments;
    public Object motivationDate;
}

public class MotivationDocuments{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class MotivationReasons{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class NcaStatus{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class NCAStatus2{
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

public class Notes{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class NoteType{
    public String code;
    public String description;
    public Metadata @metadata;
}

public class NotificationDetails{
    public String emailSubject;
    public String emailBody;
    public boolean generateEmailBody;
    public String emailType;
    public Metadata @metadata;
}

public class NotifyCreditOfficerReq{
    public CreditOfficerDetails creditOfficerDetails;
    public NotificationDetails notificationDetails;
    public ApplicationDetails applicationDetails;
    public HeaderDetails headerDetails;
    public Metadata @metadata;
}

public class NotifyCreditOfficerRes{
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
    public ReferralMotivation referralMotivation;
    public DocGUIDs docGUIDs;
    public Metadata @metadata;
}

public class OfferDetails{
    public ArrayList<int> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class OtherApplicationDetails{
    public Attribute attribute;
    public Metadata @metadata;
}

public class OuBpId{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class PreviousUserList{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
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

public class ProductCategory{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ProductName{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Province{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ReferenceRateDescription{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ReferralDetails{
    public String type;
    public String offerId;
    public Date appDate;
    public BranchDetails branchDetails;
    public MarketSegment marketSegment;
    public String rafUniqueKey;
    public boolean fraudReferral;
    public boolean creditReferral;
    public double exposure;
    public OuBpId ouBpId;
    public String lastActionUser;
    public Metadata @metadata;
}

public class ReferralMotivation{
    public ArrayList<Object> selected;
    public ArrayList<String> items;
    public Metadata @metadata;
}

public class ReferralRqRs{
    public ProcessContext processContext;
    public ReferralDetails referralDetails;
    public ArbitrationDetails arbitrationDetails;
    public Metadata @metadata;
}

public class Region{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class RelatedPartiesBureauDetails{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class RelatedPartiesSummary{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Root{
    @JsonProperty("COA_Compliance_PID") 
    public Object cOA_Compliance_PID;
    public String currentTaskId;
    public Object relatedPartyIDNotFound;
    public NotifyCreditOfficerReq notifyCreditOfficerReq;
    public NotifyCreditOfficerRes notifyCreditOfficerRes;
    public boolean isBRCPLimitIncrease;
    public String productName;
    public boolean isCollateralRequired;
    public String mktSegmentResponse;
    public String trackingEvent_assignedDate;
    public ReferralRqRs referralRqRs;
    public CatchmentRoutingDetails catchmentRoutingDetails;
    public String assignedUser;
    public String accountExecEmailAddress;
    public CreditAssessmentDetails creditAssessmentDetails;
    public double totalUnsecuredExposure;
    public String taskAuditOwner;
    public String officerEmailAddress;
    public int taskOwnercounter;
    public SetTrackingEventRq setTrackingEventRq;
    public SetTrackingEventRs setTrackingEventRs;
    public String bpId;
    public String creditOutcomeResponse;
    public String bpGUID;
    public String taskSubject;
    public String originatingProcess_BRCPLimitIncrease;
    public String flowAction;
    public String taskProductName;
    public RelatedPartiesSummary relatedPartiesSummary;
    public Object bureauApiFraudAlert;
    public boolean studentLoanIndicator;
    public Decision decision;
    public int reworkCounter;
    public int retryCount;
    @JsonProperty("COA_Fulfillment_PID") 
    public Object cOA_Fulfillment_PID;
    public Object accountNumber;
    public String processID;
    public String testFlowAction;
    public String originatingCenter;
    public BureauDetail bureauDetail;
    public Object finalTermLoan;
}

public class RoutingDetails{
    public int level;
    public double exposure;
    public String previousUser;
    public Province province;
    public Region region;
    public Area area;
    public String collateralCentre;
    public MarketSegment marketSegment;
    public String bpmTeam;
    public PreviousUserList previousUserList;
    public Metadata @metadata;
}

public class SetTrackingEventRq{
    public String channel_ID;
    public String processName;
    public String instanceID;
    public String offerID;
    public String taskName;
    public String assignedDate;
    public String startUserID;
    public String actionedPerformed;
    public Metadata @metadata;
}

public class SetTrackingEventRs{
    public String status;
    public int eventID;
    public Metadata @metadata;
}

public class TempLimit{
    public String limitIndicator;
    public Object limitStartDate;
    public Object limitEndDate;
    public Metadata @metadata;
}

public class TierLimits{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

