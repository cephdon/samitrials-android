package io.samsungsami.trials.model;

import io.samsungsami.trials.model.ManifestSourceTypes;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class DeviceType  {
  
  private String _id = null;
  private Boolean approved = null;
  private String id = null;
  private Long latestVersion = null;
  private String manifest = null;
  private String manifestSource = null;
  private ManifestSourceTypes manifestSourceType = null;
  private String name = null;
  private Boolean published = null;
  private Object requireSecureProtocol = null;
  private String suerDn = null;
  private String uniqueName = null;
  private String userId = null;
  private String vendorId = null;

  
  /**
   * id
   **/
  @ApiModelProperty(required = false, value = "id")
  @JsonProperty("_id")
  public String get_id() {
    return _id;
  }
  public void set_id(String _id) {
    this._id = _id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("approved")
  public Boolean getApproved() {
    return approved;
  }
  public void setApproved(Boolean approved) {
    this.approved = approved;
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
  @JsonProperty("latestVersion")
  public Long getLatestVersion() {
    return latestVersion;
  }
  public void setLatestVersion(Long latestVersion) {
    this.latestVersion = latestVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("manifest")
  public String getManifest() {
    return manifest;
  }
  public void setManifest(String manifest) {
    this.manifest = manifest;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("manifestSource")
  public String getManifestSource() {
    return manifestSource;
  }
  public void setManifestSource(String manifestSource) {
    this.manifestSource = manifestSource;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("manifestSourceType")
  public ManifestSourceTypes getManifestSourceType() {
    return manifestSourceType;
  }
  public void setManifestSourceType(ManifestSourceTypes manifestSourceType) {
    this.manifestSourceType = manifestSourceType;
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
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("requireSecureProtocol")
  public Object getRequireSecureProtocol() {
    return requireSecureProtocol;
  }
  public void setRequireSecureProtocol(Object requireSecureProtocol) {
    this.requireSecureProtocol = requireSecureProtocol;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("suerDn")
  public String getSuerDn() {
    return suerDn;
  }
  public void setSuerDn(String suerDn) {
    this.suerDn = suerDn;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("uniqueName")
  public String getUniqueName() {
    return uniqueName;
  }
  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceType {\n");
    
    sb.append("  _id: ").append(_id).append("\n");
    sb.append("  approved: ").append(approved).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  latestVersion: ").append(latestVersion).append("\n");
    sb.append("  manifest: ").append(manifest).append("\n");
    sb.append("  manifestSource: ").append(manifestSource).append("\n");
    sb.append("  manifestSourceType: ").append(manifestSourceType).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  published: ").append(published).append("\n");
    sb.append("  requireSecureProtocol: ").append(requireSecureProtocol).append("\n");
    sb.append("  suerDn: ").append(suerDn).append("\n");
    sb.append("  uniqueName: ").append(uniqueName).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  vendorId: ").append(vendorId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
