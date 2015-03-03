package io.samsungsami.trials.model;

import io.samsungsami.trials.model.TrialParticipant;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialAdministratorArray  {
  
  private List<TrialParticipant> administrators = new ArrayList<TrialParticipant>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("administrators")
  public List<TrialParticipant> getAdministrators() {
    return administrators;
  }
  public void setAdministrators(List<TrialParticipant> administrators) {
    this.administrators = administrators;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialAdministratorArray {\n");
    
    sb.append("  administrators: ").append(administrators).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
