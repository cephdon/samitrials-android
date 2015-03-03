package io.samsungsami.trials.model;

import io.samsungsami.trials.model.TrialGroupType;
import java.util.Date;
import io.samsungsami.trials.model.TrialInvitationStatus;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialInvitation  {
  
  private Date acceptedDate = null;
  private String email = null;
  private Date expirationDate = null;
  private String id = null;
  private TrialGroupType invitationType = null;
  private Date revokedDate = null;
  private Date sentDate = null;
  private TrialInvitationStatus status = null;
  private String tid = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("acceptedDate")
  public Date getAcceptedDate() {
    return acceptedDate;
  }
  public void setAcceptedDate(Date acceptedDate) {
    this.acceptedDate = acceptedDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("invitationType")
  public TrialGroupType getInvitationType() {
    return invitationType;
  }
  public void setInvitationType(TrialGroupType invitationType) {
    this.invitationType = invitationType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("revokedDate")
  public Date getRevokedDate() {
    return revokedDate;
  }
  public void setRevokedDate(Date revokedDate) {
    this.revokedDate = revokedDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("sentDate")
  public Date getSentDate() {
    return sentDate;
  }
  public void setSentDate(Date sentDate) {
    this.sentDate = sentDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("status")
  public TrialInvitationStatus getStatus() {
    return status;
  }
  public void setStatus(TrialInvitationStatus status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }
  public void setTid(String tid) {
    this.tid = tid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialInvitation {\n");
    
    sb.append("  acceptedDate: ").append(acceptedDate).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  invitationType: ").append(invitationType).append("\n");
    sb.append("  revokedDate: ").append(revokedDate).append("\n");
    sb.append("  sentDate: ").append(sentDate).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  tid: ").append(tid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
