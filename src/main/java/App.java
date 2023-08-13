//REPOS mavencentral
//REPOS mvnnpm=https://repo.mvnpm.org/maven2
//DEPS io.quarkus.platform:quarkus-bom:3.2.4.Final@pom
//DEPS io.quarkus:quarkus-hibernate-orm-panache
//DEPS io.quarkiverse.renarde:quarkus-renarde:3.0.2
//DEPS io.quarkus:quarkus-jdbc-h2
//DEPS io.quarkus:quarkus-arc
//DEPS io.quarkiverse.web-bundler:quarkus-web-bundler:1.0.0
//DEPS org.mvnpm:htmx.org:1.9.2
//DEPS org.mvnpm.at.hotwired:stimulus:3.2.1
//DEPS org.mvnpm:bootstrap:5.2.3
//DEPS org.mvnpm:bootstrap-icons:1.10.5
//DEPS org.mvnpm:easymde:2.18.0

//SOURCES **/*.java
//FILES META-INF=../resources/META-INF
/* without ** getting dirnotfoundexception which is not expected */
//FILES templates=../resources/templates/**
//FILES web=../resources/web/**
//FILES application.properties=../resources/application.properties
//JAVAC_OPTIONS -parameters 


import io.quarkiverse.renarde.Controller;
import rest.Notes;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;


public class App extends Controller {

    @Path("/")
    public void home() {
        redirect(Notes.class).notes(null, null);
    }
}