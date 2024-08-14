package com.arquillian.test.example.project.internal.graphql.servlet.v1_0;

import com.arquillian.test.example.project.internal.graphql.mutation.v1_0.Mutation;
import com.arquillian.test.example.project.internal.graphql.query.v1_0.Query;
import com.arquillian.test.example.project.internal.resource.v1_0.StepsResourceImpl;
import com.arquillian.test.example.project.resource.v1_0.StepsResource;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author vinicius
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setStepsResourceComponentServiceObjects(
			_stepsResourceComponentServiceObjects);

		Query.setStepsResourceComponentServiceObjects(
			_stepsResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "ArquillianTestExampleProject";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/arquillian-test-example-project-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#createSteps",
						new ObjectValuePair<>(
							StepsResourceImpl.class, "postSteps"));
					put(
						"mutation#createStepsBatch",
						new ObjectValuePair<>(
							StepsResourceImpl.class, "postStepsBatch"));

					put(
						"query#steps",
						new ObjectValuePair<>(
							StepsResourceImpl.class, "getStepsPage"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<StepsResource>
		_stepsResourceComponentServiceObjects;

}