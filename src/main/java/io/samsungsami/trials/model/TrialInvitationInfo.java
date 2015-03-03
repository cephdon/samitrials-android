package io.samsungsami.trials.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialInvitationInfo  {
  
  private String email = null;
  public enum InvitationTypeEnum {
     administrator,  participant, 
  };
  private InvitationTypeEnum invitationType = null;

  
  /**
   * Email address of the user
   **/
  @ApiModelProperty(required = true, value = "Email address of the user")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * User role.
   **/
  @ApiModelProperty(required = true, value = "User role.")
  @JsonProperty("invitationType")
  public InvitationTypeEnum getInvitationType() {
    return invitationType;
  }
  public void setInvitationType(InvitationTypeEnum invitationType) {
    this.invitationType = invitationType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialInvitationInfo {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  invitationType: ").append(invitationType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
