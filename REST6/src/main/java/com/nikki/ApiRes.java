package com.nikki;

public class ApiRes {

   private String result;
   private String error;

   private ApiRes() {
   }

   static ApiRes withResult(String resultMessage) {
      ApiRes apiResult = new ApiRes();
      apiResult.result = resultMessage;
      return apiResult;
   }

   static ApiRes withError(String errorMessage) {
      ApiRes apiResult = new ApiRes();
      apiResult.error = errorMessage;
      return apiResult;
   }

   public String getResult() {
      return result;
   }

   public String getError() {
      return error;
   }
}
