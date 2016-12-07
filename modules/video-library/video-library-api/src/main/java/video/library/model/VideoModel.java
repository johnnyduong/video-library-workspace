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

package video.library.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Video service. Represents a row in the &quot;VL_Video&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link video.library.model.impl.VideoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link video.library.model.impl.VideoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Video
 * @see video.library.model.impl.VideoImpl
 * @see video.library.model.impl.VideoModelImpl
 * @generated
 */
@ProviderType
public interface VideoModel extends BaseModel<Video>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a video model instance should use the {@link Video} interface instead.
	 */

	/**
	 * Returns the primary key of this video.
	 *
	 * @return the primary key of this video
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this video.
	 *
	 * @param primaryKey the primary key of this video
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this video.
	 *
	 * @return the uuid of this video
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this video.
	 *
	 * @param uuid the uuid of this video
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the video ID of this video.
	 *
	 * @return the video ID of this video
	 */
	public long getVideoId();

	/**
	 * Sets the video ID of this video.
	 *
	 * @param videoId the video ID of this video
	 */
	public void setVideoId(long videoId);

	/**
	 * Returns the group ID of this video.
	 *
	 * @return the group ID of this video
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this video.
	 *
	 * @param groupId the group ID of this video
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this video.
	 *
	 * @return the company ID of this video
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this video.
	 *
	 * @param companyId the company ID of this video
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this video.
	 *
	 * @return the user ID of this video
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this video.
	 *
	 * @param userId the user ID of this video
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this video.
	 *
	 * @return the user uuid of this video
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this video.
	 *
	 * @param userUuid the user uuid of this video
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this video.
	 *
	 * @return the user name of this video
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this video.
	 *
	 * @param userName the user name of this video
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this video.
	 *
	 * @return the create date of this video
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this video.
	 *
	 * @param createDate the create date of this video
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this video.
	 *
	 * @return the modified date of this video
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this video.
	 *
	 * @param modifiedDate the modified date of this video
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the description of this video.
	 *
	 * @return the description of this video
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this video.
	 *
	 * @param description the description of this video
	 */
	public void setDescription(String description);

	/**
	 * Returns the title of this video.
	 *
	 * @return the title of this video
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this video.
	 *
	 * @param title the title of this video
	 */
	public void setTitle(String title);

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
	public int compareTo(video.library.model.Video video);

	@Override
	public int hashCode();

	@Override
	public CacheModel<video.library.model.Video> toCacheModel();

	@Override
	public video.library.model.Video toEscapedModel();

	@Override
	public video.library.model.Video toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}