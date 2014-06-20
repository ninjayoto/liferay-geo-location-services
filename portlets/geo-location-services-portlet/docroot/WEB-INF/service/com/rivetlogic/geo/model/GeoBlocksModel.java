/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.geo.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.rivetlogic.geo.service.persistence.GeoBlocksPK;

import java.io.Serializable;

/**
 * The base model interface for the GeoBlocks service. Represents a row in the &quot;rivetlogic_geo_GeoBlocks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.geo.model.impl.GeoBlocksModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.geo.model.impl.GeoBlocksImpl}.
 * </p>
 *
 * @author charles.rodriguez
 * @see GeoBlocks
 * @see com.rivetlogic.geo.model.impl.GeoBlocksImpl
 * @see com.rivetlogic.geo.model.impl.GeoBlocksModelImpl
 * @generated
 */
public interface GeoBlocksModel extends BaseModel<GeoBlocks> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a geo blocks model instance should use the {@link GeoBlocks} interface instead.
	 */

	/**
	 * Returns the primary key of this geo blocks.
	 *
	 * @return the primary key of this geo blocks
	 */
	public GeoBlocksPK getPrimaryKey();

	/**
	 * Sets the primary key of this geo blocks.
	 *
	 * @param primaryKey the primary key of this geo blocks
	 */
	public void setPrimaryKey(GeoBlocksPK primaryKey);

	/**
	 * Returns the geoname ID of this geo blocks.
	 *
	 * @return the geoname ID of this geo blocks
	 */
	public long getGeonameId();

	/**
	 * Sets the geoname ID of this geo blocks.
	 *
	 * @param geonameId the geoname ID of this geo blocks
	 */
	public void setGeonameId(long geonameId);

	/**
	 * Returns the start ip of this geo blocks.
	 *
	 * @return the start ip of this geo blocks
	 */
	public long getStartIp();

	/**
	 * Sets the start ip of this geo blocks.
	 *
	 * @param startIp the start ip of this geo blocks
	 */
	public void setStartIp(long startIp);

	/**
	 * Returns the end ip of this geo blocks.
	 *
	 * @return the end ip of this geo blocks
	 */
	public long getEndIp();

	/**
	 * Sets the end ip of this geo blocks.
	 *
	 * @param endIp the end ip of this geo blocks
	 */
	public void setEndIp(long endIp);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(GeoBlocks geoBlocks);

	@Override
	public int hashCode();

	@Override
	public CacheModel<GeoBlocks> toCacheModel();

	@Override
	public GeoBlocks toEscapedModel();

	@Override
	public GeoBlocks toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}