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

package com.training.mysb.model.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.training.mysb.model.Address;
import com.training.mysb.model.AddressModel;
import com.training.mysb.model.AddressSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the Address service. Represents a row in the &quot;MySbNs_Address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>AddressModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class AddressModelImpl
	extends BaseModelImpl<Address> implements AddressModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a address model instance should use the <code>Address</code> interface instead.
	 */
	public static final String TABLE_NAME = "MySbNs_Address";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"addrId", Types.VARCHAR},
		{"houseNo", Types.VARCHAR}, {"StreetNo", Types.VARCHAR},
		{"city", Types.VARCHAR}, {"state_", Types.VARCHAR},
		{"country", Types.VARCHAR}, {"employeeId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("addrId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("houseNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("StreetNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("state_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("country", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("employeeId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table MySbNs_Address (uuid_ VARCHAR(75) null,addrId VARCHAR(75) not null primary key,houseNo VARCHAR(75) null,StreetNo VARCHAR(75) null,city VARCHAR(75) null,state_ VARCHAR(75) null,country VARCHAR(75) null,employeeId LONG)";

	public static final String TABLE_SQL_DROP = "drop table MySbNs_Address";

	public static final String ORDER_BY_JPQL = " ORDER BY address.addrId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY MySbNs_Address.addrId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long UUID_COLUMN_BITMASK = 1L;

	public static final long ADDRID_COLUMN_BITMASK = 2L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Address toModel(AddressSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Address model = new AddressImpl();

		model.setUuid(soapModel.getUuid());
		model.setAddrId(soapModel.getAddrId());
		model.setHouseNo(soapModel.getHouseNo());
		model.setStreetNo(soapModel.getStreetNo());
		model.setCity(soapModel.getCity());
		model.setState(soapModel.getState());
		model.setCountry(soapModel.getCountry());
		model.setEmployeeId(soapModel.getEmployeeId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Address> toModels(AddressSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Address> models = new ArrayList<Address>(soapModels.length);

		for (AddressSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public AddressModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _addrId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setAddrId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addrId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Address.class;
	}

	@Override
	public String getModelClassName() {
		return Address.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Address, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Address, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Address, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Address)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Address, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Address, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Address)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Address, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Address, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Address>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Address.class.getClassLoader(), Address.class, ModelWrapper.class);

		try {
			Constructor<Address> constructor =
				(Constructor<Address>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<Address, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Address, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Address, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Address, Object>>();
		Map<String, BiConsumer<Address, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Address, ?>>();

		attributeGetterFunctions.put("uuid", Address::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Address, String>)Address::setUuid);
		attributeGetterFunctions.put("addrId", Address::getAddrId);
		attributeSetterBiConsumers.put(
			"addrId", (BiConsumer<Address, String>)Address::setAddrId);
		attributeGetterFunctions.put("houseNo", Address::getHouseNo);
		attributeSetterBiConsumers.put(
			"houseNo", (BiConsumer<Address, String>)Address::setHouseNo);
		attributeGetterFunctions.put("StreetNo", Address::getStreetNo);
		attributeSetterBiConsumers.put(
			"StreetNo", (BiConsumer<Address, String>)Address::setStreetNo);
		attributeGetterFunctions.put("city", Address::getCity);
		attributeSetterBiConsumers.put(
			"city", (BiConsumer<Address, String>)Address::setCity);
		attributeGetterFunctions.put("state", Address::getState);
		attributeSetterBiConsumers.put(
			"state", (BiConsumer<Address, String>)Address::setState);
		attributeGetterFunctions.put("country", Address::getCountry);
		attributeSetterBiConsumers.put(
			"country", (BiConsumer<Address, String>)Address::setCountry);
		attributeGetterFunctions.put("employeeId", Address::getEmployeeId);
		attributeSetterBiConsumers.put(
			"employeeId", (BiConsumer<Address, Long>)Address::setEmployeeId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public String getAddrId() {
		if (_addrId == null) {
			return "";
		}
		else {
			return _addrId;
		}
	}

	@Override
	public void setAddrId(String addrId) {
		_addrId = addrId;
	}

	@JSON
	@Override
	public String getHouseNo() {
		if (_houseNo == null) {
			return "";
		}
		else {
			return _houseNo;
		}
	}

	@Override
	public void setHouseNo(String houseNo) {
		_houseNo = houseNo;
	}

	@JSON
	@Override
	public String getStreetNo() {
		if (_StreetNo == null) {
			return "";
		}
		else {
			return _StreetNo;
		}
	}

	@Override
	public void setStreetNo(String StreetNo) {
		_StreetNo = StreetNo;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return "";
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@JSON
	@Override
	public String getState() {
		if (_state == null) {
			return "";
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@JSON
	@Override
	public String getCountry() {
		if (_country == null) {
			return "";
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		_country = country;
	}

	@JSON
	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Address toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Address>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AddressImpl addressImpl = new AddressImpl();

		addressImpl.setUuid(getUuid());
		addressImpl.setAddrId(getAddrId());
		addressImpl.setHouseNo(getHouseNo());
		addressImpl.setStreetNo(getStreetNo());
		addressImpl.setCity(getCity());
		addressImpl.setState(getState());
		addressImpl.setCountry(getCountry());
		addressImpl.setEmployeeId(getEmployeeId());

		addressImpl.resetOriginalValues();

		return addressImpl;
	}

	@Override
	public int compareTo(Address address) {
		String primaryKey = address.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Address)) {
			return false;
		}

		Address address = (Address)obj;

		String primaryKey = address.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		AddressModelImpl addressModelImpl = this;

		addressModelImpl._originalUuid = addressModelImpl._uuid;

		addressModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Address> toCacheModel() {
		AddressCacheModel addressCacheModel = new AddressCacheModel();

		addressCacheModel.uuid = getUuid();

		String uuid = addressCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			addressCacheModel.uuid = null;
		}

		addressCacheModel.addrId = getAddrId();

		String addrId = addressCacheModel.addrId;

		if ((addrId != null) && (addrId.length() == 0)) {
			addressCacheModel.addrId = null;
		}

		addressCacheModel.houseNo = getHouseNo();

		String houseNo = addressCacheModel.houseNo;

		if ((houseNo != null) && (houseNo.length() == 0)) {
			addressCacheModel.houseNo = null;
		}

		addressCacheModel.StreetNo = getStreetNo();

		String StreetNo = addressCacheModel.StreetNo;

		if ((StreetNo != null) && (StreetNo.length() == 0)) {
			addressCacheModel.StreetNo = null;
		}

		addressCacheModel.city = getCity();

		String city = addressCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			addressCacheModel.city = null;
		}

		addressCacheModel.state = getState();

		String state = addressCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			addressCacheModel.state = null;
		}

		addressCacheModel.country = getCountry();

		String country = addressCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			addressCacheModel.country = null;
		}

		addressCacheModel.employeeId = getEmployeeId();

		return addressCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Address, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Address, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Address, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Address)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Address, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Address, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Address, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Address)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Address>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private String _addrId;
	private String _houseNo;
	private String _StreetNo;
	private String _city;
	private String _state;
	private String _country;
	private long _employeeId;
	private long _columnBitmask;
	private Address _escapedModel;

}