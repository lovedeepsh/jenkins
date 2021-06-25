#!/bin/bash
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
sudo apt-get install oracle-java8-set-default
echo "JAVA_HOME=/usr/lib/jvm/java-8-oracle /n JRE_HOME=/usr/lib/jvm/java-8-oracle-jre" >> /etc/environment


