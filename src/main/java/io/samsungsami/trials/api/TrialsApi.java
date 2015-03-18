package io.samsungsami.trials.api;

import io.samsungsami.trials.client.ApiException;
import io.samsungsami.trials.client.ApiInvoker;

import io.samsungsami.trials.model.*;

import java.util.*;

import io.samsungsami.trials.model.TrialInfo;
import io.samsungsami.trials.model.TrialEnvelope;
import io.samsungsami.trials.model.TrialUpdateInfo;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class TrialsApi {
  String basePath = "https://api.samsungsami.io/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  
  public TrialEnvelope  createTrial (TrialInfo trialInfo) throws ApiException {
    Object postBody = trialInfo;

    

    // create path and map variables
    String path = "/trials".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialEnvelope) ApiInvoker.deserialize(response, "", TrialEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public TrialEnvelope  getTrial (String trialId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/trials/{trialId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialEnvelope) ApiInvoker.deserialize(response, "", TrialEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public TrialEnvelope  updateTrial (String trialId, TrialUpdateInfo trialInfo) throws ApiException {
    Object postBody = trialInfo;

    

    // create path and map variables
    String path = "/trials/{trialId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialEnvelope) ApiInvoker.deserialize(response, "", TrialEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public TrialEnvelope  deleteTrial (String trialId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/trials/{trialId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialEnvelope) ApiInvoker.deserialize(response, "", TrialEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public TrialEnvelope  updateTrialApplication (String trialId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/trials/{trialId}/application".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialEnvelope) ApiInvoker.deserialize(response, "", TrialEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
}
