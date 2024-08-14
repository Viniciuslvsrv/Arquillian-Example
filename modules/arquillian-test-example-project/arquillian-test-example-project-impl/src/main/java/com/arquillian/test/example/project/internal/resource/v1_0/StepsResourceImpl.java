package com.arquillian.test.example.project.internal.resource.v1_0;

import com.arquillian.test.example.project.resource.v1_0.StepsResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author vinicius
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/steps.properties",
	scope = ServiceScope.PROTOTYPE, service = StepsResource.class
)
public class StepsResourceImpl extends BaseStepsResourceImpl {
}