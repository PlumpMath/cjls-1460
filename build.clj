(require 'cljs.build.api)

(cljs.build.api/build "src" {:output-to "out/main.js"
                             :main 'strange-loop.core})
