package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 描述结算信息，json格式。
 *
 * @author auto create
 * @since 1.0, 2018-03-22 14:31:51
 */
public class SettleInfo extends AlipayObject {

	private static final long serialVersionUID = 5438626419491138836L;

	/**
	 * 结算详细信息，json数组，目前只支持一条。
	 */
	@ApiListField("settle_detail_infos")
	@ApiField("settle_detail_info")
	private List<SettleDetailInfo> settleDetailInfos;

	public List<SettleDetailInfo> getSettleDetailInfos() {
		return this.settleDetailInfos;
	}
	public void setSettleDetailInfos(List<SettleDetailInfo> settleDetailInfos) {
		this.settleDetailInfos = settleDetailInfos;
	}

}
