#!/bin/bash

# enable error reporting to the console


ssh root@104.199.247.193 <<EOF
  set -e
  cd /home/java
  java -jar $FILE_NAME
  echo "DONE"
EOF