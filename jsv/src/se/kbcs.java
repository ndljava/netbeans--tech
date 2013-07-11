/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MultivaluedMap;

/**
 *
 * @author Administrator
 */
public class kbcs {

    static class Event_Search_Service_search_JerseyClient {

        private WebResource webResource;
        private Client client;
        private static final String BASE_URI = "http://www.zvents.com/rest";

        public Event_Search_Service_search_JerseyClient() {
            com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
            client = Client.create(config);
            webResource = client.resource(BASE_URI).path("search");
        }

        /**
         * @param responseType Class representing the response
         * @param key query parameter[REQUIRED]
         * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
         * List of optional query parameters:
         * <LI>what [OPTIONAL]
         * <LI>where [OPTIONAL]
         * <LI>when [OPTIONAL]
         * <LI>radius [OPTIONAL]
         * <LI>limit [OPTIONAL]
         * <LI>offset [OPTIONAL]
         * <LI>trim [OPTIONAL]
         * <LI>sort [OPTIONAL]
         * <LI>cat [OPTIONAL]
         * <LI>catex [OPTIONAL]
         * @return response object (instance of responseType class)
         */
        public <T> T searchEvents(Class<T> responseType, String key, String... optionalQueryParams) throws UniformInterfaceException {
            return webResource.queryParam("key", key).queryParams(getQParams(optionalQueryParams)).accept(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
        }

        private MultivaluedMap getQParams(String... optionalParams) {
            MultivaluedMap<String, String> qParams = new com.sun.jersey.api.representation.Form();
            for (String qParam : optionalParams) {
                String[] qPar = qParam.split("=");
                if (qPar.length > 1) {
                    qParams.add(qPar[0], qPar[1]);
                }
            }
            return qParams;
        }

        public void close() {
            client.destroy();
        }
    }
    
}
