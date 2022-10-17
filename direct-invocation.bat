cmd /C mvn clean
cmd /C mvn com.fortify.sca.plugins.maven:sca-maven-plugin:21.1.1:clean
cmd /C mvn package com.fortify.sca.plugins.maven:sca-maven-plugin:21.1.1:translate
cmd /C mvn com.fortify.sca.plugins.maven:sca-maven-plugin:21.1.1:scan
