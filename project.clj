(defproject jubei "0.1.0-SNAPSHOT"
  :description "Clojure based utility with initial GraalVM boilerplate settings"
  :url "https://github.com/ier/jubei"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.10.1"]]

  :repl-options {:init-ns jubei.core}

  :main jubei.core

  :uberjar-name "jubei.jar"

  :target-path "target/default"

  :native-image {:name      "jubei"
                 :graal-bin "/opt/graalvm-ce-java11-21.0.0.2/bin"
                 :opts      ["--verbose"
                             "--no-fallback"
                             "--initialize-at-build-time"]}

  :plugins [[io.taylorwood/lein-native-image "0.3.1"]]

  :profiles {:uberjar
             {:aot          :all
              :native-image {:jvm-opts
                             ["-Dclojure.compiler.direct-linking=true"]}}})
