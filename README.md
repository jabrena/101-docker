# 101-docker

[![CI](https://github.com/jabrena/101-docker/actions/workflows/build.yaml/badge.svg)](https://github.com/jabrena/101-docker/actions/workflows/build.yaml)

A lab to explore ideas about how to use Docker concepts applied to poliglot apps

## Architecture to explore with GraalVM Native features

https://spring.io/microservices

> Microservices are a modern approach to software whereby application code
is delivered in small, manageable pieces, independent of others.

![](./docs/spring-microservice-diagram.png)

- [ ] HTTP Rest communications (A <- B)
- [ ] Database transactions
- [ ] Event driven communications (A -> Event Store)

## Docker size results

```
docker images hello --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

13.2MB  hello  static  69fc221e8119
3.18MB  hello  upx     2e6c3626ae69

docker images jwebserver --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

113MB   jwebserver  distroless-java-base.jlink    34c52fd2e09b
57.6MB  jwebserver  distroless-java-base.dynamic  6e862593e584
38.6MB  jwebserver  distroless-base.mostly        d8d6d7b2ff77
23.4MB  jwebserver  alpine.static                 9b4c18475524
20.2MB  jwebserver  distroless-static.static      a046cd8c426e
17.9MB  jwebserver  scratch.static                625f43abdc28
4.44MB  jwebserver  scratch.static-upx            111c6113edae

docker images jibber-benchmark --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

279MB   jibber-benchmark  buildpacks-jvm.0.0.1-SNAPSHOT     483a47cdfe58
91.3MB  jibber-benchmark  buildpacks-native.0.0.1-SNAPSHOT  9e56de567bcf
38.7MB  jibber-benchmark  native.0.0.1-SNAPSHOT             dba7fc1dc157
18.4MB  jibber-benchmark  native-upx.0.0.1-SNAPSHOT         8801957da44e

docker images nodejs --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

1.02GB  nodejs  express.0.0.1-SNAPSHOT  34c0262ce4bc

docker images py --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

197MB   py  django.0.0.1-SNAPSHOT  f59562f79e27
57.4MB  py  http_server            5f9684211f52
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
- https://spring.io/microservices
- http://more.musl.cc/

## Talks

- https://github.com/jabrena/crossing-the-chasm-native-images
