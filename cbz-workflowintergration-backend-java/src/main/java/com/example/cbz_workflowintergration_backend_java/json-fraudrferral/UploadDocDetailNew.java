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
