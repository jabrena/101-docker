# 101-docker

[![CI](https://github.com/jabrena/101-docker/actions/workflows/build.yaml/badge.svg)](https://github.com/jabrena/101-docker/actions/workflows/build.yaml)

A lab to explore ideas about how to use Docker concepts applied to poliglot apps

## Results

```
+ docker images jwebserver
REPOSITORY   TAG                            IMAGE ID       CREATED         SIZE
jwebserver   distroless-java-base.jlink     7647c6c548da   5 minutes ago   113MB
jwebserver   scratch.static-upx             9ef8631ac1ac   6 minutes ago   4.44MB
jwebserver   alpine.static                  29b05d6c1c78   6 minutes ago   23.4MB
jwebserver   distroless-static.static       b9ad95976251   6 minutes ago   20.2MB
jwebserver   scratch.static                 65d858443abe   6 minutes ago   17.9MB
jwebserver   distroless-base.mostly         ca90a11fa78e   7 minutes ago   38.6MB
jwebserver   distroless-java-base.dynamic   51524b4ddfe4   9 minutes ago   57.6MB

+ docker images hello
REPOSITORY   TAG       IMAGE ID       CREATED          SIZE
hello        upx       a8ce73f90f1e   10 minutes ago   3.17MB

+ docker images jibber-benchmark
REPOSITORY         TAG                     IMAGE ID       CREATED         SIZE
jibber-benchmark   native.0.0.1-SNAPSHOT   9c628401c6e3   6 seconds ago   18.5MB
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
- https://www.baeldung.com/dockerizing-spring-boot-application
- https://www.baeldung.com/spring-boot-docker-images