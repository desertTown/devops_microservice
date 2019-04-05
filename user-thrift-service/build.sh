#!/usr/bin/env bash

mvn clean package

docker build -t 192.168.50.2/micro-service/user-service:latest .

docker push 192.168.50.2/micro-service/user-service:latest