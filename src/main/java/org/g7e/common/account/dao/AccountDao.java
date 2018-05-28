package org.g7e.common.account.dao;

import org.apache.ibatis.annotations.Param;
import org.g7e.common.account.vo.AccountVo;

/***
 * 
 * @ClassName: AccountDao
 * @Description: TODO
 * @author: joelin
 * @date: 2018年5月16日 下午10:53:30
 */
public interface AccountDao {

	AccountVo getUserInfo();
	
	int findIdByUsername(@Param("openId") String openId);
}
