public class RetrieveAccountInfoRes{
    @JsonProperty("AccountResponseInfo") 
    public AccountResponseInfo accountResponseInfo;
    public Status status;
    @JsonProperty("MsgRsHdr") 
    public MsgRsHdr msgRsHdr;
    public Metadata @metadata;
}
