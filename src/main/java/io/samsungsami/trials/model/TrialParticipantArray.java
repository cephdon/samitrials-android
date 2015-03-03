package io.samsungsami.trials.model;

import io.samsungsami.trials.model.TrialParticipant;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialParticipantArray  {
  
  private List<TrialParticipant> participants = new ArrayList<TrialParticipant>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("participants")
  public List<TrialParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<TrialParticipant> participants) {
    this.participants = participants;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialParticipantArray {\n");
    
    sb.append("  participants: ").append(participants).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
