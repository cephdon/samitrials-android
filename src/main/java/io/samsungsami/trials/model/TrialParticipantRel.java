package io.samsungsami.trials.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialParticipantRel  {
  
  private String tid = null;
  private String uid = null;

  
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
    sb.append("class TrialParticipantRel {\n");
    
    sb.append("  tid: ").append(tid).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
