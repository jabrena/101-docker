FROM alpine:latest

EXPOSE 8080

WORKDIR /serve
COPY index.html /serve/index.html

RUN apk --no-cache -U add python3 && \
    apk upgrade --no-cache -U -a  
# Patch OpenSSL vulnerability^

ENTRYPOINT [ "python3", "-m", "http.server", "8080" ]
