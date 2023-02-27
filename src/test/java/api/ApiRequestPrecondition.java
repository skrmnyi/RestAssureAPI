package api;

import java.util.HashMap;
import java.util.Map;

public class ApiRequestPrecondition {
    public static Map<String, Object> requestBody = new HashMap<>();
    public static Map<String, Object> methodProperties = new HashMap<>();

    public void setValidRequestBodyParameters(String city, String pageNumber, boolean isNpLocated, String quantityOfSearchedCities) {

        methodProperties.put(ApiParameters.CITY.getParameter(), city);
        methodProperties.put(ApiParameters.PAGE_NUMBER.getParameter(), pageNumber);
        String npParameter = (isNpLocated == true) ? "1" : "0";
        methodProperties.put(ApiParameters.NP_BRUNCH.getParameter(), npParameter);
        methodProperties.put(ApiParameters.RETURNED_LIMIT.getParameter(), quantityOfSearchedCities);

        requestBody.put(ApiParameters.KEY.getParameter(), ApiParameters.KEY.getParameterValue());
        requestBody.put(ApiParameters.MODEL_NAME.getParameter(), ApiParameters.MODEL_NAME.getParameterValue());
        requestBody.put(ApiParameters.CALLED_METHOD.getParameter(), ApiParameters.CALLED_METHOD.getParameterValue());
        requestBody.put(ApiParameters.SYSTEM.getParameter(), ApiParameters.SYSTEM.getParameterValue());
        requestBody.put(ApiParameters.PAGE_NUMBER.getParameter(), pageNumber);
        requestBody.put(ApiParameters.METHOD_PROPERTIES.getParameter(), methodProperties);
    }

    public void setRequestBodyParametersWithoutCity(String pageNumber, boolean isNpLocated, String quantityOfSearchedCities) {

        methodProperties.put(ApiParameters.PAGE_NUMBER.getParameter(), pageNumber);
        String npParameter = (isNpLocated == true) ? "1" : "0";
        methodProperties.put(ApiParameters.NP_BRUNCH.getParameter(), npParameter);
        methodProperties.put(ApiParameters.RETURNED_LIMIT.getParameter(), quantityOfSearchedCities);

        requestBody.put(ApiParameters.KEY.getParameter(), ApiParameters.KEY.getParameterValue());
//        requestBody.put(ApiParameters.MODEL_NAME.getParameter(), ApiParameters.MODEL_NAME.getParameterValue());
        requestBody.put(ApiParameters.CALLED_METHOD.getParameter(), ApiParameters.CALLED_METHOD.getParameterValue());
        requestBody.put(ApiParameters.SYSTEM.getParameter(), ApiParameters.SYSTEM.getParameterValue());
        requestBody.put(ApiParameters.PAGE_NUMBER.getParameter(), pageNumber);
        requestBody.put(ApiParameters.METHOD_PROPERTIES.getParameter(), methodProperties);
    }

    public void setNonValidRequestBodyParameters(Object city, Object pageNumber, Object isNpLocated, Object quantityOfSearchedCities) {

        methodProperties.put(ApiParameters.CITY.getParameter(), city);
        methodProperties.put(ApiParameters.PAGE_NUMBER.getParameter(), pageNumber);
        methodProperties.put(ApiParameters.NP_BRUNCH.getParameter(), isNpLocated);
        methodProperties.put(ApiParameters.RETURNED_LIMIT.getParameter(), quantityOfSearchedCities);

        requestBody.put(ApiParameters.KEY.getParameter(), ApiParameters.KEY.getParameterValue());
        requestBody.put(ApiParameters.MODEL_NAME.getParameter(), ApiParameters.MODEL_NAME.getParameterValue());
        requestBody.put(ApiParameters.CALLED_METHOD.getParameter(), ApiParameters.CALLED_METHOD.getParameterValue());
        requestBody.put(ApiParameters.SYSTEM.getParameter(), ApiParameters.SYSTEM.getParameterValue());
        requestBody.put(ApiParameters.PAGE_NUMBER.getParameter(), pageNumber);
        requestBody.put(ApiParameters.METHOD_PROPERTIES.getParameter(), methodProperties);
    }
}
