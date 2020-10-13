package life.majiang.community.dto;

import lombok.Data;

/**
 * TODO
 *
 * @author DELL
 * @version 1.0
 * @date 2020/10/12 10:00
 */
@Data
public class AccessTokenDTO {
    private String grant_type;
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;


}
