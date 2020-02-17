package org.wso2.apimgt.gateway.cli.constants;

import com.google.common.collect.ImmutableList;

/**
 * Constants for wso2 OpenAPI extensions.
 */
public class OpenAPIConstants {
    public static final String BASEPATH = "x-wso2-basePath";
    public static final String REQUEST_INTERCEPTOR = "x-wso2-request-interceptor";
    public static final String RESPONSE_INTERCEPTOR = "x-wso2-response-interceptor";
    public static final String ENDPOINTS = "x-wso2-endpoints";
    public static final String ENDPOINTS_REFERENCE = "#/x-wso2-endpoints/";
    public static final String PRODUCTION_ENDPOINTS = "x-wso2-production-endpoints";
    public static final String SANDBOX_ENDPOINTS = "x-wso2-sandbox-endpoints";
    public static final String CORS = "x-wso2-cors";
    public static final String THROTTLING_TIER = "x-wso2-throttling-tier";
    public static final String DISABLE_SECURITY = "x-wso2-disable-security";
    public static final String AUTHORIZATION_HEADER = "x-wso2-auth-header";
    public static final String INTERCEPTOR_FUNC_SEPARATOR = ":";
    public static final String INTERCEPTOR_PATH_SEPARATOR = "/";
    public static final String MODULE_IMPORT_STATEMENT_CONSTANT = "as";
    public static final ImmutableList<String> MODULE_IDENTIFIER_LIST = ImmutableList.of("vienna", "canberra",
            "berlin", "athens", "georgetown", "budapest", "jakarta", "rome", "dublin", "tokyo", "bucharest", "moscow",
            "lisbon", "manila", "lima", "oslo", "amsterdam", "kathmandu", "bridgetown", "cairo", "argentina",
            "austria", "belgium", "benin", "cameroon", "sofia", "chile", "chad", "cuba", "cyprus", "denmark",
            "nicosia", "fiji", "greece", "hungary", "laos", "libya", "malawi", "mauritius", "panama", "rabat", "peru",
            "romania", "rwanda", "kigali", "castries", "kingstown", "victoria", "slovenia", "bern");
}
