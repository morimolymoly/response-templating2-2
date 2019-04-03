# response-templating2
experimental extension for standalone Wiremock

# USAGE
## Standalone
Use `--extensions com.github.morimolymoly.template.Trans`

## New feature
* now2 - it can fetch UNIX time by seconds not miliseconds

# build
build with openjdk-1.8

```
mvn package
```

# error
```sh
Exception in thread "main" java.lang.ClassCastException: com.github.morimolymoly.template.helpers.Now2Helper cannot be cast to wiremock.com.github.jknack.handlebars.Helper
        at com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer.<init>(ResponseTemplateTransformer.java:94)
        at com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer.<init>(ResponseTemplateTransformer.java:65)
        at com.github.morimolymoly.template.Trans.<init>(Trans.java:36)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
        at java.lang.Class.newInstance(Class.java:442)
        at com.github.tomakehurst.wiremock.extension.ExtensionLoader$2.apply(ExtensionLoader.java:61)
        at com.github.tomakehurst.wiremock.extension.ExtensionLoader$2.apply(ExtensionLoader.java:57)
        at wiremock.com.google.common.collect.Iterators$7.transform(Iterators.java:750)
        at wiremock.com.google.common.collect.TransformedIterator.next(TransformedIterator.java:47)
        at wiremock.com.google.common.collect.Maps.uniqueIndex(Maps.java:1245)
        at wiremock.com.google.common.collect.Maps.uniqueIndex(Maps.java:1208)
        at com.github.tomakehurst.wiremock.extension.ExtensionLoader.asMap(ExtensionLoader.java:43)
        at com.github.tomakehurst.wiremock.extension.ExtensionLoader.loadExtension(ExtensionLoader.java:32)
        at com.github.tomakehurst.wiremock.extension.ExtensionLoader.load(ExtensionLoader.java:39)
        at com.github.tomakehurst.wiremock.standalone.CommandLineOptions.extensionsOfType(CommandLineOptions.java:307)
        at com.github.tomakehurst.wiremock.core.WireMockApp.<init>(WireMockApp.java:87)
        at com.github.tomakehurst.wiremock.WireMockServer.<init>(WireMockServer.java:71)
        at com.github.tomakehurst.wiremock.standalone.WireMockServerRunner.run(WireMockServerRunner.java:65)
        at com.github.tomakehurst.wiremock.standalone.WireMockServerRunner.main(WireMockServerRunner.java:125)
make: *** [run] Error 1
```
