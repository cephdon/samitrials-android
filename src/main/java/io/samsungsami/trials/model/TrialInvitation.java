package io.samsungsami.trials.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialInvitation  {
  
  private Long acceptedDate = null;
  private String email = null;
  private Long expirationDate = null;
  private String id = null;
  private String invitationType = null;
  private Long revokedDate = null;
  private Long sentDate = null;
  private String status = null;
  private String tid = null;
  private String userId = null;

  
  /**
   * acceptedDate
   **/
  @ApiModelProperty(required = false, value = "acceptedDate")
  @JsonProperty("acceptedDate")
  public Long getAcceptedDate() {
    return acceptedDate;
  }
  public void setAcceptedDate(Long acceptedDate) {
    this.acceptedDate = acceptedDate;
  }

  
  /**
   * email
   **/
  @ApiModelProperty(required = false, value = "email")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * expirationDate
   **/
  @ApiModelProperty(required = false, value = "expirationDate")
  @JsonProperty("expirationDate")
  public Long getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   * id
   **/
  @ApiModelProperty(required = false, value = "id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * invitationType
   **/
  @ApiModelProperty(required = false, value = "invitationType")
  @JsonProperty("invitationType")
  public String getInvitationType() {
    return invitationType;
  }
  public void setInvitationType(String invitationType) {
    this.invitationType = invitationType;
  }

  
  /**
   * revokedDate
   **/
  @ApiModelProperty(required = false, value = "revokedDate")
  @JsonProperty("revokedDate")
  public Long getRevokedDate() {
    return revokedDate;
  }
  public void setRevokedDate(Long revokedDate) {
    this.revokedDate = revokedDate;
  }

  
  /**
   * sentDate
   **/
  @ApiModelProperty(required = false, value = "sentDate")
  @JsonProperty("sentDate")
  public Long getSentDate() {
    return sentDate;
  }
  public void setSentDate(Long sentDate) {
    this.sentDate = sentDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * tid
   **/
  @ApiModelProperty(required = false, value = "tid")
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }
  public void setTid(String tid) {
    this.tid = tid;
  }

  
  /**
   * userId
   **/
  @ApiModelProperty(required = false, value = "userId")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
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
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
