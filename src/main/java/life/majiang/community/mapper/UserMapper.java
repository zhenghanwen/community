package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

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
    @Insert("Insert into user(name,account_id,token,gmt_create,gmt_modified)values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
