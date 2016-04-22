(defproject clojurewerkz/machine_head "1.0.0-beta10-SNAPSHOT"
  :description "Clojure MQTT client"
  :dependencies [[org.clojure/clojure                             "1.8.0"]
                 [org.eclipse.paho/org.eclipse.paho.client.mqttv3 "1.0.2"]
                 [clojurewerkz/support                            "1.1.0"]]
  :profiles {:1.7 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :master {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :dev {:resource-paths ["test/resources"]
                   :plugins [[codox "0.8.10"]]
                   :codox {:sources ["src/clojure"]
                           :output-dir "doc/api"}}}
  :aliases {"all" ["with-profile" "dev:dev,1.7:dev,master"]}
  :repositories {"eclipse-paho" {:url "https://repo.eclipse.org/content/repositories/paho-releases/"
                                 :snapshots false
                                 :releases {:checksum :fail}}
                 "sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail :update :always}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :javac-options      ["-target" "1.8" "-source" "1.8"]
  :jvm-opts           ["-Dfile.encoding=utf-8"]
  :source-paths       ["src/clojure"]
  :java-source-paths  ["src/java"])
