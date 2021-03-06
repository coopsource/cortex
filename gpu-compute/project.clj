(defproject thinktopic/gpu-compute "0.1.0-SNAPSHOT"
  :description "Gpu backend for thinktopic's compute library"
  :url "http://thinktopic.com/cortex"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.bytedeco.javacpp-presets/cuda "7.5-1.2"]
                 [thinktopic/compute "0.1.0-SNAPSHOT"]]

  :plugins [[s3-wagon-private "1.1.2"]]
  :repositories  {"snapshots"  {:url "s3p://thinktopic.jars/snapshots/"
                                :passphrase :env
                                :username :env
                                :releases false}
                  "releases"  {:url "s3p://thinktopic.jars/releases/"
                               :passphrase :env
                               :username :env
                               :snapshots false
                               :sign-releases false}})
