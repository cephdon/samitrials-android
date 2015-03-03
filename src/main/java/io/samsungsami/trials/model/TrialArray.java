package io.samsungsami.trials.model;

import io.samsungsami.trials.model.Trial;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialArray  {
  
  private List<Trial> deviceTypes = new ArrayList<Trial>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("deviceTypes")
  public List<Trial> getDeviceTypes() {
    return deviceTypes;
  }
  public void setDeviceTypes(List<Trial> deviceTypes) {
    this.deviceTypes = deviceTypes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialArray {\n");
    
    sb.append("  deviceTypes: ").append(deviceTypes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
