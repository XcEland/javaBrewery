package com.example.cbz_workflowintergration_backend_java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Affordability{
    public double expenditureAmount;
    public double grossIncomeAmount;
    public String expenditureFrequency;
    public String incomeFrequency;
    public Metadata @metadata;
}

public class BceThirdPartyAOProcessRq{
    public ProcessContext processContext;
    public HeaderDetails headerDetails;
    public CompanyDetails companyDetails;
    public QuoteDetails quoteDetails;
    public Metadata @metadata;
}

public class BlAOThirdPartyMainProcessDetails{
    public String processStateCode;
    public String processStateDescription;
    public Date processEndDateAndTime;
    public String bankGeneratedReferenceNumber;
    public String productID;
    public double requestedLoanAmount;
    public boolean isStoreToDB;
    public VerifyCustomerRq verifyCustomerRq;
    public VerifyCustomerRs verifyCustomerRs;
    public OriginateCustomerRq originateCustomerRq;
    public OriginateCustomerRs originateCustomerRs;
    public CreateQuoteRq createQuoteRq;
    public CreateQuoteRs createQuoteRs;
    public StoreToDataBaseRs storeToDataBaseRs;
    public Metadata @metadata;
}

public class BusinessCompliance{
    public boolean businessWoundDissolvedLiquid;
    public boolean businessUnableToPay;
    public boolean businessUnderDebtReview;
    public boolean businessUnderRescue;
    public Metadata @metadata;
}

public class BusinessConsents{
    public boolean businessIdentityFraudCheck;
    public boolean businessCreditBureauCheck;
    public Metadata @metadata;
}

public class BusinessEntityDetails{
    public String entityBpId;
    public String entityName;
    public String entityRegistrationNumber;
    public String entityType;
    public String tradingHistory;
    public String entitySector;
    public String businessDescription;
    public String businessRegion;
    public String businessEmail;
    public String noOfDirectors;
    public Metadata @metadata;
}

public class ClientApp{
    public String org;
    public String name;
    public String version;
    public String srcSystemXSB;
    public Metadata @metadata;
}

public class CompanyDetails{
    public Object directorDetails;
    public BusinessEntityDetails businessEntityDetails;
    public Consents consents;
    public Compliance compliance;
    public Metadata @metadata;
}

public class Compliance{
    public BusinessCompliance businessCompliance;
    public PersonalCompliance personalCompliance;
    public Metadata @metadata;
}

public class Consents{
    public BusinessConsents businessConsents;
    public PersonalConsents personalConsents;
    public Metadata @metadata;
}

public class CreateBusinessMiniBPRs{
    public boolean isBPCreated;
    public String bpID;
    public String responseStatus;
    public Metadata @metadata;
}

public class CreateQuoteRq{
    public ProcessContext processContext;
    public HeaderDetails headerDetails;
    public CompanyDetails companyDetails;
    public QuoteDetails quoteDetails;
    public Metadata @metadata;
}

public class CreateQuoteRs{
    public CreateQuoteServiceResponse createQuoteServiceResponse;
    public Metadata @metadata;
}

public class CreateQuoteServiceResponse{
    public HeaderDetails headerDetails;
    public Quotes quotes;
    public Metadata @metadata;
}

