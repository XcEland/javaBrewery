package com.example.cbz_workflowintergration_backend_java.json-fraudrferra2.java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class AdverseReasons{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
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
    public Object residentialStatus;
    public String kycStatus;
    public Object accountExecutiveDetails;
    public String bri;
    public Metadata @metadata;
}

public class ApplicationNotes{
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

public class CustomerDetails{
    public Metadata @metadata;
}

public class CustType{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class DeclineReasons{
    public ArrayList<Object> selected;
    public ArrayList<Object> items;
    public Metadata @metadata;
}

public class Documents{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class FraudAssessmentDetails{
    public ApplicationDetails applicationDetails;
    public BranchDetails branchDetails;
    public String rafUniqueKey;
    public String bpId;
    public String lastAnalyst;
    public String lastTeamLeader;
    public String lastManager;
    public String lastInvestigatingOfficer;
    public Channel channel;
    public String prevFlowAction;
    public String priority;
    public Documents documents;
    public ApplicationNotes applicationNotes;
    public int stepCounter;
    public boolean isApplicationEscalated;
    public String customerStatus;
    public ReferralOutcome referralOutcome;
    public Metadata @metadata;
}

public class FraudReferralReasons{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Item{
    public String itemId;
    public ProdType prodType;
    public ProdName prodName;
    public double offerLimitMin;
    public DeclineReasons declineReasons;
    public String creditStatus;
    public String buttonVisibility;
    public Metadata @metadata;
    public String applicationStatus;
    public String name;
    public String value;
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
    public NoteInfo noteInfo;
}

public class LanguageCode{
    public String code;
    public String description;
    public Metadata @metadata;
}

public class LdapRqUserAttributes{
    public ArrayList<Object> selected;
    public ArrayList<String> items;
    public Metadata @metadata;
}

public class MarketSegment{
    public Metadata @metadata;
    public String name;
    public String value;
}

public class Metadata{
    public String objectID;
    public boolean dirty;
    public boolean invalid;
    public boolean shared;
    public boolean contentObject;
    public String rootVersionContextID;
    public String className;
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

public class Offer{
    public String offerId;
    public OfferDetails offerDetails;
    public String applicationDate;
    public String applicationTime;
    public FraudReferralReasons fraudReferralReasons;
    public double totalExposure;
    public double totalSelectedAmount;
    public double totalMonthlyRepayment;
    public double surplusAmount;
    public Metadata @metadata;
}

public class OfferDetails{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
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

public class Province{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class ReferralAdverseReasons{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class ReferralDecision{
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
    public Metadata @metadata;
}

public class ReferralOutcome{
    public String rafDecision;
    public ReferralDecision referralDecision;
    public AdverseReasons adverseReasons;
    public ReferralAdverseReasons referralAdverseReasons;
    public Metadata @metadata;
}

public class ReferralRqRs{
    public ProcessContext processContext;
    public ReferralDetails referralDetails;
    public Metadata @metadata;
}

public class Region{
    public String name;
    public String value;
    public Metadata @metadata;
}

public class Root{
    public LdapRqUserAttributes ldapRqUserAttributes;
    public String test;
    public Object logger;
    public String branchOfficerId;
    public FraudAssessmentDetails fraudAssessmentDetails;
    public String custDate;
    public int processSLA;
    public String featureTeam;
    public String msgGroupReference;
    public UsersSearchCriteria usersSearchCriteria;
    public ReferralRqRs referralRqRs;
    public String flowAction;
    public String correlationId;
    public String componentName;
    public CustomerDetails customerDetails;
    @JsonProperty("SupportTeam") 
    public String supportTeam;
}

public class UsersSearchCriteria{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}


