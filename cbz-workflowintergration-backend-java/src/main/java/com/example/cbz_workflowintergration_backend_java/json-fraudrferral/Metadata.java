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
