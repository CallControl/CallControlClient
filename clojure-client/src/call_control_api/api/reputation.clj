(ns call-control-api.api.reputation
  (:require [call-control-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn reputation-report-with-http-info
  "Report: report spam calls received to better tune our algorithms based upon spam calls you receive
  This returns information required to perform basic call blocking behaviors<br />
            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)"
  [call-report ]
  (call-api "/api/2015-11-01/Report" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    call-report
             :content-types ["application/json" "text/json" "application/xml" "text/xml" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "text/json" "application/xml" "text/xml"]
             :auth-names    []}))

(defn reputation-report
  "Report: report spam calls received to better tune our algorithms based upon spam calls you receive
  This returns information required to perform basic call blocking behaviors<br />
            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)"
  [call-report ]
  (:data (reputation-report-with-http-info call-report)))

(defn reputation-reputation-with-http-info
  "Reputation:
            Premium service which returns a reputation informaiton of a phone number via API.
  This returns information required to perform basic call blocking behaviors<br />
            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)"
  [phone-number ]
  (call-api "/api/2015-11-01/Reputation/{phoneNumber}" :get
            {:path-params   {"phoneNumber" phone-number }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "text/json" "application/xml" "text/xml"]
             :auth-names    []}))

(defn reputation-reputation
  "Reputation:
            Premium service which returns a reputation informaiton of a phone number via API.
  This returns information required to perform basic call blocking behaviors<br />
            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)"
  [phone-number ]
  (:data (reputation-reputation-with-http-info phone-number)))
