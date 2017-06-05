**sample run
`
:compileJava UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
:compileTestJava
:processTestResources NO-SOURCE
:testClasses
:test NO-SOURCE
:prepareInplaceWebAppFolder UP-TO-DATE
:createInplaceWebAppFolder UP-TO-DATE
:prepareInplaceWebAppClasses UP-TO-DATE
:prepareInplaceWebApp UP-TO-DATE
:appBeforeIntegrationTest
ERROR StatusLogger No log4j2 configuration file found. Using default configuration: logging only errors to the console.
2017/06/05 16:45:35:153 DEBUG [foo.bar.servlet.IndexController]: 18 - init
16:45:40 INFO  Jetty 9.2.15.v20160210 started and listening on ports 8083, 8443
16:45:40 INFO  gretty-snippets runs at:
16:45:40 INFO    http://localhost:8083/gretty-snippets
16:45:40 INFO    https://localhost:8443/gretty-snippets
:integrationTest
2017/06/05 16:45:41:771 DEBUG [foo.bar.servlet.IndexController]: 27 - Hello World!
:appAfterIntegrationTest
Server stopped.

BUILD SUCCESSFUL

Total time: 13.423 secs
`