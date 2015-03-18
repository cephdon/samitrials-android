package io.samsungsami.trials.model;

import io.samsungsami.trials.model.TrialUserDeviceRel;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialUserDeviceRelEnvelope  {
  
  private TrialUserDeviceRel data = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public TrialUserDeviceRel getData() {
    return data;
  }
  public void setData(TrialUserDeviceRel data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialUserDeviceRelEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
