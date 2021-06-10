package vn.hyperlogy.payment.business.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vn.hyperlogy.payment.business.entity.*;

@CrossOrigin
@RestController
@RequestMapping("/momo")
public class MomoController {

	@PostMapping("/notify")
	public @ResponseBody MomoConfirmResponse reponseNotify(@RequestBody MomoNotification momoNotification) {
		System.out.println(momoNotification);
		MomoConfirmResponse confirmMomo = new MomoConfirmResponse();
		confirmMomo.setStatus(0);
		confirmMomo.setMessage("Successed");
		confirmMomo.setPartnerRefId(momoNotification.getPartnerRefId());
		confirmMomo.setMomoTransId(momoNotification.getMomoTransId());
		confirmMomo.setAmount(momoNotification.getAmount());
		confirmMomo.setSignature(momoNotification.getSignature());

		
		System.out.println(confirmMomo);
		return confirmMomo;
	}

}
