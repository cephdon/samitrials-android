package io.samsungsami.trials.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class DeviceInfo  {
  
  private String did = null;

  
  /**
   * Device ID.
   **/
  @ApiModelProperty(required = false, value = "Device ID.")
  @JsonProperty("did")
  public String getDid() {
    return did;
  }
  public void setDid(String did) {
    this.did = did;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInfo {\n");
    
    sb.append("  did: ").append(did).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
