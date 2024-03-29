# Poliglot Docker builds

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
41.3MB  jibber-benchmark  buildpacks-native-static-upx.0.0.1-SNAPSHOT  9a30a86e62e7
38.7MB  jibber-benchmark  native.0.0.1-SNAPSHOT             dba7fc1dc157
18.4MB  jibber-benchmark  native-upx.0.0.1-SNAPSHOT         8801957da44e

docker images nodejs --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

196MB   nodejs  express.0.0.1-SNAPSHOT  34c0262ce4bc

docker images py --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

160MB  py  django.0.0.1-SNAPSHOT       35b461ac58da
127MB  py  fastapi.0.0.1-SNAPSHOT      5078a507dee7
54MB   py  http_server.0.0.1-SNAPSHOT  b8e2da3d64e1
```
