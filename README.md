# 101-docker

[![Poliglot Docker Builds](https://github.com/jabrena/101-docker/actions/workflows/poliglot_docker_builds.yaml/badge.svg)](https://github.com/jabrena/101-docker/actions/workflows/poliglot_docker_builds.yaml)
[![Usecase 1](https://github.com/jabrena/101-docker/actions/workflows/usecase1_build.yaml/badge.svg)](https://github.com/jabrena/101-docker/actions/workflows/usecase1_build.yaml)

## Motivation
 
Understand the `JVM` & Non JVM ecosystem comparing:

- Container application running with the JVM support
- Container application running with GraalVM native support
- Container application running with WASM support

And reviewing the scenarios in terms of `CPU` & `Memory` for a financial point of view in the middle term.

## A microservice architecture to be evaluated with Spring Boot applications & GraalVM native capabilities

https://spring.io/microservices

> Microservices are a modern approach to software whereby application code
is delivered in small, manageable pieces, independent of others.

![](./docs/spring-microservice-diagram.png)

### Usecase 1: Interservice communication in microservices

- [x] HTTP Rest communications (A <- B)
- [ ] Database transactions

### Usecase 2: Observability

- [ ] With Prometheus, Prometheus & Zipkin
- [ ] With Graphana, Tempo & Loki
- [ ] With Elastic stack

### Usecase 3: Event Driven

- [ ] Event driven communications (A -> Event Store)

### Usecase 4: Security

- [ ] Security patterns

## Issues detected

Some notes from the tests using Spring Boot 3 native features.

- [ ] `musl` support is not implemented with buildpacks
- [ ] `upx` support is not possible in OSX
- [ ] [Buildpacks has a different behaviour (size) between OSX & Ubuntu in terms of sizes of native apps](https://github.com/jabrena/101-docker/issues/57#issuecomment-1323910704)
- [ ] [`--static` is not available for OSX](https://github.com/jabrena/101-docker/issues/57#issuecomment-1323893624) raised when native application A call endpoint B using http

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
- https://github.com/paketo-buildpacks/bellsoft-liberica
- https://github.com/paketo-buildpacks/java-native-image
- https://spring.io/microservices
- http://more.musl.cc/
- https://docs.docker.com/compose/
- https://www.docker.com/blog/docker-wasm-technical-preview/
- https://github.com/actions/upload-artifact

## Previous talks

- https://github.com/jabrena/crossing-the-chasm-native-images
