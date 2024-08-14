package com.arquillian.test.example.project.resource.v1_0.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.apache.log4j.Appender;

/**
 * @author vinicius
 */
@RunWith(Arquillian.class)
public class StepsResourceTest {

    @ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Test
	public void testUserLocalService() throws Exception {
		Assert.assertNull(null);
	}

    @Test
	public void testUserLocalService2() throws Exception {
		Assert.assertNotNull(_userLocalService);
	}

	@Inject
	private UserLocalService _userLocalService;
}