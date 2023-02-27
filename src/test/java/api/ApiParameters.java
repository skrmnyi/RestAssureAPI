package api;

public enum ApiParameters {
    KEY("apiKey", "7b3c27088f71fa75df6d10792ac433f8"),
    CITY("FindByString"),
    NP_BRUNCH("Warehouse"),
    PAGE_NUMBER("Page"),
    RETURNED_LIMIT("LIMIT"),
    MODEL_NAME("modelName", "Address"),
    CALLED_METHOD("calledMethod", "getSettlements"),
    SYSTEM("system", "DevCentre"),
    METHOD_PROPERTIES("methodProperties");

    private String parameter;
    private String parameterValue;

    ApiParameters(String parameter, String parameterValue) {
        this.parameter = parameter;
        this.parameterValue = parameterValue;
    }

    ApiParameters(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    public String getParameterValue() {
        return parameterValue;
    }

}



