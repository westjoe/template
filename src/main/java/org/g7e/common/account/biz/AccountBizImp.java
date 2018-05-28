package org.g7e.common.account.biz;

import org.g7e.common.account.dao.AccountDao;
import org.g7e.common.account.vo.AccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * 
 * @ClassName: AccountBiz
 * @Description: TODO
 * @author: joelin
 * @date: 2018年5月16日 下午10:52:50
 */
@Service
public class AccountBizImp implements AccountBiz {
	
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public Boolean isExist(Integer id, String name) {
		try {
			//AccountVo user = accountDao.getUserInfo();
			
			//if(id == user.getId()&&name.equals(user.getUsername())){
				//return true;
			//}
			if(accountDao.findIdByUsername(name) == id){
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
