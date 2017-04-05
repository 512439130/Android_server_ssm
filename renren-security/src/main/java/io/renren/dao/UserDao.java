package io.renren.dao;



import java.util.List;
import java.util.Map;
import io.renren.entity.User;
/**
 * 系统用户
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:34:11
 */
public interface UserDao extends BaseDao<User> {
	/**
	 * 根据用户名，查询系统用户
	 */
	User queryToken(Map<String, Object> map);
	
	/**
	 *注册
	 * @param t
	 */
	
	void register(User user);
}
