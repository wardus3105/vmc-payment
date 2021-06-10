package vn.hyperlogy.payment.business.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MomoNotification {
	private Integer status;
	private String message;
	private String partnerRefId;
	private String momoTransId;
	private Long amount;
	private String signature;
}
