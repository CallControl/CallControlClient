(defproject call-control-api "2015-11-01"
  :description "API for blocking phone calls with Call Control. Data is from crowdsourced community blacklist from 12+ million users and government agencies (FTC, FCC, IRS) Try with api_key 'demo', hit explore above, and then try phone numbers 18008472911,13157244022,17275567300,18008276655,12061231234."
  :url "http://callcontrol.com/documentation"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "2.0.0"]
                 [cheshire "5.5.0"]])
