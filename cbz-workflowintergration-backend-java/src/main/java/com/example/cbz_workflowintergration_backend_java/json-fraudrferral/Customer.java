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
