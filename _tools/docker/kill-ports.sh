#!/bin/sh

sudo kill -9 $(sudo lsof -t -i:9200)
sudo kill -9 $(sudo lsof -t -i:9999)
sudo kill -9 $(sudo lsof -t -i:7077)
sudo kill -9 $(sudo lsof -t -i:9300)
sudo kill -9 $(sudo lsof -t -i:5601)
sudo kill -9 $(sudo lsof -t -i:8201)
sudo kill -9 $(sudo lsof -t -i:5432)
sudo kill -9 $(sudo lsof -t -i:6379)
sudo kill -9 $(sudo lsof -t -i:6378)
sudo kill -9 $(sudo lsof -t -i:9000)
sudo kill -9 $(sudo lsof -t -i:8500)
sudo kill -9 $(sudo lsof -t -i:2181)
sudo kill -9 $(sudo lsof -t -i:9092)
sudo kill -9 $(sudo lsof -t -i:8081)
sudo kill -9 $(sudo lsof -t -i:8080)
