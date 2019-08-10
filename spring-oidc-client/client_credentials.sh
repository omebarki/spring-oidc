#!/usr/bin/env bash

curl -sS -k -X POST -H 'Accept: application/json' -H 'Content-Type: application/x-www-form-urlencoded' \
http://localhost:8080/auth/realms/oidcrealm/protocol/openid-connect/token \
-d "client_id=spring-oidc-clientid-for-api" \
-d "client_secret=0fde0459-546b-4440-8aca-0b0843a3543f" \
-d "grant_type=client_credentials"

curl -k "https://hello2-api-3scale-apicast-staging.192.168.99.100.nip.io:443/hello"

curl -sS -k -X POST -H 'Accept: application/json' -H 'Content-Type: application/x-www-form-urlencoded' \
http://localhost:8080/auth/realms/3scalesso/protocol/openid-connect/token \
-d "client_id=93a26a0c" \
-d "client_secret=b6caedebe3de7877994a57f1b4c5f2d1" \
-d "grant_type=client_credentials"