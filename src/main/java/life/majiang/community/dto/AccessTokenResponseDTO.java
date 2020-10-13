package life.majiang.community.dto;

import lombok.Data;

/**
 * TODO
 *
 * @author DELL
 * @version 1.0
 * @date 2020/10/12 14:30
 */
@Data
public class AccessTokenResponseDTO {
    private String access_token;
    private String token_type;
    private String expires_in;
    private String refresh_token;
    private String scope;
    private String created_at;

}
