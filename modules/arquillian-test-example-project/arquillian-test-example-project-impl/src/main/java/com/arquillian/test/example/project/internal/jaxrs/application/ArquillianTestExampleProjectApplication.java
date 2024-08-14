package com.arquillian.test.example.project.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author vinicius
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false",
		"osgi.jaxrs.application.base=/arquillian-test-example-project",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=ArquillianTestExampleProject"
	},
	service = Application.class
)
@Generated("")
public class ArquillianTestExampleProjectApplication extends Application {
}