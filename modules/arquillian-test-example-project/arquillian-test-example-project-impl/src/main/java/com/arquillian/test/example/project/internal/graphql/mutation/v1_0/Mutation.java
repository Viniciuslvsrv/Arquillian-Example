package com.arquillian.test.example.project.internal.graphql.mutation.v1_0;

import com.arquillian.test.example.project.dto.v1_0.Steps;
import com.arquillian.test.example.project.resource.v1_0.StepsResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineImportTaskResource;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author vinicius
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setStepsResourceComponentServiceObjects(
		ComponentServiceObjects<StepsResource>
			stepsResourceComponentServiceObjects) {

		_stepsResourceComponentServiceObjects =
			stepsResourceComponentServiceObjects;
	}

	@GraphQLField
	public Steps createSteps(@GraphQLName("steps") Steps steps)
		throws Exception {

		return _applyComponentServiceObjects(
			_stepsResourceComponentServiceObjects,
			this::_populateResourceContext,
			stepsResource -> stepsResource.postSteps(steps));
	}

	@GraphQLField
	public Response createStepsBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_stepsResourceComponentServiceObjects,
			this::_populateResourceContext,
			stepsResource -> stepsResource.postStepsBatch(callbackURL, object));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(StepsResource stepsResource)
		throws Exception {

		stepsResource.setContextAcceptLanguage(_acceptLanguage);
		stepsResource.setContextCompany(_company);
		stepsResource.setContextHttpServletRequest(_httpServletRequest);
		stepsResource.setContextHttpServletResponse(_httpServletResponse);
		stepsResource.setContextUriInfo(_uriInfo);
		stepsResource.setContextUser(_user);
		stepsResource.setGroupLocalService(_groupLocalService);
		stepsResource.setRoleLocalService(_roleLocalService);

		stepsResource.setVulcanBatchEngineImportTaskResource(
			_vulcanBatchEngineImportTaskResource);
	}

	private static ComponentServiceObjects<StepsResource>
		_stepsResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;
	private VulcanBatchEngineImportTaskResource
		_vulcanBatchEngineImportTaskResource;

}