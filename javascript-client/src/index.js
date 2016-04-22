(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['./ApiClient', './model/CallControlUser', './model/CallReport', './model/Complaints', './model/ModelObject', './model/QuietHour', './model/Reputation', './api/ComplaintsApi', './api/EnterpriseApiApi', './api/ReputationApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/CallControlUser'), require('./model/CallReport'), require('./model/Complaints'), require('./model/ModelObject'), require('./model/QuietHour'), require('./model/Reputation'), require('./api/ComplaintsApi'), require('./api/EnterpriseApiApi'), require('./api/ReputationApi'));
  }
}(function(ApiClient, CallControlUser, CallReport, Complaints, ModelObject, QuietHour, Reputation, ComplaintsApi, EnterpriseApiApi, ReputationApi) {
  'use strict';

  /**
   * API for blocking phone calls with Call Control. Data is from crowdsourced community blacklist from 12+ million users and government agencies (FTC, FCC, IRS) Try with api_key &#39;demo&#39;, hit explore above, and then try phone numbers 18008472911,13157244022,17275567300,18008276655,12061231234..<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var CallControlApi = require('./index'); // See note below*.
   * var xxxSvc = new CallControlApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new CallControlApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['./index'], function(){...}) and put the application logic within the
   * callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new CallControlApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new CallControlApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 2015-11-01
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The CallControlUser model constructor.
     * @property {module:model/CallControlUser}
     */
    CallControlUser: CallControlUser,
    /**
     * The CallReport model constructor.
     * @property {module:model/CallReport}
     */
    CallReport: CallReport,
    /**
     * The Complaints model constructor.
     * @property {module:model/Complaints}
     */
    Complaints: Complaints,
    /**
     * The ModelObject model constructor.
     * @property {module:model/ModelObject}
     */
    ModelObject: ModelObject,
    /**
     * The QuietHour model constructor.
     * @property {module:model/QuietHour}
     */
    QuietHour: QuietHour,
    /**
     * The Reputation model constructor.
     * @property {module:model/Reputation}
     */
    Reputation: Reputation,
    /**
     * The ComplaintsApi service constructor.
     * @property {module:api/ComplaintsApi}
     */
    ComplaintsApi: ComplaintsApi,
    /**
     * The EnterpriseApiApi service constructor.
     * @property {module:api/EnterpriseApiApi}
     */
    EnterpriseApiApi: EnterpriseApiApi,
    /**
     * The ReputationApi service constructor.
     * @property {module:api/ReputationApi}
     */
    ReputationApi: ReputationApi
  };

  return exports;
}));
