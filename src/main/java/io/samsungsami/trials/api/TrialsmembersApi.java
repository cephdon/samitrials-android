package io.samsungsami.trials.api;

import io.samsungsami.trials.client.ApiException;
import io.samsungsami.trials.client.ApiInvoker;

import io.samsungsami.trials.model.*;

import java.util.*;

import io.samsungsami.trials.model.TrialAdministratorsEnvelope;
import io.samsungsami.trials.model.TrialParticipantRel;
import io.samsungsami.trials.model.TrialInvitationsEnvelope;
import io.samsungsami.trials.model.TrialInvitationInfo;
import io.samsungsami.trials.model.TrialInvitation;
import io.samsungsami.trials.model.TrialInvitationStatusInfo;
import io.samsungsami.trials.model.TrialParticipantsEnvelope;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class TrialsmembersApi {
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

  
  
  public TrialAdministratorsEnvelope  getTrialAdministrators (String trialId, Integer count, Integer offset) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/api/trials/{trialId}/administrators".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialAdministratorsEnvelope) ApiInvoker.deserialize(response, "", TrialAdministratorsEnvelope.class);
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
  
  
  public TrialParticipantRel  deleteTrialAdministrator (String trialId, String userId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/api/trials/{trialId}/administrators/{userId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString())).replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialParticipantRel) ApiInvoker.deserialize(response, "", TrialParticipantRel.class);
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
  
  
  public TrialInvitationsEnvelope  getTrialInvitations (String trialId, String status, Integer count, Integer offset) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/api/trials/{trialId}/invitations".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(trialId)))
      queryParams.put("trialId", String.valueOf(trialId));
    if(!"null".equals(String.valueOf(status)))
      queryParams.put("status", String.valueOf(status));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialInvitationsEnvelope) ApiInvoker.deserialize(response, "", TrialInvitationsEnvelope.class);
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
  
  
  public TrialInvitation  createTrialInvitation (String trialId, TrialInvitationInfo ) throws ApiException {
    Object postBody = ;

    

    // create path and map variables
    String path = "/api/trials/{trialId}/invitations".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialInvitation) ApiInvoker.deserialize(response, "", TrialInvitation.class);
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
  
  
  public TrialInvitation  updateTrialInvitation (String trialId, String invitationId, TrialInvitationStatusInfo ) throws ApiException {
    Object postBody = ;

    

    // create path and map variables
    String path = "/api/trials/{trialId}/invitations/{invitationId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString())).replaceAll("\\{" + "invitationId" + "\\}", apiInvoker.escapeString(invitationId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialInvitation) ApiInvoker.deserialize(response, "", TrialInvitation.class);
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
  
  
  public TrialInvitation  deleteTrialInvitation (String trialId, String invitationId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/api/trials/{trialId}/invitations/{invitationId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString())).replaceAll("\\{" + "invitationId" + "\\}", apiInvoker.escapeString(invitationId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialInvitation) ApiInvoker.deserialize(response, "", TrialInvitation.class);
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
  
  
  public TrialParticipantsEnvelope  getTrialParticipants (String trialId, Integer count, Integer offset) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/api/trials/{trialId}/participants".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialParticipantsEnvelope) ApiInvoker.deserialize(response, "", TrialParticipantsEnvelope.class);
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
  
  
  public TrialParticipantRel  deleteTrialParticipant (String trialId, String userId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/api/trials/{trialId}/participants/{userId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString())).replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (TrialParticipantRel) ApiInvoker.deserialize(response, "", TrialParticipantRel.class);
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
