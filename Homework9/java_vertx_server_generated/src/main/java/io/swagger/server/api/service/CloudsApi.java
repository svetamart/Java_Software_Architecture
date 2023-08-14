package io.swagger.server.api.service;

import io.swagger.server.api.model.Cloud;
import io.swagger.server.api.model.Clouds;
import io.swagger.server.api.model.Error;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface CloudsApi  {

    String WEBSERVICE_ADDRESS_CLOUDSAPI = "";
    String OPERATION_ID_CANCELCLOUDBYID = "cancelCloudByID";
    String OPERATION_ID_CREATECLOUD = "createCloud";
    String OPERATION_ID_GETALLCLOUDS = "getAllClouds";
    String OPERATION_ID_GETCLOUDBYID = "getCloudByID";
    String OPERATION_ID_UPDATECLOUDBYID = "updateCloudByID";

    void cancelCloudByID(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void createCloud(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getAllClouds(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getCloudByID(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateCloudByID(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
