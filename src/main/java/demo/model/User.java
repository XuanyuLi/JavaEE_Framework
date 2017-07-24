package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

/**
 * Created by lixuanyu
 * on 2017/7/4.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  extends BaseModel {
    private Integer id;
    private String username;
    private String password;
    private String lastTime;
}
