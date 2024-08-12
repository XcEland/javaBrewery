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
