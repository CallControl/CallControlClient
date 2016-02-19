(ns call-control-api.api.complaints
  (:require [call-control-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn complaints-complaints-with-http-info
  "Complaints: Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
  This is the main funciton to get data out of the call control reporting system<br />
            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)"
  [phone-number ]
  (call-api "/api/2015-11-01/Complaints/{phoneNumber}" :get
            {:path-params   {"phoneNumber" phone-number }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "text/json" "application/xml" "text/xml"]
             :auth-names    []}))

(defn complaints-complaints
  "Complaints: Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
  This is the main funciton to get data out of the call control reporting system<br />
            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)"
  [phone-number ]
  (:data (complaints-complaints-with-http-info phone-number)))
