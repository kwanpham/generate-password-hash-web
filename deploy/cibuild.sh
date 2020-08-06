#!/bin/bash

ssh root@104.199.247.193 <<EOF
  cd /home/java
  java -jar $FILE_NAME
EOF