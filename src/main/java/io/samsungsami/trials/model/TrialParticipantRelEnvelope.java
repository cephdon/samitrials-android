package io.samsungsami.trials.model;

import io.samsungsami.trials.model.TrialParticipantRel;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialParticipantRelEnvelope  {
  
  private TrialParticipantRel data = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public TrialParticipantRel getData() {
    return data;
  }
  public void setData(TrialParticipantRel data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialParticipantRelEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
