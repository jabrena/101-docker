# Rust for WASM
``` 
cargo build --release --target wasm32-wasi
wasmedge target/wasm32-wasi/release/docker-wasm.wasm
docker build . --platform linux/amd64 -t rust:wasm.0.0.1-SNAPSHOT

docker run -p 8888:8888 \
  --name=wasm-example \
  --runtime=io.containerd.wasmedge.v1 \
  --platform=wasi/wasm32 \
  rust:wasm.0.0.1-SNAPSHOT
```