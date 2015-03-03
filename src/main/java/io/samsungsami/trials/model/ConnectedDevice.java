package io.samsungsami.trials.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ConnectedDevice  {
  
  private Long connected_on = null;
  private String dtid = null;
  private String id = null;
  private Integer manifestVersion = null;
  private String manifestVersionPolicy = null;
  private String name = null;
  private String uid = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("connected_on")
  public Long getConnected_on() {
    return connected_on;
  }
  public void setConnected_on(Long connected_on) {
    this.connected_on = connected_on;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("dtid")
  public String getDtid() {
    return dtid;
  }
  public void setDtid(String dtid) {
    this.dtid = dtid;
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
  @JsonProperty("manifestVersion")
  public Integer getManifestVersion() {
    return manifestVersion;
  }
  public void setManifestVersion(Integer manifestVersion) {
    this.manifestVersion = manifestVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("manifestVersionPolicy")
  public String getManifestVersionPolicy() {
    return manifestVersionPolicy;
  }
  public void setManifestVersionPolicy(String manifestVersionPolicy) {
    this.manifestVersionPolicy = manifestVersionPolicy;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedDevice {\n");
    
    sb.append("  connected_on: ").append(connected_on).append("\n");
    sb.append("  dtid: ").append(dtid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  manifestVersion: ").append(manifestVersion).append("\n");
    sb.append("  manifestVersionPolicy: ").append(manifestVersionPolicy).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
