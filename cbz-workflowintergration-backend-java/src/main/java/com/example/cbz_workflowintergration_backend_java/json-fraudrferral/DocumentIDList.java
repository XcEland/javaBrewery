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
