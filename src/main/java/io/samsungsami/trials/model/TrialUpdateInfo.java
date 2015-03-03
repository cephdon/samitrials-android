package io.samsungsami.trials.model;

import io.samsungsami.trials.model.TrialStatus;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialUpdateInfo  {
  
  private String description = null;
  private String name = null;
  private TrialStatus status = null;

  
  /**
   * Description of the trial.
   **/
  @ApiModelProperty(required = true, value = "Description of the trial.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Name of the trial.
   **/
  @ApiModelProperty(required = true, value = "Name of the trial.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Status.
   **/
  @ApiModelProperty(required = false, value = "Status.")
  @JsonProperty("status")
  public TrialStatus getStatus() {
    return status;
  }
  public void setStatus(TrialStatus status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialUpdateInfo {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
