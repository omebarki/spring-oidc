#!/usr/bin/env bash

curl -sS -k -X POST -H 'Accept: application/json' -H 'Content-Type: application/x-www-form-urlencoded' \
http://localhost:8080/auth/realms/oidcrealm/protocol/openid-connect/token \
-d "client_id=spring-oidc-clientid-for-api" \
-d "client_secret=0fde0459-546b-4440-8aca-0b0843a3543f" \
-d "grant_type=client_credentials"