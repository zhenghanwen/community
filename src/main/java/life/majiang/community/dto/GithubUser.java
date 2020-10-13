package life.majiang.community.dto;

import lombok.Data;

/**
 * TODO
 *
 * @author DELL
 * @version 1.0
 * @date 2020/10/12 10:50
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;

}
