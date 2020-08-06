#!/bin/bash

ssh -i deploy_rsa root@104.199.247.193 <<EOF
  nohup java -jar /home/java/generate-password-hash-web-0.0.1-SNAPSHOT.jar &
  echo "DONE"
EOF
