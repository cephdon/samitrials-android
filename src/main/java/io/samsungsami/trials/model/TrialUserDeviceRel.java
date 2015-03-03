package io.samsungsami.trials.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialUserDeviceRel  {
  
  private String did = null;
  private String tid = null;
  private String uid = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("did")
  public String getDid() {
    return did;
  }
  public void setDid(String did) {
    this.did = did;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }
  public void setTid(String tid) {
    this.tid = tid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialUserDeviceRel {\n");
    
    sb.append("  did: ").append(did).append("\n");
    sb.append("  tid: ").append(tid).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
