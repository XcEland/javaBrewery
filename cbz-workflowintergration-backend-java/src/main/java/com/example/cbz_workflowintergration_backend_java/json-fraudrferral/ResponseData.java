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
