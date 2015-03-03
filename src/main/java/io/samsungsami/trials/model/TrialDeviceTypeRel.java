package io.samsungsami.trials.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialDeviceTypeRel  {
  
  private String dtid = null;
  private String tid = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("dtid")
  public String getDtid() {
    return dtid;
  }
  public void setDtid(String dtid) {
    this.dtid = dtid;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialDeviceTypeRel {\n");
    
    sb.append("  dtid: ").append(dtid).append("\n");
    sb.append("  tid: ").append(tid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
