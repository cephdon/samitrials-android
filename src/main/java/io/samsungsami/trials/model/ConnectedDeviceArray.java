package io.samsungsami.trials.model;

import io.samsungsami.trials.model.ConnectedDevice;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ConnectedDeviceArray  {
  
  private List<ConnectedDevice> devices = new ArrayList<ConnectedDevice>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("devices")
  public List<ConnectedDevice> getDevices() {
    return devices;
  }
  public void setDevices(List<ConnectedDevice> devices) {
    this.devices = devices;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedDeviceArray {\n");
    
    sb.append("  devices: ").append(devices).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
