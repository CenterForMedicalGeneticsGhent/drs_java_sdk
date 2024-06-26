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

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for HealthApi
 */
@Ignore
public class HealthApiTest {

    private final HealthApi api = new HealthApi();

    /**
     * Check if the API is running correctly
     *
     * Health check for the API
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getHealthHealthGetTest() throws Exception {
        Object response = api.getHealthHealthGet();

        // TODO: test validations
    }
}
