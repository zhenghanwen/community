package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.*;

/**
 * TODO
 *
 * @author DELL
 * @version 1.0
 * @date 2020/10/12 16:20
 */
@Mapper
public interface UserMapper {
    /**
     * @param user
     */
    @Insert("Insert into user(name,account_id,token,gmt_create,gmt_modified,avatar_url,bio)values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl},#{bio})")
    void insert(User user);

    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from user where id=#{id}")
    User findById(@Param("id")Integer id);

    @Select("select * from user where account_id=#{accountId}")
    User finByAccountId(@Param("accountId")String accountId);

    @Update("UPDATE user SET name=#{name}, token=#{token},avatar_url=#{avatarUrl},gmt_modified=#{gmtModified} where id=#{id}")
    void update(User user);
}
