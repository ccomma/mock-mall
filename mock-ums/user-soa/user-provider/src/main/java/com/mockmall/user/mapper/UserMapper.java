package com.mockmall.user.mapper;

import com.mockmall.user.pojo.User;
import java.util.List;

public interface UserMapper {
    /**
     * 新增
     * 
     * @param row user
     * @return 影响条数
     * @author ccomma
     */
    int insert(User row);

    /**
     * 根据主键查询
     * 
     * @param id 主键
     * @return user
     * @author ccomma
     */
    User selectByPrimaryKey(String id);

    /**
     * 查询全部
     * 
     * @return {@code List<User>}
     * @author ccomma
     */
    List<User> selectAll();

    /**
     * 根据主键更新
     * 
     * @param row user
     * @return 影响条数
     * @author ccomma
     */
    int updateByPrimaryKey(User row);
}