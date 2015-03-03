package io.samsungsami.trials.model;

import java.util.*;
import io.samsungsami.trials.model.TrialInvitation;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialInvitationArray  {
  
  private List<TrialInvitation> invitations = new ArrayList<TrialInvitation>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("invitations")
  public List<TrialInvitation> getInvitations() {
    return invitations;
  }
  public void setInvitations(List<TrialInvitation> invitations) {
    this.invitations = invitations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialInvitationArray {\n");
    
    sb.append("  invitations: ").append(invitations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
