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
