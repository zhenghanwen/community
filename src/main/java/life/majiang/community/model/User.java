package life.majiang.community.model;

import lombok.Data;

/**
 * TODO
 *
 * @author DELL
 * @version 1.0
 * @date 2020/10/12 16:23
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
