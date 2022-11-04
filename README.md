# 101-docker

[![CI](https://github.com/jabrena/101-docker/actions/workflows/build.yaml/badge.svg)](https://github.com/jabrena/101-docker/actions/workflows/build.yaml)

A lab to explore ideas about how to use Docker concepts applied to poliglot apps

## Results

```
+ docker images hello --format {{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}
13.2MB  hello  static  69fc221e8119
3.18MB  hello  upx     2e6c3626ae69

113MB   jwebserver  distroless-java-base.jlink    34c52fd2e09b
57.6MB  jwebserver  distroless-java-base.dynamic  6e862593e584
38.6MB  jwebserver  distroless-base.mostly        d8d6d7b2ff77
23.4MB  jwebserver  alpine.static                 9b4c18475524
20.2MB  jwebserver  distroless-static.static      a046cd8c426e
17.9MB  jwebserver  scratch.static                625f43abdc28
4.44MB  jwebserver  scratch.static-upx            111c6113edae

+ docker images jibber-benchmark --format {{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}
38.8MB  jibber-benchmark  native.0.0.1-SNAPSHOT      8c1c5d19afde
18.5MB  jibber-benchmark  native-upx.0.0.1-SNAPSHOT  b8493ddc8146
```

## References

- https://github.com/graalvm/graalvm-demos
- https://spring.io/blog/2022/09/26/native-support-in-spring-boot-3-0-0-m5
- https://github.com/oktadev/native-java-examples
- https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/
- https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/htmlsingle/
- https://graalvm.github.io/native-build-tools/latest/
- https://graalvm.github.io/native-build-tools/latest/maven-plugin.html
- https://start.spring.io/
- https://github.com/wagoodman/dive
- https://spring.io/guides/gs/spring-boot-docker/
- https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/htmlsingle/
- https://console.cloud.google.com/gcr/images/paketo-buildpacks/GLOBAL/bellsoft-liberica