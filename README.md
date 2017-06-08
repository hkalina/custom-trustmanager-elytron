Demo: Custom Trust Manager for WildFly (Elytron)
================================================

Compile
-------

        mvn package

Add into WildFly
----------------

        bin/jboss-cli.sh
        module add --name=jk.demo.mytrustmanager --resources=mytrustmanager-1.0-SNAPSHOT.jar --dependencies=javax.api
        /subsystem=elytron/provider-loader=myloader:add(module=jk.demo.mytrustmanager)

