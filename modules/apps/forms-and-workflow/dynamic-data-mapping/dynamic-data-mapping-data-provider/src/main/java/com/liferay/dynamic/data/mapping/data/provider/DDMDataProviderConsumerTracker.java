/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.dynamic.data.mapping.data.provider;

import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * @author Leonardo Barros
 */
@Component(immediate = true, service = DDMDataProviderConsumerTracker.class)
public class DDMDataProviderConsumerTracker {

	public DDMDataProviderConsumer getDDMDataProviderConsumer(String type) {
		return _ddmDataProviderConsumerServiceTrackerMap.getService(type);
	}

	public Set<String> getDDMDataProviderConsumerTypes() {
		return _ddmDataProviderConsumerServiceTrackerMap.keySet();
	}

	public List<DDMDataProviderContextContributor>
		getDDMDataProviderContextContributors(String type) {

		List<DDMDataProviderContextContributor>
			ddmDataProviderContextContributors =
				_ddmDataProviderContextContributorServiceTrackerMap.getService(
					type);

		if (ddmDataProviderContextContributors != null) {
			return ddmDataProviderContextContributors;
		}

		return Collections.emptyList();
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_ddmDataProviderContextContributorServiceTrackerMap =
			ServiceTrackerMapFactory.multiValueMap(
				bundleContext, DDMDataProviderContextContributor.class,
				"ddm.data.provider.type");

		_ddmDataProviderContextContributorServiceTrackerMap.open();

		_ddmDataProviderConsumerServiceTrackerMap =
			ServiceTrackerMapFactory.singleValueMap(
				bundleContext, DDMDataProviderConsumer.class,
				"ddm.data.provider.type");

		_ddmDataProviderConsumerServiceTrackerMap.open();
	}

	@Deactivate
	protected void deactivate() {
		_ddmDataProviderContextContributorServiceTrackerMap.close();

		_ddmDataProviderConsumerServiceTrackerMap.close();
	}

	private ServiceTrackerMap<String, DDMDataProviderConsumer>
		_ddmDataProviderConsumerServiceTrackerMap;
	private ServiceTrackerMap<String, List<DDMDataProviderContextContributor>>
		_ddmDataProviderContextContributorServiceTrackerMap;

}