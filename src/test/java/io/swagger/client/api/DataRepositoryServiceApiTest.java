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

package io.swagger.client.api;

import io.swagger.client.model.AccessURL;
import io.swagger.client.model.BasicResponse;
import io.swagger.client.model.DrsObject;
import io.swagger.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DataRepositoryServiceApi
 */
@Ignore
public class DataRepositoryServiceApiTest {

    private final DataRepositoryServiceApi api = new DataRepositoryServiceApi();

    /**
     * Delete a DrsObject
     *
     * Delete a &#x60;&#x60;&#x60;DrsObject&#x60;&#x60;&#x60; index entry
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteObjectGa4ghDrsV1ObjectsObjectIdDeleteTest() throws Exception {
        String objectId = null;
        BasicResponse response = api.deleteObjectGa4ghDrsV1ObjectsObjectIdDelete(objectId);

        // TODO: test validations
    }
    /**
     * Query DrsObjects on alias
     *
     * Returns all objects that correspond to the list of aliases passed through         the request. The query is regex compatible.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getObjectAliasGa4ghDrsV1ObjectsGetTest() throws Exception {
        List<String> alias = null;
        List<DrsObject> response = api.getObjectAliasGa4ghDrsV1ObjectsGet(alias);

        // TODO: test validations
    }
    /**
     * Get a URL for fetching bytes
     *
     * Returns a URL that can be used to fetch the bytes of a &#x60;DrsObject&#x60;.                     This method only needs to be called when using an &#x60;AccessMethod&#x60; that contains an &#x60;access_id&#x60;                     (e.g., for servers that use signed URLs for fetching object bytes).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGetTest() throws Exception {
        String objectId = null;
        String accessId = null;
        AccessURL response = api.getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGet(objectId, accessId);

        // TODO: test validations
    }
    /**
     * Retrieve a DrsObject
     *
     * Returns object metadata, and a list of access methods that can be used to fetch object bytes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getObjectGa4ghDrsV1ObjectsObjectIdGetTest() throws Exception {
        String objectId = null;
        Boolean expand = null;
        DrsObject response = api.getObjectGa4ghDrsV1ObjectsObjectIdGet(objectId, expand);

        // TODO: test validations
    }
    /**
     * Create a new DrsObject
     *
     * POST a requested ID to create an object that corresponds to this ID
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postObjectGa4ghDrsV1ObjectsPostTest() throws Exception {
        DrsObject body = null;
        BasicResponse response = api.postObjectGa4ghDrsV1ObjectsPost(body);

        // TODO: test validations
    }
    /**
     * Update a DrsObject
     *
     * Update the &#x60;&#x60;&#x60;DrsObject&#x60;&#x60;&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putObjectGa4ghDrsV1ObjectsObjectIdPutTest() throws Exception {
        DrsObject body = null;
        String objectId = null;
        BasicResponse response = api.putObjectGa4ghDrsV1ObjectsObjectIdPut(body, objectId);

        // TODO: test validations
    }
}
