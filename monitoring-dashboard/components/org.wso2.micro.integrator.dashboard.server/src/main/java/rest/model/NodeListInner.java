package rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;

public class NodeListInner   {
  private @Valid String id = null;
  private @Valid Boolean isActive = null;
  private @Valid List<KeyValue> details = new ArrayList<KeyValue>();

  /**
   * node id.
   **/
  public NodeListInner id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "node id.")
  @JsonProperty("id")

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Is node active.
   **/
  public NodeListInner isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  
  @ApiModelProperty(value = "Is node active.")
  @JsonProperty("isActive")

  public Boolean isIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * Array contains role, upTime, serverName, serverVersion, miHome, javaHome, javaVersion, javaVendor, osName
   **/
  public NodeListInner details(List<KeyValue> details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "Array contains role, upTime, serverName, serverVersion, miHome, javaHome, javaVersion, javaVendor, osName")
  @JsonProperty("details")

  public List<KeyValue> getDetails() {
    return details;
  }
  public void setDetails(List<KeyValue> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeListInner nodeListInner = (NodeListInner) o;
    return Objects.equals(id, nodeListInner.id) &&
        Objects.equals(isActive, nodeListInner.isActive) &&
        Objects.equals(details, nodeListInner.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActive, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeListInner {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}