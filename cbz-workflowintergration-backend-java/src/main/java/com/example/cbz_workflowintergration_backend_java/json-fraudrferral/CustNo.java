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
