/*
 * Data Repository Service
 *  GET request:  - Fetch a DrsObject from the database by sending a unique ID through the request - Fetch an access url to the data which the object refers to - Fetch DrsObjects by doing a search on the aliases  POST request:  - Create a non-existing DrsObject in the database by giving an identifier  DELETE request:  - Delete a DrsObject from the database by unique identifier  PUT request:  - Update an existing DrsObject by unique identifier and the changes in the body 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: ict@cmgg.be
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.client.model.AccessMethods;
import io.swagger.client.model.AccessURL;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * The list of access methods that can be used to fetch the &#x60;&#x60;&#x60;DrsObject&#x60;&#x60;&#x60;. Required for single blobs; optional for bundles.
 */
@Schema(description = "The list of access methods that can be used to fetch the ```DrsObject```. Required for single blobs; optional for bundles.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-25T15:49:43.145836023+02:00[Europe/Brussels]")

public class AllOfDrsObjectAccessMethods extends AccessMethods {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfDrsObjectAccessMethods {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
