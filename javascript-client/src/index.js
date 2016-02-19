(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['./ApiClient', './model/Complaints', './model/Reputation', './model/CallReport', './api/ComplaintsApi', './api/ReputationApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/Complaints'), require('./model/Reputation'), require('./model/CallReport'), require('./api/ComplaintsApi'), require('./api/ReputationApi'));
  }
}(function(ApiClient, Complaints, Reputation, CallReport, ComplaintsApi, ReputationApi) {
  'use strict';

  return {
    ApiClient: ApiClient,
    Complaints: Complaints,
    Reputation: Reputation,
    CallReport: CallReport,
    ComplaintsApi: ComplaintsApi,
    ReputationApi: ReputationApi
  };
}));
