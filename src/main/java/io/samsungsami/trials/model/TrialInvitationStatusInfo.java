package io.samsungsami.trials.model;

import io.samsungsami.trials.model.TrialInvitationUpdateStatus;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialInvitationStatusInfo  {
  
  private TrialInvitationUpdateStatus status = null;

  
  /**
   * Invitation Status.
   **/
  @ApiModelProperty(required = true, value = "Invitation Status.")
  @JsonProperty("status")
  public TrialInvitationUpdateStatus getStatus() {
    return status;
  }
  public void setStatus(TrialInvitationUpdateStatus status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialInvitationStatusInfo {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
