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
