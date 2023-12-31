package io.swagger.server.api.service;

import io.swagger.server.api.model.Client;
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
public interface ClientsApi  {

    String WEBSERVICE_ADDRESS_CLIENTSAPI = "";
    String OPERATION_ID_GETALLCLIENTS = "getAllClients";

    void getAllClients(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
