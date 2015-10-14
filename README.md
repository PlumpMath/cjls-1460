To reproduce, download `cljs.jar` from the Quickstart and then run:

```
java -cp cljs.jar:src clojure.main build.clj
```

from the top directory. You can inspect the compiler's output with:

```
out/
├── cljs
│   ├── core.cljs
│   ├── core.js
│   └── core.js.map
├── cljs_deps.js
├── goog
│   ├── array
│   │   └── array.js
|   
├── main.js
├── strange_loop
│   ├── code.js
│   ├── core.cljs
│   ├── core.cljs.cache.edn
│   ├── core.js
│   └── core.js.map
└── strange-loop
    └── code.js
```

where there should be no `strange-loop` folder, only `strange_loop`.
