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

package com.liferay.screens.service.base;

import com.liferay.dynamic.data.lists.service.persistence.DDLRecordPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.screens.service.ScreensDDLRecordService;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the screens d d l record remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.screens.service.impl.ScreensDDLRecordServiceImpl}.
 * </p>
 *
 * @author José Manuel Navarro
 * @see com.liferay.screens.service.impl.ScreensDDLRecordServiceImpl
 * @see com.liferay.screens.service.ScreensDDLRecordServiceUtil
 * @generated
 */
public abstract class ScreensDDLRecordServiceBaseImpl extends BaseServiceImpl
	implements ScreensDDLRecordService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.screens.service.ScreensDDLRecordServiceUtil} to access the screens d d l record remote service.
	 */

	/**
	 * Returns the screens asset entry remote service.
	 *
	 * @return the screens asset entry remote service
	 */
	public com.liferay.screens.service.ScreensAssetEntryService getScreensAssetEntryService() {
		return screensAssetEntryService;
	}

	/**
	 * Sets the screens asset entry remote service.
	 *
	 * @param screensAssetEntryService the screens asset entry remote service
	 */
	public void setScreensAssetEntryService(
		com.liferay.screens.service.ScreensAssetEntryService screensAssetEntryService) {
		this.screensAssetEntryService = screensAssetEntryService;
	}

	/**
	 * Returns the screens d d l record remote service.
	 *
	 * @return the screens d d l record remote service
	 */
	public ScreensDDLRecordService getScreensDDLRecordService() {
		return screensDDLRecordService;
	}

	/**
	 * Sets the screens d d l record remote service.
	 *
	 * @param screensDDLRecordService the screens d d l record remote service
	 */
	public void setScreensDDLRecordService(
		ScreensDDLRecordService screensDDLRecordService) {
		this.screensDDLRecordService = screensDDLRecordService;
	}

	/**
	 * Returns the screens journal article remote service.
	 *
	 * @return the screens journal article remote service
	 */
	public com.liferay.screens.service.ScreensJournalArticleService getScreensJournalArticleService() {
		return screensJournalArticleService;
	}

	/**
	 * Sets the screens journal article remote service.
	 *
	 * @param screensJournalArticleService the screens journal article remote service
	 */
	public void setScreensJournalArticleService(
		com.liferay.screens.service.ScreensJournalArticleService screensJournalArticleService) {
		this.screensJournalArticleService = screensJournalArticleService;
	}

	/**
	 * Returns the screens ratings entry remote service.
	 *
	 * @return the screens ratings entry remote service
	 */
	public com.liferay.screens.service.ScreensRatingsEntryService getScreensRatingsEntryService() {
		return screensRatingsEntryService;
	}

	/**
	 * Sets the screens ratings entry remote service.
	 *
	 * @param screensRatingsEntryService the screens ratings entry remote service
	 */
	public void setScreensRatingsEntryService(
		com.liferay.screens.service.ScreensRatingsEntryService screensRatingsEntryService) {
		this.screensRatingsEntryService = screensRatingsEntryService;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the d d l record local service.
	 *
	 * @return the d d l record local service
	 */
	public com.liferay.dynamic.data.lists.service.DDLRecordLocalService getDDLRecordLocalService() {
		return ddlRecordLocalService;
	}

	/**
	 * Sets the d d l record local service.
	 *
	 * @param ddlRecordLocalService the d d l record local service
	 */
	public void setDDLRecordLocalService(
		com.liferay.dynamic.data.lists.service.DDLRecordLocalService ddlRecordLocalService) {
		this.ddlRecordLocalService = ddlRecordLocalService;
	}

	/**
	 * Returns the d d l record remote service.
	 *
	 * @return the d d l record remote service
	 */
	public com.liferay.dynamic.data.lists.service.DDLRecordService getDDLRecordService() {
		return ddlRecordService;
	}

	/**
	 * Sets the d d l record remote service.
	 *
	 * @param ddlRecordService the d d l record remote service
	 */
	public void setDDLRecordService(
		com.liferay.dynamic.data.lists.service.DDLRecordService ddlRecordService) {
		this.ddlRecordService = ddlRecordService;
	}

	/**
	 * Returns the d d l record persistence.
	 *
	 * @return the d d l record persistence
	 */
	public DDLRecordPersistence getDDLRecordPersistence() {
		return ddlRecordPersistence;
	}

	/**
	 * Sets the d d l record persistence.
	 *
	 * @param ddlRecordPersistence the d d l record persistence
	 */
	public void setDDLRecordPersistence(
		DDLRecordPersistence ddlRecordPersistence) {
		this.ddlRecordPersistence = ddlRecordPersistence;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ScreensDDLRecordService.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = InfrastructureUtil.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.screens.service.ScreensAssetEntryService.class)
	protected com.liferay.screens.service.ScreensAssetEntryService screensAssetEntryService;
	@BeanReference(type = ScreensDDLRecordService.class)
	protected ScreensDDLRecordService screensDDLRecordService;
	@BeanReference(type = com.liferay.screens.service.ScreensJournalArticleService.class)
	protected com.liferay.screens.service.ScreensJournalArticleService screensJournalArticleService;
	@BeanReference(type = com.liferay.screens.service.ScreensRatingsEntryService.class)
	protected com.liferay.screens.service.ScreensRatingsEntryService screensRatingsEntryService;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.dynamic.data.lists.service.DDLRecordLocalService.class)
	protected com.liferay.dynamic.data.lists.service.DDLRecordLocalService ddlRecordLocalService;
	@ServiceReference(type = com.liferay.dynamic.data.lists.service.DDLRecordService.class)
	protected com.liferay.dynamic.data.lists.service.DDLRecordService ddlRecordService;
	@ServiceReference(type = DDLRecordPersistence.class)
	protected DDLRecordPersistence ddlRecordPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}