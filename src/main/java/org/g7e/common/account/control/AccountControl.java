package org.g7e.common.account.control;

import org.g7e.common.account.biz.AccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 
 * @ClassName: AccountControl
 * @Description: TODO
 * @author: joelin
 * @date: 2018年5月16日 下午10:51:24
 */
@RequestMapping("wx")
@Controller
public class AccountControl {

	@Autowired
	private AccountBiz accountBiz;
	
	@RequestMapping("login")
	@ResponseBody
	public String login() {

		if (accountBiz.isExist(1, "12345")) {
			return "true";
		} else {
			return "false";
		}
	}
	
}
