#!/bin/sh
mvn clean
mvn com.fortify.sca.plugins.maven:sca-maven-plugin:21.1.1:clean
mvn package com.fortify.sca.plugins.maven:sca-maven-plugin:21.1.1:translate
mvn com.fortify.sca.plugins.maven:sca-maven-plugin:21.1.1:scan
