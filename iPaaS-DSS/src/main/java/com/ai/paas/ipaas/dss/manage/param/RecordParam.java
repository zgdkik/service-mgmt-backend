package com.ai.paas.ipaas.dss.manage.param;

import java.io.Serializable;

import com.ai.paas.ipaas.rpc.api.vo.BaseInfo;


public class RecordParam extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -130505337375903642L;
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
