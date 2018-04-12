package com.black.tea.cxf.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-04-12T11:12:35.334+08:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://server.cxf.tea.black.com/", name = "WeatherInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface WeatherInterface {

    @WebMethod(operationName = "QueryWeather")
    @RequestWrapper(localName = "QueryWeather", targetNamespace = "http://server.cxf.tea.black.com/", className = "com.black.tea.cxf.weather.QueryWeather")
    @ResponseWrapper(localName = "QueryWeatherResponse", targetNamespace = "http://server.cxf.tea.black.com/", className = "com.black.tea.cxf.weather.QueryWeatherResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String queryWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
