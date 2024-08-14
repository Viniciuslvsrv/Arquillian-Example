package com.arquillian.test.example.project.internal.graphql.query.v1_0;

import com.arquillian.test.example.project.dto.v1_0.Steps;
import com.arquillian.test.example.project.resource.v1_0.StepsResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author vinicius
 * @generated
 */
@Generated("")
public class Query {

	public static void setStepsResourceComponentServiceObjects(
		ComponentServiceObjects<StepsResource>
			stepsResourceComponentServiceObjects) {

		_stepsResourceComponentServiceObjects =
			stepsResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {steps{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public StepsPage steps() throws Exception {
		return _applyComponentServiceObjects(
			_stepsResourceComponentServiceObjects,
			this::_populateResourceContext,
			stepsResource -> new StepsPage(stepsResource.getStepsPage()));
	}

	@GraphQLName("StepsPage")
	public class StepsPage {

		public StepsPage(Page stepsPage) {
			actions = stepsPage.getActions();

			items = stepsPage.getItems();
			lastPage = stepsPage.getLastPage();
			page = stepsPage.getPage();
			pageSize = stepsPage.getPageSize();
			totalCount = stepsPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map<String, String>> actions;

		@GraphQLField
		protected java.util.Collection<Steps> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

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
	}

	private static ComponentServiceObjects<StepsResource>
		_stepsResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}