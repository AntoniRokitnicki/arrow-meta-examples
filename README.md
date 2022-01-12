# Λrrow Meta examples

[![Build](https://github.com/arrow-kt/arrow-meta-examples/workflows/Build/badge.svg)](https://github.com/arrow-kt/arrow-meta-examples/actions?query=workflow%3ABuild)

Some examples for [Λrrow Meta](https://github.com/arrow-kt/arrow-meta/) the functional companion to Kotlin's Compiler & IDE.

## Use of Compiler Plugins created with Arrow Meta

### How to run it from IDE

1. Create a new project from existing sources: `demos` directory
2. Build root project

### How to run it from command line

```
cd demos
./gradlew clean build
```

## optics-compiler-plugin-demo
![Context.kt](https://github.com/AntoniRokitnicki/arrow-meta-examples/main/demos/optics-compiler-plugin-demo/src/main/kotlin/io/arrowkt/example/Context.kt)

### optics-compiler-plugin-demo in IDE
![in IDE](https://github.com/AntoniRokitnicki/arrow-meta-examples/raw/main/demos/optics-compiler-plugin-demo/src/main/kotlin/io/arrowkt/example/IDE-compiler-error.png)

## refined-types-compiler-plugin-demo
![Context.kt](https://github.com/AntoniRokitnicki/arrow-meta-examples/blob/main/demos/refined-types-compiler-plugin-demo/src/main/kotlin/io/arrowkt/example/Context.kt)

## refined-types-library-demo
![Context.kt](https://github.com/AntoniRokitnicki/arrow-meta-examples/blob/main/demos/refined-types-library-demo/src/main/kotlin/io/arrowkt/example/Context.kt)

## Use of Λrrow Meta to create other Compiler Plugins

* Create a new compiler plugin to generate sources: `generate-sources` directory

## License

Copyright (C) 2019 The Λrrow Authors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 
