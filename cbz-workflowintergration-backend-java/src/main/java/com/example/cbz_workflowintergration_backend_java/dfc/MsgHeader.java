public class MsgHeader{
    @JsonProperty("ContextRsHdr") 
    public ContextRsHdr contextRsHdr;
    @JsonProperty("InteraccountResponseInfo") 
    public InteraccountResponseInfo interaccountResponseInfo;
    public Metadata @metadata;
}
