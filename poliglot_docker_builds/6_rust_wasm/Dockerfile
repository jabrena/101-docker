FROM wasmedge/slim:0.11.2
WORKDIR /app
COPY /target/wasm32-wasi/release/docker-wasm.wasm /app/docker-wasm.wasm

EXPOSE 8888

CMD ["wasmedge", "/app/docker-wasm.wasm"]