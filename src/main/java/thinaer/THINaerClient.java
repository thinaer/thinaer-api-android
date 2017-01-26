/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package thinaer;

import java.util.*;

import thinaer.model.Empty;


@com.amazonaws.mobileconnectors.apigateway.annotation.Service(endpoint = "https://api.thinaer.io/v2")
public interface THINaerClient {


    /**
     * A generic invoker to invoke any API Gateway endpoint.
     * @param request
     * @return ApiResponse
     */
    com.amazonaws.mobileconnectors.apigateway.ApiResponse execute(com.amazonaws.mobileconnectors.apigateway.ApiRequest request);
    
    /**
     * 
     * 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/application", method = "GET")
    Empty applicationGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/application/devices", method = "GET")
    Empty applicationDevicesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/application/gateways", method = "GET")
    Empty applicationGatewaysGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param uid 
     * @param secret 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/application/token", method = "POST")
    Empty applicationTokenPost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "uid", location = "header")
            String uid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "secret", location = "header")
            String secret);
    
    /**
     * 
     * 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/client", method = "GET")
    Empty clientGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/client", method = "POST")
    Empty clientPost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/client/{id}", method = "GET")
    Empty clientIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/client/{id}", method = "PUT")
    Empty clientIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/client/{id}", method = "DELETE")
    Empty clientIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/client/{id}/devices", method = "GET")
    Empty clientIdDevicesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/client/{id}/gateways", method = "GET")
    Empty clientIdGatewaysGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/client/{id}/venues", method = "GET")
    Empty clientIdVenuesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/device/{id}", method = "GET")
    Empty deviceIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/device/{id}", method = "PUT")
    Empty deviceIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/gateway/{id}", method = "GET")
    Empty gatewayIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/gateway/{id}", method = "PUT")
    Empty gatewayIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/gateway/{id}/sees", method = "GET")
    Empty gatewayIdSeesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/venue", method = "GET")
    Empty venueGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/venue", method = "POST")
    Empty venuePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/venue/{id}", method = "GET")
    Empty venueIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/venue/{id}", method = "PUT")
    Empty venueIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/venue/{id}", method = "DELETE")
    Empty venueIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/venue/{id}/devices", method = "GET")
    Empty venueIdDevicesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
    /**
     * 
     * 
     * @param id 
     * @param token 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/venue/{id}/gateways", method = "GET")
    Empty venueIdGatewaysGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
            String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "token", location = "header")
            String token);
    
}