public class CreateRelatedPartiesMiniBPRs{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class DirectorDetails{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class FindTargetBPBusinessRs{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class FindTargetBPRelatedPartiesRs{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class HeaderDetails{
    public String requestCorrelation;
    public String digitalId;
    public Object respondToAddress;
    public Object accessToken;
    public boolean isSynchronous;
    public String channelId;
    public String requestTraceId;
    public Metadata @metadata;
    public String bankGeneratedReferenceNumber;
    public String businessStatusCode;
    public String businessStatusDescription;
    public Date requestTimeStamp;
}

public class HeaderDetailsJSON{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class Item{
    public Object objectId;
    public Object objectType;
    public Metadata @metadata;
    public Object accountProductId;
    public String productId;
    public Object productDescription;
    public double requestedLoanAmount;
    public String purposeOfLoan;
    public Object accountSystemId;
    public Object accountNumber;
    public Object loggedInUser;
    public boolean mainApplicant;
    public Object digitalId;
    public String bpId;
    public Object grossMonthlyIncome;
    public Object totalMonthlyExpenses;
    public double assets;
    public double liabilities;
    public PipDetails pipDetails;
    public String firstName;
    public String lastName;
    public String identificationNumber;
    public String identificationType;
    public String cellphoneNumber;
    public String emailAddress;
    public String identificationCountryCode;
    public String preferredCommunicationMethod;
    public Object status;
    public boolean authorizedToApply;
    public boolean isBPFound;
    public String multiBPFlag;
    public String bpType;
    public String idNumber;
    public String idType;
    public boolean isBPCreated;
    public String bpID;
    public String responseStatus;
}

public class MapDirectorDetailsBPIDs{
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

public class ObjectKeys{
    public Object primaryId;
    public Object primaryType;
    public ObjectRef objectRef;
    public Metadata @metadata;
}

public class ObjectRef{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class OriginateCustomerRq{
    public ProcessContext processContext;
    public HeaderDetails headerDetails;
    public DirectorDetails directorDetails;
    public BusinessEntityDetails businessEntityDetails;
    public boolean isCreateBusinessBP;
    public boolean isCreateRelatedPartiesBP;
    public Metadata @metadata;
}

public class OriginateCustomerRs{
    public CreateBusinessMiniBPRs createBusinessMiniBPRs;
    public CreateRelatedPartiesMiniBPRs createRelatedPartiesMiniBPRs;
    public boolean isCreateBusinessMiniBPSuccess;
    public boolean isCreateRelatedPartiesMiniBPSuccess;
    public Metadata @metadata;
}

public class PersonalCompliance{
    public boolean originatorUsageConsent;
    public Metadata @metadata;
}

public class PersonalConsents{
    public boolean originatorIdentityFraudCheck;
    public boolean originatorCreditBureauCheck;
    public Metadata @metadata;
}

public class PipDetails{
    public boolean publicOfficial;
    public PublicOfficialRelatedDetails publicOfficialRelatedDetails;
    public Metadata @metadata;
}

public class ProcessContext{
    public String msgGroupReference;
    public Object clientTerminalSeqNum;
    public Object partyId;
    public String bpdName;
    public NetworkTrnData networkTrnData;
    public ClientApp clientApp;
    public ObjectKeys objectKeys;
    public Metadata @metadata;
}

public class ProductDetails{
    public ArrayList<Object> selected;
    public ArrayList<Item> items;
    public Metadata @metadata;
}

public class PublicOfficialRelatedDetails{
    public boolean relatedToPublicOfficial;
    public Object name;
    public Object surname;
    public Object typeOfRelationship;
    public Metadata @metadata;
}

public class QuoteDetails{
    public ProductDetails productDetails;
    public Affordability affordability;
    public String quoteReferenceNumber;
    public Metadata @metadata;
}

public class Quotes{
    public String quoteStatus;
    public Metadata @metadata;
}

public class Root{
    public BlAOThirdPartyMainProcessDetails blAOThirdPartyMainProcessDetails;
    public BceThirdPartyAOProcessRq bceThirdPartyAOProcessRq;
    public ServiceResponse serviceResponse;
    public MapDirectorDetailsBPIDs mapDirectorDetailsBPIDs;
}

public class ServiceResponse{
    public String statusCode;
    public String statusDescription;
    public Metadata @metadata;
}

public class StoreToDataBaseRs{
    public boolean isStoreToDatabaseSuccess;
    public String responseInJSONString;
    public String response;
    public HeaderDetailsJSON headerDetailsJSON;
    public String errorBO;
    public String businessFunction;
    public String startTime;
    public String endTime;
    public Metadata @metadata;
}

public class VerifyCustomerRq{
    public ProcessContext processContext;
    public HeaderDetails headerDetails;
    public DirectorDetails directorDetails;
    public BusinessEntityDetails businessEntityDetails;
    public Metadata @metadata;
}

public class VerifyCustomerRs{
    public FindTargetBPBusinessRs findTargetBPBusinessRs;
    public FindTargetBPRelatedPartiesRs findTargetBPRelatedPartiesRs;
    public Object complianceCheckBusinessRs;
    public Object complianceCheckRelatedPartiesRs;
    public Object dhaValidationRs;
    public boolean isVerifyBusinessSuccess;
    public boolean isVerifyRelatedPartiedSuccess;
    public boolean isCreateBusinessBP;
    public boolean isCreateRelatedPartiesBP;
    public boolean isFindOpenApplications;
    public Metadata @metadata;
}


