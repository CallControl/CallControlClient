(ns call-control-api.api.enterprise-api
  (:require [call-control-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn enterprise-api-get-block-list-with-http-info
  "Enterprise  GET: GetBlockList
            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
  All 
            Try with api_key 'demo' for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234"
  ([] (enterprise-api-get-block-list-with-http-info nil))
  ([{:keys [cached ]}]
   (call-api "/api/2015-11-01/Enterprise/GetBlockList" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"cached" cached }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/json" "application/xml" "text/xml"]
              :auth-names    []})))

(defn enterprise-api-get-block-list
  "Enterprise  GET: GetBlockList
            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
  All 
            Try with api_key 'demo' for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234"
  ([] (enterprise-api-get-block-list nil))
  ([optional-params]
   (:data (enterprise-api-get-block-list-with-http-info optional-params))))

(defn enterprise-api-get-user-with-http-info
  "Enterprise  GET: GetUser
            Returns the current information from the user
  "
  [phone-number ]
  (call-api "/api/2015-11-01/Enterprise/GetUser/{phoneNumber}" :get
            {:path-params   {"phoneNumber" phone-number }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "text/json" "application/xml" "text/xml"]
             :auth-names    []}))

(defn enterprise-api-get-user
  "Enterprise  GET: GetUser
            Returns the current information from the user
  "
  [phone-number ]
  (:data (enterprise-api-get-user-with-http-info phone-number)))

(defn enterprise-api-should-block-with-http-info
  "Enterprise  GET: ShouldBlock
            Simple Enteprise which returns a call block proceed decision.
  This returns information required to perform basic call blocking behaviors
            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)"
  [phone-number user-phone-number ]
  (call-api "/api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber}" :get
            {:path-params   {"phoneNumber" phone-number "userPhoneNumber" user-phone-number }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "text/json" "application/xml" "text/xml"]
             :auth-names    []}))

(defn enterprise-api-should-block
  "Enterprise  GET: ShouldBlock
            Simple Enteprise which returns a call block proceed decision.
  This returns information required to perform basic call blocking behaviors
            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)"
  [phone-number user-phone-number ]
  (:data (enterprise-api-should-block-with-http-info phone-number user-phone-number)))

(defn enterprise-api-upsert-user-with-http-info
  ""
  [user ]
  (call-api "/api/2015-11-01/Enterprise/UpsertUser" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types ["application/json" "text/json" "application/xml" "text/xml" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "text/json" "application/xml" "text/xml"]
             :auth-names    []}))

(defn enterprise-api-upsert-user
  ""
  [user ]
  (:data (enterprise-api-upsert-user-with-http-info user)))
