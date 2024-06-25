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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ContentsExpanded
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-25T15:49:43.145836023+02:00[Europe/Brussels]")

public class ContentsExpanded {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("drs_uri")
  private List<String> drsUri = null;

  @SerializedName("contents")
  private List<String> contents = null;

  public ContentsExpanded name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name declared by the bundle author that must be used when materialising this object,         overriding any name directly associated with the object itself.         The name must be unique with the containing bundle.         This string is made up of uppercase and lowercase letters, decimal digits, hypen, period, and underscore [A-Za-z0-9.-_].         See http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap03.html#tag_03_282[portable filenames].
   * @return name
  **/
  @Schema(required = true, description = "A name declared by the bundle author that must be used when materialising this object,         overriding any name directly associated with the object itself.         The name must be unique with the containing bundle.         This string is made up of uppercase and lowercase letters, decimal digits, hypen, period, and underscore [A-Za-z0-9.-_].         See http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap03.html#tag_03_282[portable filenames].")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContentsExpanded id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A DRS identifier of a &#x60;&#x60;&#x60;DrsObject&#x60;&#x60;&#x60; (either a single blob or a nested bundle).         If this &#x60;&#x60;&#x60;ContentsObject&#x60;&#x60;&#x60; is an object within a nested bundle, then the id is optional.         Otherwise, the id is required.
   * @return id
  **/
  @Schema(description = "A DRS identifier of a ```DrsObject``` (either a single blob or a nested bundle).         If this ```ContentsObject``` is an object within a nested bundle, then the id is optional.         Otherwise, the id is required.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContentsExpanded drsUri(List<String> drsUri) {
    this.drsUri = drsUri;
    return this;
  }

  public ContentsExpanded addDrsUriItem(String drsUriItem) {
    if (this.drsUri == null) {
      this.drsUri = new ArrayList<String>();
    }
    this.drsUri.add(drsUriItem);
    return this;
  }

   /**
   * A list of full DRS identifier URI paths that may be used to obtain the object.         These URIs may be external to this DRS instance.
   * @return drsUri
  **/
  @Schema(description = "A list of full DRS identifier URI paths that may be used to obtain the object.         These URIs may be external to this DRS instance.")
  public List<String> getDrsUri() {
    return drsUri;
  }

  public void setDrsUri(List<String> drsUri) {
    this.drsUri = drsUri;
  }

  public ContentsExpanded contents(List<String> contents) {
    this.contents = contents;
    return this;
  }

  public ContentsExpanded addContentsItem(String contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<String>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * If this ContentsObject describes a nested bundle and the caller specified \&quot;?expand&#x3D;true\&quot; on the request,         then this contents array must be present and describe the objects within the nested bundle.
   * @return contents
  **/
  @Schema(description = "If this ContentsObject describes a nested bundle and the caller specified \"?expand=true\" on the request,         then this contents array must be present and describe the objects within the nested bundle.")
  public List<String> getContents() {
    return contents;
  }

  public void setContents(List<String> contents) {
    this.contents = contents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsExpanded contentsExpanded = (ContentsExpanded) o;
    return Objects.equals(this.name, contentsExpanded.name) &&
        Objects.equals(this.id, contentsExpanded.id) &&
        Objects.equals(this.drsUri, contentsExpanded.drsUri) &&
        Objects.equals(this.contents, contentsExpanded.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, drsUri, contents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsExpanded {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    drsUri: ").append(toIndentedString(drsUri)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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