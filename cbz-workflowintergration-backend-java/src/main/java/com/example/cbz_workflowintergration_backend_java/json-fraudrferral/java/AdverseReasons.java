package com.example.cbz_workflowintergration_backend_java.json-fraudrferral.java;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Address{
    @JsonProperty("line1") 
    public String getLine1() { 
		 return this.line1; } 
    public void setLine1(String line1) { 
		 this.line1 = line1; } 
    String line1;
    @JsonProperty("line2") 
    public String getLine2() { 
		 return this.line2; } 
    public void setLine2(String line2) { 
		 this.line2 = line2; } 
    String line2;
    @JsonProperty("suburb") 
    public String getSuburb() { 
		 return this.suburb; } 
    public void setSuburb(String suburb) { 
		 this.suburb = suburb; } 
    String suburb;
    @JsonProperty("city") 
    public String getCity() { 
		 return this.city; } 
    public void setCity(String city) { 
		 this.city = city; } 
    String city;
    @JsonProperty("postalCode") 
    public String getPostalCode() { 
		 return this.postalCode; } 
    public void setPostalCode(String postalCode) { 
		 this.postalCode = postalCode; } 
    String postalCode;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class AdverseReasons{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ApplicationData{
    @JsonProperty("general") 
    public General getGeneral() { 
		 return this.general; } 
    public void setGeneral(General general) { 
		 this.general = general; } 
    General general;
    @JsonProperty("enterpriseCustomer") 
    public EnterpriseCustomer getEnterpriseCustomer() { 
		 return this.enterpriseCustomer; } 
    public void setEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) { 
		 this.enterpriseCustomer = enterpriseCustomer; } 
    EnterpriseCustomer enterpriseCustomer;
    @JsonProperty("principalPersonal") 
    public PrincipalPersonal getPrincipalPersonal() { 
		 return this.principalPersonal; } 
    public void setPrincipalPersonal(PrincipalPersonal principalPersonal) { 
		 this.principalPersonal = principalPersonal; } 
    PrincipalPersonal principalPersonal;
    @JsonProperty("principalConsent") 
    public PrincipalConsent getPrincipalConsent() { 
		 return this.principalConsent; } 
    public void setPrincipalConsent(PrincipalConsent principalConsent) { 
		 this.principalConsent = principalConsent; } 
    PrincipalConsent principalConsent;
    @JsonProperty("principalAffordability") 
    public PrincipalAffordability getPrincipalAffordability() { 
		 return this.principalAffordability; } 
    public void setPrincipalAffordability(PrincipalAffordability principalAffordability) { 
		 this.principalAffordability = principalAffordability; } 
    PrincipalAffordability principalAffordability;
    @JsonProperty("product") 
    public Product getProduct() { 
		 return this.product; } 
    public void setProduct(Product product) { 
		 this.product = product; } 
    Product product;
    @JsonProperty("Collateral") 
    public Collateral getCollateral() { 
		 return this.collateral; } 
    public void setCollateral(Collateral collateral) { 
		 this.collateral = collateral; } 
    Collateral collateral;
    @JsonProperty("reScoreIndicator") 
    public boolean getReScoreIndicator() { 
		 return this.reScoreIndicator; } 
    public void setReScoreIndicator(boolean reScoreIndicator) { 
		 this.reScoreIndicator = reScoreIndicator; } 
    boolean reScoreIndicator;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ApplicationData3{
    @JsonProperty("Generals") 
    public Generals getGenerals() { 
		 return this.generals; } 
    public void setGenerals(Generals generals) { 
		 this.generals = generals; } 
    Generals generals;
    @JsonProperty("Decisions") 
    public Decisions getDecisions() { 
		 return this.decisions; } 
    public void setDecisions(Decisions decisions) { 
		 this.decisions = decisions; } 
    Decisions decisions;
    @JsonProperty("Enterprise") 
    public Enterprise getEnterprise() { 
		 return this.enterprise; } 
    public void setEnterprise(Enterprise enterprise) { 
		 this.enterprise = enterprise; } 
    Enterprise enterprise;
    @JsonProperty("ENTDecisions") 
    public ENTDecisions getENTDecisions() { 
		 return this.eNTDecisions; } 
    public void setENTDecisions(ENTDecisions eNTDecisions) { 
		 this.eNTDecisions = eNTDecisions; } 
    ENTDecisions eNTDecisions;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Attachments{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Branch{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class BranchDetails{
    @JsonProperty("officerId") 
    public String getOfficerId() { 
		 return this.officerId; } 
    public void setOfficerId(String officerId) { 
		 this.officerId = officerId; } 
    String officerId;
    @JsonProperty("officerName") 
    public String getOfficerName() { 
		 return this.officerName; } 
    public void setOfficerName(String officerName) { 
		 this.officerName = officerName; } 
    String officerName;
    @JsonProperty("branch") 
    public Branch getBranch() { 
		 return this.branch; } 
    public void setBranch(Branch branch) { 
		 this.branch = branch; } 
    Branch branch;
    @JsonProperty("center") 
    public Center getCenter() { 
		 return this.center; } 
    public void setCenter(Center center) { 
		 this.center = center; } 
    Center center;
    @JsonProperty("province") 
    public Province getProvince() { 
		 return this.province; } 
    public void setProvince(Province province) { 
		 this.province = province; } 
    Province province;
    @JsonProperty("region") 
    public Region getRegion() { 
		 return this.region; } 
    public void setRegion(Region region) { 
		 this.region = region; } 
    Region region;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Center{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Collateral{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class CustNo{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<String> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<String> items) { 
		 this.items = items; } 
    ArrayList<String> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Customer{
    @JsonProperty("DataSourceCallStatus") 
    public DataSourceCallStatus getDataSourceCallStatus() { 
		 return this.dataSourceCallStatus; } 
    public void setDataSourceCallStatus(DataSourceCallStatus dataSourceCallStatus) { 
		 this.dataSourceCallStatus = dataSourceCallStatus; } 
    DataSourceCallStatus dataSourceCallStatus;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class DataSourceCallStatus{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Decisions{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class DocumentIDList{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Object> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Object> items) { 
		 this.items = items; } 
    ArrayList<Object> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Documents{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ENTDecisions{
    @JsonProperty("ProductDecision") 
    public ProductDecision getProductDecision() { 
		 return this.productDecision; } 
    public void setProductDecision(ProductDecision productDecision) { 
		 this.productDecision = productDecision; } 
    ProductDecision productDecision;
    @JsonProperty("PreScreenDecision") 
    public PreScreenDecision getPreScreenDecision() { 
		 return this.preScreenDecision; } 
    public void setPreScreenDecision(PreScreenDecision preScreenDecision) { 
		 this.preScreenDecision = preScreenDecision; } 
    PreScreenDecision preScreenDecision;
    @JsonProperty("FraudDecision") 
    public FraudDecision getFraudDecision() { 
		 return this.fraudDecision; } 
    public void setFraudDecision(FraudDecision fraudDecision) { 
		 this.fraudDecision = fraudDecision; } 
    FraudDecision fraudDecision;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Enterprise{
    @JsonProperty("CustNo") 
    public String getCustNo() { 
		 return this.custNo; } 
    public void setCustNo(String custNo) { 
		 this.custNo = custNo; } 
    String custNo;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class EnterpriseAffordability{
    @JsonProperty("annualTurnover") 
    public double getAnnualTurnover() { 
		 return this.annualTurnover; } 
    public void setAnnualTurnover(double annualTurnover) { 
		 this.annualTurnover = annualTurnover; } 
    double annualTurnover;
    @JsonProperty("annualExpenses") 
    public double getAnnualExpenses() { 
		 return this.annualExpenses; } 
    public void setAnnualExpenses(double annualExpenses) { 
		 this.annualExpenses = annualExpenses; } 
    double annualExpenses;
    @JsonProperty("currentLiabilities") 
    public double getCurrentLiabilities() { 
		 return this.currentLiabilities; } 
    public void setCurrentLiabilities(double currentLiabilities) { 
		 this.currentLiabilities = currentLiabilities; } 
    double currentLiabilities;
    @JsonProperty("grossAssets") 
    public double getGrossAssets() { 
		 return this.grossAssets; } 
    public void setGrossAssets(double grossAssets) { 
		 this.grossAssets = grossAssets; } 
    double grossAssets;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class EnterpriseConsents{
    @JsonProperty("underDebtReview") 
    public String getUnderDebtReview() { 
		 return this.underDebtReview; } 
    public void setUnderDebtReview(String underDebtReview) { 
		 this.underDebtReview = underDebtReview; } 
    String underDebtReview;
    @JsonProperty("underSequestration") 
    public String getUnderSequestration() { 
		 return this.underSequestration; } 
    public void setUnderSequestration(String underSequestration) { 
		 this.underSequestration = underSequestration; } 
    String underSequestration;
    @JsonProperty("underAdminOrder") 
    public String getUnderAdminOrder() { 
		 return this.underAdminOrder; } 
    public void setUnderAdminOrder(String underAdminOrder) { 
		 this.underAdminOrder = underAdminOrder; } 
    String underAdminOrder;
    @JsonProperty("extBureauConsent") 
    public String getExtBureauConsent() { 
		 return this.extBureauConsent; } 
    public void setExtBureauConsent(String extBureauConsent) { 
		 this.extBureauConsent = extBureauConsent; } 
    String extBureauConsent;
    @JsonProperty("businessRescue") 
    public String getBusinessRescue() { 
		 return this.businessRescue; } 
    public void setBusinessRescue(String businessRescue) { 
		 this.businessRescue = businessRescue; } 
    String businessRescue;
    @JsonProperty("insolvement") 
    public String getInsolvement() { 
		 return this.insolvement; } 
    public void setInsolvement(String insolvement) { 
		 this.insolvement = insolvement; } 
    String insolvement;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class EnterpriseCustomer{
    @JsonProperty("enterpriseDetails") 
    public EnterpriseDetails getEnterpriseDetails() { 
		 return this.enterpriseDetails; } 
    public void setEnterpriseDetails(EnterpriseDetails enterpriseDetails) { 
		 this.enterpriseDetails = enterpriseDetails; } 
    EnterpriseDetails enterpriseDetails;
    @JsonProperty("enterpriseConsents") 
    public EnterpriseConsents getEnterpriseConsents() { 
		 return this.enterpriseConsents; } 
    public void setEnterpriseConsents(EnterpriseConsents enterpriseConsents) { 
		 this.enterpriseConsents = enterpriseConsents; } 
    EnterpriseConsents enterpriseConsents;
    @JsonProperty("enterpriseAffordability") 
    public EnterpriseAffordability getEnterpriseAffordability() { 
		 return this.enterpriseAffordability; } 
    public void setEnterpriseAffordability(EnterpriseAffordability enterpriseAffordability) { 
		 this.enterpriseAffordability = enterpriseAffordability; } 
    EnterpriseAffordability enterpriseAffordability;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class EnterpriseDetails{
    @JsonProperty("entType") 
    public String getEntType() { 
		 return this.entType; } 
    public void setEntType(String entType) { 
		 this.entType = entType; } 
    String entType;
    @JsonProperty("enterpriseType") 
    public String getEnterpriseType() { 
		 return this.enterpriseType; } 
    public void setEnterpriseType(String enterpriseType) { 
		 this.enterpriseType = enterpriseType; } 
    String enterpriseType;
    @JsonProperty("organizationName") 
    public String getOrganizationName() { 
		 return this.organizationName; } 
    public void setOrganizationName(String organizationName) { 
		 this.organizationName = organizationName; } 
    String organizationName;
    @JsonProperty("industryCode") 
    public String getIndustryCode() { 
		 return this.industryCode; } 
    public void setIndustryCode(String industryCode) { 
		 this.industryCode = industryCode; } 
    String industryCode;
    @JsonProperty("tradingName") 
    public String getTradingName() { 
		 return this.tradingName; } 
    public void setTradingName(String tradingName) { 
		 this.tradingName = tradingName; } 
    String tradingName;
    @JsonProperty("registrationNumber") 
    public String getRegistrationNumber() { 
		 return this.registrationNumber; } 
    public void setRegistrationNumber(String registrationNumber) { 
		 this.registrationNumber = registrationNumber; } 
    String registrationNumber;
    @JsonProperty("registrationDate") 
    public String getRegistrationDate() { 
		 return this.registrationDate; } 
    public void setRegistrationDate(String registrationDate) { 
		 this.registrationDate = registrationDate; } 
    String registrationDate;
    @JsonProperty("businessType") 
    public String getBusinessType() { 
		 return this.businessType; } 
    public void setBusinessType(String businessType) { 
		 this.businessType = businessType; } 
    String businessType;
    @JsonProperty("ageOfBusiness") 
    public String getAgeOfBusiness() { 
		 return this.ageOfBusiness; } 
    public void setAgeOfBusiness(String ageOfBusiness) { 
		 this.ageOfBusiness = ageOfBusiness; } 
    String ageOfBusiness;
    @JsonProperty("numberOfEmployees") 
    public String getNumberOfEmployees() { 
		 return this.numberOfEmployees; } 
    public void setNumberOfEmployees(String numberOfEmployees) { 
		 this.numberOfEmployees = numberOfEmployees; } 
    String numberOfEmployees;
    @JsonProperty("numberOfShareholders") 
    public String getNumberOfShareholders() { 
		 return this.numberOfShareholders; } 
    public void setNumberOfShareholders(String numberOfShareholders) { 
		 this.numberOfShareholders = numberOfShareholders; } 
    String numberOfShareholders;
    @JsonProperty("numberOfEntities") 
    public String getNumberOfEntities() { 
		 return this.numberOfEntities; } 
    public void setNumberOfEntities(String numberOfEntities) { 
		 this.numberOfEntities = numberOfEntities; } 
    String numberOfEntities;
    @JsonProperty("marketSegment") 
    public String getMarketSegment() { 
		 return this.marketSegment; } 
    public void setMarketSegment(String marketSegment) { 
		 this.marketSegment = marketSegment; } 
    String marketSegment;
    @JsonProperty("residenceIndicator") 
    public String getResidenceIndicator() { 
		 return this.residenceIndicator; } 
    public void setResidenceIndicator(String residenceIndicator) { 
		 this.residenceIndicator = residenceIndicator; } 
    String residenceIndicator;
    @JsonProperty("BEE_Code") 
    public String getBEE_Code() { 
		 return this.bEE_Code; } 
    public void setBEE_Code(String bEE_Code) { 
		 this.bEE_Code = bEE_Code; } 
    String bEE_Code;
    @JsonProperty("physicalAddress") 
    public String getPhysicalAddress() { 
		 return this.physicalAddress; } 
    public void setPhysicalAddress(String physicalAddress) { 
		 this.physicalAddress = physicalAddress; } 
    String physicalAddress;
    @JsonProperty("tradingAddressLine") 
    public String getTradingAddressLine() { 
		 return this.tradingAddressLine; } 
    public void setTradingAddressLine(String tradingAddressLine) { 
		 this.tradingAddressLine = tradingAddressLine; } 
    String tradingAddressLine;
    @JsonProperty("telBusinessCode") 
    public String getTelBusinessCode() { 
		 return this.telBusinessCode; } 
    public void setTelBusinessCode(String telBusinessCode) { 
		 this.telBusinessCode = telBusinessCode; } 
    String telBusinessCode;
    @JsonProperty("telBusinessNum") 
    public String getTelBusinessNum() { 
		 return this.telBusinessNum; } 
    public void setTelBusinessNum(String telBusinessNum) { 
		 this.telBusinessNum = telBusinessNum; } 
    String telBusinessNum;
    @JsonProperty("telCellCode") 
    public String getTelCellCode() { 
		 return this.telCellCode; } 
    public void setTelCellCode(String telCellCode) { 
		 this.telCellCode = telCellCode; } 
    String telCellCode;
    @JsonProperty("telCellNum") 
    public String getTelCellNum() { 
		 return this.telCellNum; } 
    public void setTelCellNum(String telCellNum) { 
		 this.telCellNum = telCellNum; } 
    String telCellNum;
    @JsonProperty("physicalPostalCode") 
    public String getPhysicalPostalCode() { 
		 return this.physicalPostalCode; } 
    public void setPhysicalPostalCode(String physicalPostalCode) { 
		 this.physicalPostalCode = physicalPostalCode; } 
    String physicalPostalCode;
    @JsonProperty("tradingPostalCode") 
    public String getTradingPostalCode() { 
		 return this.tradingPostalCode; } 
    public void setTradingPostalCode(String tradingPostalCode) { 
		 this.tradingPostalCode = tradingPostalCode; } 
    String tradingPostalCode;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class FE{
    @JsonProperty("GEN") 
    public GEN getGEN() { 
		 return this.gEN; } 
    public void setGEN(GEN gEN) { 
		 this.gEN = gEN; } 
    GEN gEN;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class FIN{
    @JsonProperty("TotSecExpos") 
    public String getTotSecExpos() { 
		 return this.totSecExpos; } 
    public void setTotSecExpos(String totSecExpos) { 
		 this.totSecExpos = totSecExpos; } 
    String totSecExpos;
    @JsonProperty("TotUnsecExpos") 
    public String getTotUnsecExpos() { 
		 return this.totUnsecExpos; } 
    public void setTotUnsecExpos(String totUnsecExpos) { 
		 this.totUnsecExpos = totUnsecExpos; } 
    String totUnsecExpos;
    @JsonProperty("EntRiskInd") 
    public String getEntRiskInd() { 
		 return this.entRiskInd; } 
    public void setEntRiskInd(String entRiskInd) { 
		 this.entRiskInd = entRiskInd; } 
    String entRiskInd;
    @JsonProperty("EntRiskLimit") 
    public String getEntRiskLimit() { 
		 return this.entRiskLimit; } 
    public void setEntRiskLimit(String entRiskLimit) { 
		 this.entRiskLimit = entRiskLimit; } 
    String entRiskLimit;
    @JsonProperty("FUT") 
    public FUT getFUT() { 
		 return this.fUT; } 
    public void setFUT(FUT fUT) { 
		 this.fUT = fUT; } 
    FUT fUT;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
    @JsonProperty("DecisionCod") 
    public String getDecisionCod() { 
		 return this.decisionCod; } 
    public void setDecisionCod(String decisionCod) { 
		 this.decisionCod = decisionCod; } 
    String decisionCod;
    @JsonProperty("DeclineCod1") 
    public String getDeclineCod1() { 
		 return this.declineCod1; } 
    public void setDeclineCod1(String declineCod1) { 
		 this.declineCod1 = declineCod1; } 
    String declineCod1;
    @JsonProperty("DeclineCod2") 
    public String getDeclineCod2() { 
		 return this.declineCod2; } 
    public void setDeclineCod2(String declineCod2) { 
		 this.declineCod2 = declineCod2; } 
    String declineCod2;
}

public class FraudAssessmentDetails{
    @JsonProperty("lastAnalyst") 
    public String getLastAnalyst() { 
		 return this.lastAnalyst; } 
    public void setLastAnalyst(String lastAnalyst) { 
		 this.lastAnalyst = lastAnalyst; } 
    String lastAnalyst;
    @JsonProperty("lastTeamLeader") 
    public String getLastTeamLeader() { 
		 return this.lastTeamLeader; } 
    public void setLastTeamLeader(String lastTeamLeader) { 
		 this.lastTeamLeader = lastTeamLeader; } 
    String lastTeamLeader;
    @JsonProperty("priority") 
    public String getPriority() { 
		 return this.priority; } 
    public void setPriority(String priority) { 
		 this.priority = priority; } 
    String priority;
    @JsonProperty("stepCounter") 
    public int getStepCounter() { 
		 return this.stepCounter; } 
    public void setStepCounter(int stepCounter) { 
		 this.stepCounter = stepCounter; } 
    int stepCounter;
    @JsonProperty("isApplicationEscalated") 
    public boolean getIsApplicationEscalated() { 
		 return this.isApplicationEscalated; } 
    public void setIsApplicationEscalated(boolean isApplicationEscalated) { 
		 this.isApplicationEscalated = isApplicationEscalated; } 
    boolean isApplicationEscalated;
    @JsonProperty("VAFfraudAssessment") 
    public VAFfraudAssessment getVAFfraudAssessment() { 
		 return this.vAFfraudAssessment; } 
    public void setVAFfraudAssessment(VAFfraudAssessment vAFfraudAssessment) { 
		 this.vAFfraudAssessment = vAFfraudAssessment; } 
    VAFfraudAssessment vAFfraudAssessment;
    @JsonProperty("referralOutcome") 
    public ReferralOutcome getReferralOutcome() { 
		 return this.referralOutcome; } 
    public void setReferralOutcome(ReferralOutcome referralOutcome) { 
		 this.referralOutcome = referralOutcome; } 
    ReferralOutcome referralOutcome;
    @JsonProperty("prevFlowAction") 
    public String getPrevFlowAction() { 
		 return this.prevFlowAction; } 
    public void setPrevFlowAction(String prevFlowAction) { 
		 this.prevFlowAction = prevFlowAction; } 
    String prevFlowAction;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class FraudCheckBPMData{
    @JsonProperty("alfaCreditRefNo") 
    public String getAlfaCreditRefNo() { 
		 return this.alfaCreditRefNo; } 
    public void setAlfaCreditRefNo(String alfaCreditRefNo) { 
		 this.alfaCreditRefNo = alfaCreditRefNo; } 
    String alfaCreditRefNo;
    @JsonProperty("applicationId") 
    public String getApplicationId() { 
		 return this.applicationId; } 
    public void setApplicationId(String applicationId) { 
		 this.applicationId = applicationId; } 
    String applicationId;
    @JsonProperty("bpGuid") 
    public String getBpGuid() { 
		 return this.bpGuid; } 
    public void setBpGuid(String bpGuid) { 
		 this.bpGuid = bpGuid; } 
    String bpGuid;
    @JsonProperty("partyId") 
    public String getPartyId() { 
		 return this.partyId; } 
    public void setPartyId(String partyId) { 
		 this.partyId = partyId; } 
    String partyId;
    @JsonProperty("msgReference") 
    public String getMsgReference() { 
		 return this.msgReference; } 
    public void setMsgReference(String msgReference) { 
		 this.msgReference = msgReference; } 
    String msgReference;
    @JsonProperty("fraudRefIndicator") 
    public boolean getFraudRefIndicator() { 
		 return this.fraudRefIndicator; } 
    public void setFraudRefIndicator(boolean fraudRefIndicator) { 
		 this.fraudRefIndicator = fraudRefIndicator; } 
    boolean fraudRefIndicator;
    @JsonProperty("credRefIndicator") 
    public boolean getCredRefIndicator() { 
		 return this.credRefIndicator; } 
    public void setCredRefIndicator(boolean credRefIndicator) { 
		 this.credRefIndicator = credRefIndicator; } 
    boolean credRefIndicator;
    @JsonProperty("branchDetails") 
    public BranchDetails getBranchDetails() { 
		 return this.branchDetails; } 
    public void setBranchDetails(BranchDetails branchDetails) { 
		 this.branchDetails = branchDetails; } 
    BranchDetails branchDetails;
    @JsonProperty("orginatingSystem") 
    public String getOrginatingSystem() { 
		 return this.orginatingSystem; } 
    public void setOrginatingSystem(String orginatingSystem) { 
		 this.orginatingSystem = orginatingSystem; } 
    String orginatingSystem;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class FraudDecision{
    @JsonProperty("DecisionCod") 
    public String getDecisionCod() { 
		 return this.decisionCod; } 
    public void setDecisionCod(String decisionCod) { 
		 this.decisionCod = decisionCod; } 
    String decisionCod;
    @JsonProperty("DecisionCod1") 
    public String getDecisionCod1() { 
		 return this.decisionCod1; } 
    public void setDecisionCod1(String decisionCod1) { 
		 this.decisionCod1 = decisionCod1; } 
    String decisionCod1;
    @JsonProperty("DecisionCod2") 
    public String getDecisionCod2() { 
		 return this.decisionCod2; } 
    public void setDecisionCod2(String decisionCod2) { 
		 this.decisionCod2 = decisionCod2; } 
    String decisionCod2;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
    @JsonProperty("DeclineCod1") 
    public String getDeclineCod1() { 
		 return this.declineCod1; } 
    public void setDeclineCod1(String declineCod1) { 
		 this.declineCod1 = declineCod1; } 
    String declineCod1;
    @JsonProperty("DeclineCod2") 
    public String getDeclineCod2() { 
		 return this.declineCod2; } 
    public void setDeclineCod2(String declineCod2) { 
		 this.declineCod2 = declineCod2; } 
    String declineCod2;
    @JsonProperty("DeclineCod3") 
    public String getDeclineCod3() { 
		 return this.declineCod3; } 
    public void setDeclineCod3(String declineCod3) { 
		 this.declineCod3 = declineCod3; } 
    String declineCod3;
    @JsonProperty("DeclineCod4") 
    public String getDeclineCod4() { 
		 return this.declineCod4; } 
    public void setDeclineCod4(String declineCod4) { 
		 this.declineCod4 = declineCod4; } 
    String declineCod4;
    @JsonProperty("RollDecision") 
    public String getRollDecision() { 
		 return this.rollDecision; } 
    public void setRollDecision(String rollDecision) { 
		 this.rollDecision = rollDecision; } 
    String rollDecision;
}

public class FUT{
    @JsonProperty("headRoom") 
    public String getHeadRoom() { 
		 return this.headRoom; } 
    public void setHeadRoom(String headRoom) { 
		 this.headRoom = headRoom; } 
    String headRoom;
    @JsonProperty("optimizerLimit") 
    public String getOptimizerLimit() { 
		 return this.optimizerLimit; } 
    public void setOptimizerLimit(String optimizerLimit) { 
		 this.optimizerLimit = optimizerLimit; } 
    String optimizerLimit;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class GEN{
    @JsonProperty("TestProdFlag") 
    public String getTestProdFlag() { 
		 return this.testProdFlag; } 
    public void setTestProdFlag(String testProdFlag) { 
		 this.testProdFlag = testProdFlag; } 
    String testProdFlag;
    @JsonProperty("AORef") 
    public String getAORef() { 
		 return this.aORef; } 
    public void setAORef(String aORef) { 
		 this.aORef = aORef; } 
    String aORef;
    @JsonProperty("CrdtRefNo") 
    public String getCrdtRefNo() { 
		 return this.crdtRefNo; } 
    public void setCrdtRefNo(String crdtRefNo) { 
		 this.crdtRefNo = crdtRefNo; } 
    String crdtRefNo;
    @JsonProperty("AppProcess") 
    public String getAppProcess() { 
		 return this.appProcess; } 
    public void setAppProcess(String appProcess) { 
		 this.appProcess = appProcess; } 
    String appProcess;
    @JsonProperty("CustNo") 
    public CustNo getCustNo() { 
		 return this.custNo; } 
    public void setCustNo(CustNo custNo) { 
		 this.custNo = custNo; } 
    CustNo custNo;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class General{
    @JsonProperty("aoRef") 
    public double getAoRef() { 
		 return this.aoRef; } 
    public void setAoRef(double aoRef) { 
		 this.aoRef = aoRef; } 
    double aoRef;
    @JsonProperty("credRefNo") 
    public String getCredRefNo() { 
		 return this.credRefNo; } 
    public void setCredRefNo(String credRefNo) { 
		 this.credRefNo = credRefNo; } 
    String credRefNo;
    @JsonProperty("appDate") 
    public String getAppDate() { 
		 return this.appDate; } 
    public void setAppDate(String appDate) { 
		 this.appDate = appDate; } 
    String appDate;
    @JsonProperty("appTime") 
    public String getAppTime() { 
		 return this.appTime; } 
    public void setAppTime(String appTime) { 
		 this.appTime = appTime; } 
    String appTime;
    @JsonProperty("userId") 
    public String getUserId() { 
		 return this.userId; } 
    public void setUserId(String userId) { 
		 this.userId = userId; } 
    String userId;
    @JsonProperty("callerCode") 
    public int getCallerCode() { 
		 return this.callerCode; } 
    public void setCallerCode(int callerCode) { 
		 this.callerCode = callerCode; } 
    int callerCode;
    @JsonProperty("callerType") 
    public String getCallerType() { 
		 return this.callerType; } 
    public void setCallerType(String callerType) { 
		 this.callerType = callerType; } 
    String callerType;
    @JsonProperty("verNo") 
    public String getVerNo() { 
		 return this.verNo; } 
    public void setVerNo(String verNo) { 
		 this.verNo = verNo; } 
    String verNo;
    @JsonProperty("appProcess") 
    public int getAppProcess() { 
		 return this.appProcess; } 
    public void setAppProcess(int appProcess) { 
		 this.appProcess = appProcess; } 
    int appProcess;
    @JsonProperty("partialApp") 
    public String getPartialApp() { 
		 return this.partialApp; } 
    public void setPartialApp(String partialApp) { 
		 this.partialApp = partialApp; } 
    String partialApp;
    @JsonProperty("noOfApplicants") 
    public int getNoOfApplicants() { 
		 return this.noOfApplicants; } 
    public void setNoOfApplicants(int noOfApplicants) { 
		 this.noOfApplicants = noOfApplicants; } 
    int noOfApplicants;
    @JsonProperty("useCustInfo") 
    public UseCustInfo getUseCustInfo() { 
		 return this.useCustInfo; } 
    public void setUseCustInfo(UseCustInfo useCustInfo) { 
		 this.useCustInfo = useCustInfo; } 
    UseCustInfo useCustInfo;
    @JsonProperty("ncaInActInd") 
    public String getNcaInActInd() { 
		 return this.ncaInActInd; } 
    public void setNcaInActInd(String ncaInActInd) { 
		 this.ncaInActInd = ncaInActInd; } 
    String ncaInActInd;
    @JsonProperty("ncaJuristicInd") 
    public String getNcaJuristicInd() { 
		 return this.ncaJuristicInd; } 
    public void setNcaJuristicInd(String ncaJuristicInd) { 
		 this.ncaJuristicInd = ncaJuristicInd; } 
    String ncaJuristicInd;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class GeneralCaf{
    @JsonProperty("apMarketGrpCode") 
    public String getApMarketGrpCode() { 
		 return this.apMarketGrpCode; } 
    public void setApMarketGrpCode(String apMarketGrpCode) { 
		 this.apMarketGrpCode = apMarketGrpCode; } 
    String apMarketGrpCode;
    @JsonProperty("appType") 
    public String getAppType() { 
		 return this.appType; } 
    public void setAppType(String appType) { 
		 this.appType = appType; } 
    String appType;
    @JsonProperty("agreementType") 
    public String getAgreementType() { 
		 return this.agreementType; } 
    public void setAgreementType(String agreementType) { 
		 this.agreementType = agreementType; } 
    String agreementType;
    @JsonProperty("dicCatg") 
    public String getDicCatg() { 
		 return this.dicCatg; } 
    public void setDicCatg(String dicCatg) { 
		 this.dicCatg = dicCatg; } 
    String dicCatg;
    @JsonProperty("requestedLimit") 
    public double getRequestedLimit() { 
		 return this.requestedLimit; } 
    public void setRequestedLimit(double requestedLimit) { 
		 this.requestedLimit = requestedLimit; } 
    double requestedLimit;
    @JsonProperty("initialFees") 
    public double getInitialFees() { 
		 return this.initialFees; } 
    public void setInitialFees(double initialFees) { 
		 this.initialFees = initialFees; } 
    double initialFees;
    @JsonProperty("monthlySerFee") 
    public double getMonthlySerFee() { 
		 return this.monthlySerFee; } 
    public void setMonthlySerFee(double monthlySerFee) { 
		 this.monthlySerFee = monthlySerFee; } 
    double monthlySerFee;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class GeneralDecision{
    @JsonProperty("ReturnCode") 
    public String getReturnCode() { 
		 return this.returnCode; } 
    public void setReturnCode(String returnCode) { 
		 this.returnCode = returnCode; } 
    String returnCode;
    @JsonProperty("ReturnCodeType") 
    public String getReturnCodeType() { 
		 return this.returnCodeType; } 
    public void setReturnCodeType(String returnCodeType) { 
		 this.returnCodeType = returnCodeType; } 
    String returnCodeType;
    @JsonProperty("FIN") 
    public FIN getFIN() { 
		 return this.fIN; } 
    public void setFIN(FIN fIN) { 
		 this.fIN = fIN; } 
    FIN fIN;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Generals{
    @JsonProperty("FE") 
    public FE getFE() { 
		 return this.fE; } 
    public void setFE(FE fE) { 
		 this.fE = fE; } 
    FE fE;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class IdInfo{
    @JsonProperty("idType") 
    public String getIdType() { 
		 return this.idType; } 
    public void setIdType(String idType) { 
		 this.idType = idType; } 
    String idType;
    @JsonProperty("idNo") 
    public String getIdNo() { 
		 return this.idNo; } 
    public void setIdNo(String idNo) { 
		 this.idNo = idNo; } 
    String idNo;
    @JsonProperty("customerNo") 
    public String getCustomerNo() { 
		 return this.customerNo; } 
    public void setCustomerNo(String customerNo) { 
		 this.customerNo = customerNo; } 
    String customerNo;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Item{
    @JsonProperty("fileName") 
    public String getFileName() { 
		 return this.fileName; } 
    public void setFileName(String fileName) { 
		 this.fileName = fileName; } 
    String fileName;
    @JsonProperty("documentType") 
    public String getDocumentType() { 
		 return this.documentType; } 
    public void setDocumentType(String documentType) { 
		 this.documentType = documentType; } 
    String documentType;
    @JsonProperty("documentID") 
    public String getDocumentID() { 
		 return this.documentID; } 
    public void setDocumentID(String documentID) { 
		 this.documentID = documentID; } 
    String documentID;
    @JsonProperty("contentURL") 
    public String getContentURL() { 
		 return this.contentURL; } 
    public void setContentURL(String contentURL) { 
		 this.contentURL = contentURL; } 
    String contentURL;
    @JsonProperty("createdDate") 
    public Date getCreatedDate() { 
		 return this.createdDate; } 
    public void setCreatedDate(Date createdDate) { 
		 this.createdDate = createdDate; } 
    Date createdDate;
    @JsonProperty("uploadedBy") 
    public String getUploadedBy() { 
		 return this.uploadedBy; } 
    public void setUploadedBy(String uploadedBy) { 
		 this.uploadedBy = uploadedBy; } 
    String uploadedBy;
    @JsonProperty("isBranchUploaded") 
    public boolean getIsBranchUploaded() { 
		 return this.isBranchUploaded; } 
    public void setIsBranchUploaded(boolean isBranchUploaded) { 
		 this.isBranchUploaded = isBranchUploaded; } 
    boolean isBranchUploaded;
    @JsonProperty("kycIndicator") 
    public boolean getKycIndicator() { 
		 return this.kycIndicator; } 
    public void setKycIndicator(boolean kycIndicator) { 
		 this.kycIndicator = kycIndicator; } 
    boolean kycIndicator;
    @JsonProperty("kycVerificationDate") 
    public String getKycVerificationDate() { 
		 return this.kycVerificationDate; } 
    public void setKycVerificationDate(String kycVerificationDate) { 
		 this.kycVerificationDate = kycVerificationDate; } 
    String kycVerificationDate;
    @JsonProperty("kycVerifiedBy") 
    public String getKycVerifiedBy() { 
		 return this.kycVerifiedBy; } 
    public void setKycVerifiedBy(String kycVerifiedBy) { 
		 this.kycVerifiedBy = kycVerifiedBy; } 
    String kycVerifiedBy;
    @JsonProperty("documentTypeDescription") 
    public String getDocumentTypeDescription() { 
		 return this.documentTypeDescription; } 
    public void setDocumentTypeDescription(String documentTypeDescription) { 
		 this.documentTypeDescription = documentTypeDescription; } 
    String documentTypeDescription;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
    @JsonProperty("customerType") 
    public String getCustomerType() { 
		 return this.customerType; } 
    public void setCustomerType(String customerType) { 
		 this.customerType = customerType; } 
    String customerType;
    @JsonProperty("title") 
    public String getTitle() { 
		 return this.title; } 
    public void setTitle(String title) { 
		 this.title = title; } 
    String title;
    @JsonProperty("initial") 
    public String getInitial() { 
		 return this.initial; } 
    public void setInitial(String initial) { 
		 this.initial = initial; } 
    String initial;
    @JsonProperty("firstName") 
    public String getFirstName() { 
		 return this.firstName; } 
    public void setFirstName(String firstName) { 
		 this.firstName = firstName; } 
    String firstName;
    @JsonProperty("surname") 
    public String getSurname() { 
		 return this.surname; } 
    public void setSurname(String surname) { 
		 this.surname = surname; } 
    String surname;
    @JsonProperty("dateOfBirth") 
    public String getDateOfBirth() { 
		 return this.dateOfBirth; } 
    public void setDateOfBirth(String dateOfBirth) { 
		 this.dateOfBirth = dateOfBirth; } 
    String dateOfBirth;
    @JsonProperty("gender") 
    public String getGender() { 
		 return this.gender; } 
    public void setGender(String gender) { 
		 this.gender = gender; } 
    String gender;
    @JsonProperty("cutsomerAge") 
    public int getCutsomerAge() { 
		 return this.cutsomerAge; } 
    public void setCutsomerAge(int cutsomerAge) { 
		 this.cutsomerAge = cutsomerAge; } 
    int cutsomerAge;
    @JsonProperty("marketSegment") 
    public String getMarketSegment() { 
		 return this.marketSegment; } 
    public void setMarketSegment(String marketSegment) { 
		 this.marketSegment = marketSegment; } 
    String marketSegment;
    @JsonProperty("address") 
    public Address getAddress() { 
		 return this.address; } 
    public void setAddress(Address address) { 
		 this.address = address; } 
    Address address;
    @JsonProperty("citizenCode") 
    public String getCitizenCode() { 
		 return this.citizenCode; } 
    public void setCitizenCode(String citizenCode) { 
		 this.citizenCode = citizenCode; } 
    String citizenCode;
    @JsonProperty("telephoneHome") 
    public TelephoneHome getTelephoneHome() { 
		 return this.telephoneHome; } 
    public void setTelephoneHome(TelephoneHome telephoneHome) { 
		 this.telephoneHome = telephoneHome; } 
    TelephoneHome telephoneHome;
    @JsonProperty("telephoneBusiness") 
    public TelephoneBusiness getTelephoneBusiness() { 
		 return this.telephoneBusiness; } 
    public void setTelephoneBusiness(TelephoneBusiness telephoneBusiness) { 
		 this.telephoneBusiness = telephoneBusiness; } 
    TelephoneBusiness telephoneBusiness;
    @JsonProperty("telephoneCell") 
    public TelephoneCell getTelephoneCell() { 
		 return this.telephoneCell; } 
    public void setTelephoneCell(TelephoneCell telephoneCell) { 
		 this.telephoneCell = telephoneCell; } 
    TelephoneCell telephoneCell;
    @JsonProperty("email") 
    public String getEmail() { 
		 return this.email; } 
    public void setEmail(String email) { 
		 this.email = email; } 
    String email;
    @JsonProperty("nonResident") 
    public String getNonResident() { 
		 return this.nonResident; } 
    public void setNonResident(String nonResident) { 
		 this.nonResident = nonResident; } 
    String nonResident;
    @JsonProperty("idInfo") 
    public IdInfo getIdInfo() { 
		 return this.idInfo; } 
    public void setIdInfo(IdInfo idInfo) { 
		 this.idInfo = idInfo; } 
    IdInfo idInfo;
    @JsonProperty("addResPOCod") 
    public String getAddResPOCod() { 
		 return this.addResPOCod; } 
    public void setAddResPOCod(String addResPOCod) { 
		 this.addResPOCod = addResPOCod; } 
    String addResPOCod;
    @JsonProperty("underDebtReview") 
    public String getUnderDebtReview() { 
		 return this.underDebtReview; } 
    public void setUnderDebtReview(String underDebtReview) { 
		 this.underDebtReview = underDebtReview; } 
    String underDebtReview;
    @JsonProperty("underSequestration") 
    public String getUnderSequestration() { 
		 return this.underSequestration; } 
    public void setUnderSequestration(String underSequestration) { 
		 this.underSequestration = underSequestration; } 
    String underSequestration;
    @JsonProperty("underAdminOrder") 
    public String getUnderAdminOrder() { 
		 return this.underAdminOrder; } 
    public void setUnderAdminOrder(String underAdminOrder) { 
		 this.underAdminOrder = underAdminOrder; } 
    String underAdminOrder;
    @JsonProperty("extBureauConsent") 
    public String getExtBureauConsent() { 
		 return this.extBureauConsent; } 
    public void setExtBureauConsent(String extBureauConsent) { 
		 this.extBureauConsent = extBureauConsent; } 
    String extBureauConsent;
    @JsonProperty("insolvent") 
    public String getInsolvent() { 
		 return this.insolvent; } 
    public void setInsolvent(String insolvent) { 
		 this.insolvent = insolvent; } 
    String insolvent;
    @JsonProperty("grossIncome") 
    public double getGrossIncome() { 
		 return this.grossIncome; } 
    public void setGrossIncome(double grossIncome) { 
		 this.grossIncome = grossIncome; } 
    double grossIncome;
    @JsonProperty("otherMonthlyIncome") 
    public double getOtherMonthlyIncome() { 
		 return this.otherMonthlyIncome; } 
    public void setOtherMonthlyIncome(double otherMonthlyIncome) { 
		 this.otherMonthlyIncome = otherMonthlyIncome; } 
    double otherMonthlyIncome;
    @JsonProperty("netIncome") 
    public double getNetIncome() { 
		 return this.netIncome; } 
    public void setNetIncome(double netIncome) { 
		 this.netIncome = netIncome; } 
    double netIncome;
    @JsonProperty("totalIncome") 
    public double getTotalIncome() { 
		 return this.totalIncome; } 
    public void setTotalIncome(double totalIncome) { 
		 this.totalIncome = totalIncome; } 
    double totalIncome;
    @JsonProperty("totalMonthlyExpense") 
    public double getTotalMonthlyExpense() { 
		 return this.totalMonthlyExpense; } 
    public void setTotalMonthlyExpense(double totalMonthlyExpense) { 
		 this.totalMonthlyExpense = totalMonthlyExpense; } 
    double totalMonthlyExpense;
    @JsonProperty("GeneralCaf") 
    public GeneralCaf getGeneralCaf() { 
		 return this.generalCaf; } 
    public void setGeneralCaf(GeneralCaf generalCaf) { 
		 this.generalCaf = generalCaf; } 
    GeneralCaf generalCaf;
    @JsonProperty("ProductCaf") 
    public ProductCaf getProductCaf() { 
		 return this.productCaf; } 
    public void setProductCaf(ProductCaf productCaf) { 
		 this.productCaf = productCaf; } 
    ProductCaf productCaf;
    @JsonProperty("collateralHeld") 
    public String getCollateralHeld() { 
		 return this.collateralHeld; } 
    public void setCollateralHeld(String collateralHeld) { 
		 this.collateralHeld = collateralHeld; } 
    String collateralHeld;
    @JsonProperty("astClass") 
    public String getAstClass() { 
		 return this.astClass; } 
    public void setAstClass(String astClass) { 
		 this.astClass = astClass; } 
    String astClass;
    @JsonProperty("collateralOwnership") 
    public String getCollateralOwnership() { 
		 return this.collateralOwnership; } 
    public void setCollateralOwnership(String collateralOwnership) { 
		 this.collateralOwnership = collateralOwnership; } 
    String collateralOwnership;
    @JsonProperty("collateralType") 
    public String getCollateralType() { 
		 return this.collateralType; } 
    public void setCollateralType(String collateralType) { 
		 this.collateralType = collateralType; } 
    String collateralType;
    @JsonProperty("serialNo") 
    public String getSerialNo() { 
		 return this.serialNo; } 
    public void setSerialNo(String serialNo) { 
		 this.serialNo = serialNo; } 
    String serialNo;
    @JsonProperty("GeneralDecision") 
    public GeneralDecision getGeneralDecision() { 
		 return this.generalDecision; } 
    public void setGeneralDecision(GeneralDecision generalDecision) { 
		 this.generalDecision = generalDecision; } 
    GeneralDecision generalDecision;
    @JsonProperty("ProductDecision") 
    public ProductDecision getProductDecision() { 
		 return this.productDecision; } 
    public void setProductDecision(ProductDecision productDecision) { 
		 this.productDecision = productDecision; } 
    ProductDecision productDecision;
    @JsonProperty("PreScreenDecision") 
    public PreScreenDecision getPreScreenDecision() { 
		 return this.preScreenDecision; } 
    public void setPreScreenDecision(PreScreenDecision preScreenDecision) { 
		 this.preScreenDecision = preScreenDecision; } 
    PreScreenDecision preScreenDecision;
    @JsonProperty("FraudDecision") 
    public FraudDecision getFraudDecision() { 
		 return this.fraudDecision; } 
    public void setFraudDecision(FraudDecision fraudDecision) { 
		 this.fraudDecision = fraudDecision; } 
    FraudDecision fraudDecision;
    @JsonProperty("DataSource") 
    public String getDataSource() { 
		 return this.dataSource; } 
    public void setDataSource(String dataSource) { 
		 this.dataSource = dataSource; } 
    String dataSource;
    @JsonProperty("StatusCode") 
    public String getStatusCode() { 
		 return this.statusCode; } 
    public void setStatusCode(String statusCode) { 
		 this.statusCode = statusCode; } 
    String statusCode;
    @JsonProperty("description") 
    public String getDescription() { 
		 return this.description; } 
    public void setDescription(String description) { 
		 this.description = description; } 
    String description;
    @JsonProperty("attachmentType") 
    public String getAttachmentType() { 
		 return this.attachmentType; } 
    public void setAttachmentType(String attachmentType) { 
		 this.attachmentType = attachmentType; } 
    String attachmentType;
    @JsonProperty("identifier") 
    public String getIdentifier() { 
		 return this.identifier; } 
    public void setIdentifier(String identifier) { 
		 this.identifier = identifier; } 
    String identifier;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("value") 
    public String getValue() { 
		 return this.value; } 
    public void setValue(String value) { 
		 this.value = value; } 
    String value;
}

public class Logger{
    @JsonProperty("initializedLogger") 
    public String getInitializedLogger() { 
		 return this.initializedLogger; } 
    public void setInitializedLogger(String initializedLogger) { 
		 this.initializedLogger = initializedLogger; } 
    String initializedLogger;
    @JsonProperty("applicationMode") 
    public String getApplicationMode() { 
		 return this.applicationMode; } 
    public void setApplicationMode(String applicationMode) { 
		 this.applicationMode = applicationMode; } 
    String applicationMode;
    @JsonProperty("logGuid") 
    public String getLogGuid() { 
		 return this.logGuid; } 
    public void setLogGuid(String logGuid) { 
		 this.logGuid = logGuid; } 
    String logGuid;
    @JsonProperty("bpmFeatureTeam") 
    public String getBpmFeatureTeam() { 
		 return this.bpmFeatureTeam; } 
    public void setBpmFeatureTeam(String bpmFeatureTeam) { 
		 this.bpmFeatureTeam = bpmFeatureTeam; } 
    String bpmFeatureTeam;
    @JsonProperty("serviceType") 
    public String getServiceType() { 
		 return this.serviceType; } 
    public void setServiceType(String serviceType) { 
		 this.serviceType = serviceType; } 
    String serviceType;
    @JsonProperty("callerAcronym") 
    public String getCallerAcronym() { 
		 return this.callerAcronym; } 
    public void setCallerAcronym(String callerAcronym) { 
		 this.callerAcronym = callerAcronym; } 
    String callerAcronym;
    @JsonProperty("upn") 
    public String getUpn() { 
		 return this.upn; } 
    public void setUpn(String upn) { 
		 this.upn = upn; } 
    String upn;
    @JsonProperty("digitalId") 
    public String getDigitalId() { 
		 return this.digitalId; } 
    public void setDigitalId(String digitalId) { 
		 this.digitalId = digitalId; } 
    String digitalId;
    @JsonProperty("empNo") 
    public String getEmpNo() { 
		 return this.empNo; } 
    public void setEmpNo(String empNo) { 
		 this.empNo = empNo; } 
    String empNo;
    @JsonProperty("consumerBpmApplication") 
    public String getConsumerBpmApplication() { 
		 return this.consumerBpmApplication; } 
    public void setConsumerBpmApplication(String consumerBpmApplication) { 
		 this.consumerBpmApplication = consumerBpmApplication; } 
    String consumerBpmApplication;
    @JsonProperty("callerProcessInstanceId") 
    public String getCallerProcessInstanceId() { 
		 return this.callerProcessInstanceId; } 
    public void setCallerProcessInstanceId(String callerProcessInstanceId) { 
		 this.callerProcessInstanceId = callerProcessInstanceId; } 
    String callerProcessInstanceId;
    @JsonProperty("location") 
    public String getLocation() { 
		 return this.location; } 
    public void setLocation(String location) { 
		 this.location = location; } 
    String location;
    @JsonProperty("message") 
    public String getMessage() { 
		 return this.message; } 
    public void setMessage(String message) { 
		 this.message = message; } 
    String message;
    @JsonProperty("payload") 
    public String getPayload() { 
		 return this.payload; } 
    public void setPayload(String payload) { 
		 this.payload = payload; } 
    String payload;
    @JsonProperty("businessFunction") 
    public String getBusinessFunction() { 
		 return this.businessFunction; } 
    public void setBusinessFunction(String businessFunction) { 
		 this.businessFunction = businessFunction; } 
    String businessFunction;
    @JsonProperty("startTime") 
    public String getStartTime() { 
		 return this.startTime; } 
    public void setStartTime(String startTime) { 
		 this.startTime = startTime; } 
    String startTime;
    @JsonProperty("endTime") 
    public String getEndTime() { 
		 return this.endTime; } 
    public void setEndTime(String endTime) { 
		 this.endTime = endTime; } 
    String endTime;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Metadata{
    @JsonProperty("objectID") 
    public String getObjectID() { 
		 return this.objectID; } 
    public void setObjectID(String objectID) { 
		 this.objectID = objectID; } 
    String objectID;
    @JsonProperty("dirty") 
    public boolean getDirty() { 
		 return this.dirty; } 
    public void setDirty(boolean dirty) { 
		 this.dirty = dirty; } 
    boolean dirty;
    @JsonProperty("invalid") 
    public boolean getInvalid() { 
		 return this.invalid; } 
    public void setInvalid(boolean invalid) { 
		 this.invalid = invalid; } 
    boolean invalid;
    @JsonProperty("shared") 
    public boolean getShared() { 
		 return this.shared; } 
    public void setShared(boolean shared) { 
		 this.shared = shared; } 
    boolean shared;
    @JsonProperty("rootVersionContextID") 
    public String getRootVersionContextID() { 
		 return this.rootVersionContextID; } 
    public void setRootVersionContextID(String rootVersionContextID) { 
		 this.rootVersionContextID = rootVersionContextID; } 
    String rootVersionContextID;
    @JsonProperty("className") 
    public String getClassName() { 
		 return this.className; } 
    public void setClassName(String className) { 
		 this.className = className; } 
    String className;
    @JsonProperty("contentObject") 
    public boolean getContentObject() { 
		 return this.contentObject; } 
    public void setContentObject(boolean contentObject) { 
		 this.contentObject = contentObject; } 
    boolean contentObject;
    @JsonProperty("key") 
    public String getKey() { 
		 return this.key; } 
    public void setKey(String key) { 
		 this.key = key; } 
    String key;
    @JsonProperty("version") 
    public int getVersion() { 
		 return this.version; } 
    public void setVersion(int version) { 
		 this.version = version; } 
    int version;
}

public class Notes{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Object> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Object> items) { 
		 this.items = items; } 
    ArrayList<Object> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Notes2{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Object> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Object> items) { 
		 this.items = items; } 
    ArrayList<Object> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class NotesFromAlfa{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Object> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Object> items) { 
		 this.items = items; } 
    ArrayList<Object> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class PreScreenDecision{
    @JsonProperty("DecisionCod") 
    public String getDecisionCod() { 
		 return this.decisionCod; } 
    public void setDecisionCod(String decisionCod) { 
		 this.decisionCod = decisionCod; } 
    String decisionCod;
    @JsonProperty("DeclineCod1") 
    public String getDeclineCod1() { 
		 return this.declineCod1; } 
    public void setDeclineCod1(String declineCod1) { 
		 this.declineCod1 = declineCod1; } 
    String declineCod1;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
    @JsonProperty("RollDecision") 
    public String getRollDecision() { 
		 return this.rollDecision; } 
    public void setRollDecision(String rollDecision) { 
		 this.rollDecision = rollDecision; } 
    String rollDecision;
}

public class PrincipalAffordability{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class PrincipalConsent{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class PrincipalPersonal{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Product{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ProductCaf{
    @JsonProperty("loanTerm") 
    public double getLoanTerm() { 
		 return this.loanTerm; } 
    public void setLoanTerm(double loanTerm) { 
		 this.loanTerm = loanTerm; } 
    double loanTerm;
    @JsonProperty("instalNo") 
    public int getInstalNo() { 
		 return this.instalNo; } 
    public void setInstalNo(int instalNo) { 
		 this.instalNo = instalNo; } 
    int instalNo;
    @JsonProperty("extr1Amount") 
    public double getExtr1Amount() { 
		 return this.extr1Amount; } 
    public void setExtr1Amount(double extr1Amount) { 
		 this.extr1Amount = extr1Amount; } 
    double extr1Amount;
    @JsonProperty("extr2Amount") 
    public double getExtr2Amount() { 
		 return this.extr2Amount; } 
    public void setExtr2Amount(double extr2Amount) { 
		 this.extr2Amount = extr2Amount; } 
    double extr2Amount;
    @JsonProperty("extr1Desc") 
    public String getExtr1Desc() { 
		 return this.extr1Desc; } 
    public void setExtr1Desc(String extr1Desc) { 
		 this.extr1Desc = extr1Desc; } 
    String extr1Desc;
    @JsonProperty("extr2Desc") 
    public String getExtr2Desc() { 
		 return this.extr2Desc; } 
    public void setExtr2Desc(String extr2Desc) { 
		 this.extr2Desc = extr2Desc; } 
    String extr2Desc;
    @JsonProperty("goodsDesc") 
    public String getGoodsDesc() { 
		 return this.goodsDesc; } 
    public void setGoodsDesc(String goodsDesc) { 
		 this.goodsDesc = goodsDesc; } 
    String goodsDesc;
    @JsonProperty("goodsAge") 
    public int getGoodsAge() { 
		 return this.goodsAge; } 
    public void setGoodsAge(int goodsAge) { 
		 this.goodsAge = goodsAge; } 
    int goodsAge;
    @JsonProperty("resAmount") 
    public double getResAmount() { 
		 return this.resAmount; } 
    public void setResAmount(double resAmount) { 
		 this.resAmount = resAmount; } 
    double resAmount;
    @JsonProperty("channelIndicator") 
    public String getChannelIndicator() { 
		 return this.channelIndicator; } 
    public void setChannelIndicator(String channelIndicator) { 
		 this.channelIndicator = channelIndicator; } 
    String channelIndicator;
    @JsonProperty("goodsTypeCode") 
    public String getGoodsTypeCode() { 
		 return this.goodsTypeCode; } 
    public void setGoodsTypeCode(String goodsTypeCode) { 
		 this.goodsTypeCode = goodsTypeCode; } 
    String goodsTypeCode;
    @JsonProperty("digstPriceAmnt") 
    public double getDigstPriceAmnt() { 
		 return this.digstPriceAmnt; } 
    public void setDigstPriceAmnt(double digstPriceAmnt) { 
		 this.digstPriceAmnt = digstPriceAmnt; } 
    double digstPriceAmnt;
    @JsonProperty("newUsed") 
    public String getNewUsed() { 
		 return this.newUsed; } 
    public void setNewUsed(String newUsed) { 
		 this.newUsed = newUsed; } 
    String newUsed;
    @JsonProperty("depAmnt") 
    public double getDepAmnt() { 
		 return this.depAmnt; } 
    public void setDepAmnt(double depAmnt) { 
		 this.depAmnt = depAmnt; } 
    double depAmnt;
    @JsonProperty("cashValueAmnt") 
    public double getCashValueAmnt() { 
		 return this.cashValueAmnt; } 
    public void setCashValueAmnt(double cashValueAmnt) { 
		 this.cashValueAmnt = cashValueAmnt; } 
    double cashValueAmnt;
    @JsonProperty("equityOfGoods") 
    public double getEquityOfGoods() { 
		 return this.equityOfGoods; } 
    public void setEquityOfGoods(double equityOfGoods) { 
		 this.equityOfGoods = equityOfGoods; } 
    double equityOfGoods;
    @JsonProperty("interestP") 
    public double getInterestP() { 
		 return this.interestP; } 
    public void setInterestP(double interestP) { 
		 this.interestP = interestP; } 
    double interestP;
    @JsonProperty("itemAge") 
    public int getItemAge() { 
		 return this.itemAge; } 
    public void setItemAge(int itemAge) { 
		 this.itemAge = itemAge; } 
    int itemAge;
    @JsonProperty("totalExpsreAmnt") 
    public double getTotalExpsreAmnt() { 
		 return this.totalExpsreAmnt; } 
    public void setTotalExpsreAmnt(double totalExpsreAmnt) { 
		 this.totalExpsreAmnt = totalExpsreAmnt; } 
    double totalExpsreAmnt;
    @JsonProperty("dealerNo") 
    public double getDealerNo() { 
		 return this.dealerNo; } 
    public void setDealerNo(double dealerNo) { 
		 this.dealerNo = dealerNo; } 
    double dealerNo;
    @JsonProperty("installSettlement") 
    public double getInstallSettlement() { 
		 return this.installSettlement; } 
    public void setInstallSettlement(double installSettlement) { 
		 this.installSettlement = installSettlement; } 
    double installSettlement;
    @JsonProperty("cashAssetPrice") 
    public double getCashAssetPrice() { 
		 return this.cashAssetPrice; } 
    public void setCashAssetPrice(double cashAssetPrice) { 
		 this.cashAssetPrice = cashAssetPrice; } 
    double cashAssetPrice;
    @JsonProperty("residualP") 
    public int getResidualP() { 
		 return this.residualP; } 
    public void setResidualP(int residualP) { 
		 this.residualP = residualP; } 
    int residualP;
    @JsonProperty("deliveryInstFuel") 
    public double getDeliveryInstFuel() { 
		 return this.deliveryInstFuel; } 
    public void setDeliveryInstFuel(double deliveryInstFuel) { 
		 this.deliveryInstFuel = deliveryInstFuel; } 
    double deliveryInstFuel;
    @JsonProperty("mwiWarPrem") 
    public double getMwiWarPrem() { 
		 return this.mwiWarPrem; } 
    public void setMwiWarPrem(double mwiWarPrem) { 
		 this.mwiWarPrem = mwiWarPrem; } 
    double mwiWarPrem;
    @JsonProperty("paintechPrem") 
    public double getPaintechPrem() { 
		 return this.paintechPrem; } 
    public void setPaintechPrem(double paintechPrem) { 
		 this.paintechPrem = paintechPrem; } 
    double paintechPrem;
    @JsonProperty("mmcode") 
    public double getMmcode() { 
		 return this.mmcode; } 
    public void setMmcode(double mmcode) { 
		 this.mmcode = mmcode; } 
    double mmcode;
    @JsonProperty("vehDigestExtr") 
    public double getVehDigestExtr() { 
		 return this.vehDigestExtr; } 
    public void setVehDigestExtr(double vehDigestExtr) { 
		 this.vehDigestExtr = vehDigestExtr; } 
    double vehDigestExtr;
    @JsonProperty("setExpsreAmnt") 
    public double getSetExpsreAmnt() { 
		 return this.setExpsreAmnt; } 
    public void setSetExpsreAmnt(double setExpsreAmnt) { 
		 this.setExpsreAmnt = setExpsreAmnt; } 
    double setExpsreAmnt;
    @JsonProperty("balloonPercent") 
    public String getBalloonPercent() { 
		 return this.balloonPercent; } 
    public void setBalloonPercent(String balloonPercent) { 
		 this.balloonPercent = balloonPercent; } 
    String balloonPercent;
    @JsonProperty("cashPriceAmnt") 
    public double getCashPriceAmnt() { 
		 return this.cashPriceAmnt; } 
    public void setCashPriceAmnt(double cashPriceAmnt) { 
		 this.cashPriceAmnt = cashPriceAmnt; } 
    double cashPriceAmnt;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ProductDecision{
    @JsonProperty("FIN") 
    public FIN getFIN() { 
		 return this.fIN; } 
    public void setFIN(FIN fIN) { 
		 this.fIN = fIN; } 
    FIN fIN;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
    @JsonProperty("DecisionCod") 
    public String getDecisionCod() { 
		 return this.decisionCod; } 
    public void setDecisionCod(String decisionCod) { 
		 this.decisionCod = decisionCod; } 
    String decisionCod;
    @JsonProperty("DeclineCod1") 
    public String getDeclineCod1() { 
		 return this.declineCod1; } 
    public void setDeclineCod1(String declineCod1) { 
		 this.declineCod1 = declineCod1; } 
    String declineCod1;
    @JsonProperty("DeclineCod2") 
    public String getDeclineCod2() { 
		 return this.declineCod2; } 
    public void setDeclineCod2(String declineCod2) { 
		 this.declineCod2 = declineCod2; } 
    String declineCod2;
    @JsonProperty("DeclineCod3") 
    public String getDeclineCod3() { 
		 return this.declineCod3; } 
    public void setDeclineCod3(String declineCod3) { 
		 this.declineCod3 = declineCod3; } 
    String declineCod3;
    @JsonProperty("DeclineCod4") 
    public String getDeclineCod4() { 
		 return this.declineCod4; } 
    public void setDeclineCod4(String declineCod4) { 
		 this.declineCod4 = declineCod4; } 
    String declineCod4;
    @JsonProperty("DeclineCod5") 
    public String getDeclineCod5() { 
		 return this.declineCod5; } 
    public void setDeclineCod5(String declineCod5) { 
		 this.declineCod5 = declineCod5; } 
    String declineCod5;
    @JsonProperty("DeclineCod6") 
    public String getDeclineCod6() { 
		 return this.declineCod6; } 
    public void setDeclineCod6(String declineCod6) { 
		 this.declineCod6 = declineCod6; } 
    String declineCod6;
    @JsonProperty("DeclineCod7") 
    public String getDeclineCod7() { 
		 return this.declineCod7; } 
    public void setDeclineCod7(String declineCod7) { 
		 this.declineCod7 = declineCod7; } 
    String declineCod7;
    @JsonProperty("DeclineCod8") 
    public String getDeclineCod8() { 
		 return this.declineCod8; } 
    public void setDeclineCod8(String declineCod8) { 
		 this.declineCod8 = declineCod8; } 
    String declineCod8;
    @JsonProperty("DeclineCod9") 
    public String getDeclineCod9() { 
		 return this.declineCod9; } 
    public void setDeclineCod9(String declineCod9) { 
		 this.declineCod9 = declineCod9; } 
    String declineCod9;
    @JsonProperty("DeclineCod10") 
    public String getDeclineCod10() { 
		 return this.declineCod10; } 
    public void setDeclineCod10(String declineCod10) { 
		 this.declineCod10 = declineCod10; } 
    String declineCod10;
    @JsonProperty("RollDecision") 
    public String getRollDecision() { 
		 return this.rollDecision; } 
    public void setRollDecision(String rollDecision) { 
		 this.rollDecision = rollDecision; } 
    String rollDecision;
}

public class Province{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ReferralAdverseReasons{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<Item> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<Item> items) { 
		 this.items = items; } 
    ArrayList<Item> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ReferralDecision{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("value") 
    public String getValue() { 
		 return this.value; } 
    public void setValue(String value) { 
		 this.value = value; } 
    String value;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ReferralOutcome{
    @JsonProperty("rafDecision") 
    public String getRafDecision() { 
		 return this.rafDecision; } 
    public void setRafDecision(String rafDecision) { 
		 this.rafDecision = rafDecision; } 
    String rafDecision;
    @JsonProperty("referralDecision") 
    public ReferralDecision getReferralDecision() { 
		 return this.referralDecision; } 
    public void setReferralDecision(ReferralDecision referralDecision) { 
		 this.referralDecision = referralDecision; } 
    ReferralDecision referralDecision;
    @JsonProperty("adverseReasons") 
    public AdverseReasons getAdverseReasons() { 
		 return this.adverseReasons; } 
    public void setAdverseReasons(AdverseReasons adverseReasons) { 
		 this.adverseReasons = adverseReasons; } 
    AdverseReasons adverseReasons;
    @JsonProperty("referralAdverseReasons") 
    public ReferralAdverseReasons getReferralAdverseReasons() { 
		 return this.referralAdverseReasons; } 
    public void setReferralAdverseReasons(ReferralAdverseReasons referralAdverseReasons) { 
		 this.referralAdverseReasons = referralAdverseReasons; } 
    ReferralAdverseReasons referralAdverseReasons;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Region{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class RequestedSupportingDocuments{
    @JsonProperty("agreementNumber") 
    public String getAgreementNumber() { 
		 return this.agreementNumber; } 
    public void setAgreementNumber(String agreementNumber) { 
		 this.agreementNumber = agreementNumber; } 
    String agreementNumber;
    @JsonProperty("attachments") 
    public Attachments getAttachments() { 
		 return this.attachments; } 
    public void setAttachments(Attachments attachments) { 
		 this.attachments = attachments; } 
    Attachments attachments;
    @JsonProperty("statusCode") 
    public String getStatusCode() { 
		 return this.statusCode; } 
    public void setStatusCode(String statusCode) { 
		 this.statusCode = statusCode; } 
    String statusCode;
    @JsonProperty("statusDescription") 
    public String getStatusDescription() { 
		 return this.statusDescription; } 
    public void setStatusDescription(String statusDescription) { 
		 this.statusDescription = statusDescription; } 
    String statusDescription;
    @JsonProperty("Notes") 
    public Notes getNotes() { 
		 return this.notes; } 
    public void setNotes(Notes notes) { 
		 this.notes = notes; } 
    Notes notes;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class ResponseData{
    @JsonProperty("Customer") 
    public Customer getCustomer() { 
		 return this.customer; } 
    public void setCustomer(Customer customer) { 
		 this.customer = customer; } 
    Customer customer;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class Root{
    @JsonProperty("uploadDocDetailNew") 
    public UploadDocDetailNew getUploadDocDetailNew() { 
		 return this.uploadDocDetailNew; } 
    public void setUploadDocDetailNew(UploadDocDetailNew uploadDocDetailNew) { 
		 this.uploadDocDetailNew = uploadDocDetailNew; } 
    UploadDocDetailNew uploadDocDetailNew;
    @JsonProperty("retryCount") 
    public int getRetryCount() { 
		 return this.retryCount; } 
    public void setRetryCount(int retryCount) { 
		 this.retryCount = retryCount; } 
    int retryCount;
    @JsonProperty("alfaErrorCode") 
    public String getAlfaErrorCode() { 
		 return this.alfaErrorCode; } 
    public void setAlfaErrorCode(String alfaErrorCode) { 
		 this.alfaErrorCode = alfaErrorCode; } 
    String alfaErrorCode;
    @JsonProperty("logger") 
    public Logger getLogger() { 
		 return this.logger; } 
    public void setLogger(Logger logger) { 
		 this.logger = logger; } 
    Logger logger;
    @JsonProperty("requestedSupportingDocuments") 
    public RequestedSupportingDocuments getRequestedSupportingDocuments() { 
		 return this.requestedSupportingDocuments; } 
    public void setRequestedSupportingDocuments(RequestedSupportingDocuments requestedSupportingDocuments) { 
		 this.requestedSupportingDocuments = requestedSupportingDocuments; } 
    RequestedSupportingDocuments requestedSupportingDocuments;
    @JsonProperty("action") 
    public String getAction() { 
		 return this.action; } 
    public void setAction(String action) { 
		 this.action = action; } 
    String action;
    @JsonProperty("fraudAssessmentDetails") 
    public FraudAssessmentDetails getFraudAssessmentDetails() { 
		 return this.fraudAssessmentDetails; } 
    public void setFraudAssessmentDetails(FraudAssessmentDetails fraudAssessmentDetails) { 
		 this.fraudAssessmentDetails = fraudAssessmentDetails; } 
    FraudAssessmentDetails fraudAssessmentDetails;
    @JsonProperty("notesFromAlfa") 
    public NotesFromAlfa getNotesFromAlfa() { 
		 return this.notesFromAlfa; } 
    public void setNotesFromAlfa(NotesFromAlfa notesFromAlfa) { 
		 this.notesFromAlfa = notesFromAlfa; } 
    NotesFromAlfa notesFromAlfa;
    @JsonProperty("VAFFraudReferralsRq") 
    public VAFFraudReferralsRq getVAFFraudReferralsRq() { 
		 return this.vAFFraudReferralsRq; } 
    public void setVAFFraudReferralsRq(VAFFraudReferralsRq vAFFraudReferralsRq) { 
		 this.vAFFraudReferralsRq = vAFFraudReferralsRq; } 
    VAFFraudReferralsRq vAFFraudReferralsRq;
    @JsonProperty("uploadDocDetailNewKey") 
    public String getUploadDocDetailNewKey() { 
		 return this.uploadDocDetailNewKey; } 
    public void setUploadDocDetailNewKey(String uploadDocDetailNewKey) { 
		 this.uploadDocDetailNewKey = uploadDocDetailNewKey; } 
    String uploadDocDetailNewKey;
    @JsonProperty("SupportTeam") 
    public String getSupportTeam() { 
		 return this.supportTeam; } 
    public void setSupportTeam(String supportTeam) { 
		 this.supportTeam = supportTeam; } 
    String supportTeam;
    @JsonProperty("scoreCardRes") 
    public ScoreCardRes getScoreCardRes() { 
		 return this.scoreCardRes; } 
    public void setScoreCardRes(ScoreCardRes scoreCardRes) { 
		 this.scoreCardRes = scoreCardRes; } 
    ScoreCardRes scoreCardRes;
}

public class ScoreCardRes{
    @JsonProperty("ApplicationData") 
    public ApplicationData getApplicationData() { 
		 return this.applicationData; } 
    public void setApplicationData(ApplicationData applicationData) { 
		 this.applicationData = applicationData; } 
    ApplicationData applicationData;
    @JsonProperty("ResponseData") 
    public ResponseData getResponseData() { 
		 return this.responseData; } 
    public void setResponseData(ResponseData responseData) { 
		 this.responseData = responseData; } 
    ResponseData responseData;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class TelephoneBusiness{
    @JsonProperty("telephoneCode") 
    public String getTelephoneCode() { 
		 return this.telephoneCode; } 
    public void setTelephoneCode(String telephoneCode) { 
		 this.telephoneCode = telephoneCode; } 
    String telephoneCode;
    @JsonProperty("telephoneNumber") 
    public String getTelephoneNumber() { 
		 return this.telephoneNumber; } 
    public void setTelephoneNumber(String telephoneNumber) { 
		 this.telephoneNumber = telephoneNumber; } 
    String telephoneNumber;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class TelephoneCell{
    @JsonProperty("telephoneCode") 
    public String getTelephoneCode() { 
		 return this.telephoneCode; } 
    public void setTelephoneCode(String telephoneCode) { 
		 this.telephoneCode = telephoneCode; } 
    String telephoneCode;
    @JsonProperty("telephoneNumber") 
    public String getTelephoneNumber() { 
		 return this.telephoneNumber; } 
    public void setTelephoneNumber(String telephoneNumber) { 
		 this.telephoneNumber = telephoneNumber; } 
    String telephoneNumber;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class TelephoneHome{
    @JsonProperty("telephoneCode") 
    public String getTelephoneCode() { 
		 return this.telephoneCode; } 
    public void setTelephoneCode(String telephoneCode) { 
		 this.telephoneCode = telephoneCode; } 
    String telephoneCode;
    @JsonProperty("telephoneNumber") 
    public String getTelephoneNumber() { 
		 return this.telephoneNumber; } 
    public void setTelephoneNumber(String telephoneNumber) { 
		 this.telephoneNumber = telephoneNumber; } 
    String telephoneNumber;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class UploadDocDetailNew{
    @JsonProperty("documents") 
    public Documents getDocuments() { 
		 return this.documents; } 
    public void setDocuments(Documents documents) { 
		 this.documents = documents; } 
    Documents documents;
    @JsonProperty("notes") 
    public Notes getNotes() { 
		 return this.notes; } 
    public void setNotes(Notes notes) { 
		 this.notes = notes; } 
    Notes notes;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class UseCustInfo{
    @JsonProperty("selected") 
    public ArrayList<Object> getSelected() { 
		 return this.selected; } 
    public void setSelected(ArrayList<Object> selected) { 
		 this.selected = selected; } 
    ArrayList<Object> selected;
    @JsonProperty("items") 
    public ArrayList<String> getItems() { 
		 return this.items; } 
    public void setItems(ArrayList<String> items) { 
		 this.items = items; } 
    ArrayList<String> items;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class VAFfraudAssessment{
    @JsonProperty("applicationData") 
    public ApplicationData getApplicationData() { 
		 return this.applicationData; } 
    public void setApplicationData(ApplicationData applicationData) { 
		 this.applicationData = applicationData; } 
    ApplicationData applicationData;
    @JsonProperty("fraudCheckBPMData") 
    public FraudCheckBPMData getFraudCheckBPMData() { 
		 return this.fraudCheckBPMData; } 
    public void setFraudCheckBPMData(FraudCheckBPMData fraudCheckBPMData) { 
		 this.fraudCheckBPMData = fraudCheckBPMData; } 
    FraudCheckBPMData fraudCheckBPMData;
    @JsonProperty("Notes") 
    public Notes getNotes() { 
		 return this.notes; } 
    public void setNotes(Notes notes) { 
		 this.notes = notes; } 
    Notes notes;
    @JsonProperty("documentIDList") 
    public DocumentIDList getDocumentIDList() { 
		 return this.documentIDList; } 
    public void setDocumentIDList(DocumentIDList documentIDList) { 
		 this.documentIDList = documentIDList; } 
    DocumentIDList documentIDList;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

public class VAFFraudReferralsRq{
    @JsonProperty("applicationData") 
    public ApplicationData getApplicationData() { 
		 return this.applicationData; } 
    public void setApplicationData(ApplicationData applicationData) { 
		 this.applicationData = applicationData; } 
    ApplicationData applicationData;
    @JsonProperty("fraudCheckBPMData") 
    public FraudCheckBPMData getFraudCheckBPMData() { 
		 return this.fraudCheckBPMData; } 
    public void setFraudCheckBPMData(FraudCheckBPMData fraudCheckBPMData) { 
		 this.fraudCheckBPMData = fraudCheckBPMData; } 
    FraudCheckBPMData fraudCheckBPMData;
    @JsonProperty("Notes") 
    public Notes getNotes() { 
		 return this.notes; } 
    public void setNotes(Notes notes) { 
		 this.notes = notes; } 
    Notes notes;
    @JsonProperty("documentIDList") 
    public DocumentIDList getDocumentIDList() { 
		 return this.documentIDList; } 
    public void setDocumentIDList(DocumentIDList documentIDList) { 
		 this.documentIDList = documentIDList; } 
    DocumentIDList documentIDList;
    @JsonProperty("@metadata") 
    public Metadata get@metadata() { 
		 return this.@metadata; } 
    public void set@metadata(Metadata @metadata) { 
		 this.@metadata = @metadata; } 
    Metadata @metadata;
}

