if (typeof module === 'object' && module.exports) {
  var CallControlApi = {};
  
  CallControlApi.DoNotCallComplaints = require('./model/DoNotCallComplaints.js');
  
  CallControlApi.Reputation = require('./model/Reputation.js');
  
  CallControlApi.CallReport = require('./model/CallReport.js');
  
  CallControlApi.ReporterLoation = require('./model/ReporterLoation.js');
  
  
  CallControlApi.ReputationApi = require('./api/ReputationApi.js');
  
  CallControlApi.DoNotCallComplaintsApi = require('./api/DoNotCallComplaintsApi.js');
  
  module.exports = CallControlApi;
}