package io.samsungsami.trials.model;

import io.samsungsami.trials.model.DeviceTypeArray;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class DeviceTypesEnvelope  {
  
  private Integer count = null;
  private DeviceTypeArray data = null;
  private Integer offset = null;
  private Integer total = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public DeviceTypeArray getData() {
    return data;
  }
  public void setData(DeviceTypeArray data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypesEnvelope {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
