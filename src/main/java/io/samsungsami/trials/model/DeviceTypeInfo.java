package io.samsungsami.trials.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class DeviceTypeInfo  {
  
  private String dtid = null;

  
  /**
   * Device Type ID.
   **/
  @ApiModelProperty(required = true, value = "Device Type ID.")
  @JsonProperty("dtid")
  public String getDtid() {
    return dtid;
  }
  public void setDtid(String dtid) {
    this.dtid = dtid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypeInfo {\n");
    
    sb.append("  dtid: ").append(dtid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
