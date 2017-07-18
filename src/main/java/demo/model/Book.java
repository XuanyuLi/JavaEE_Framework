package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by lixuanyu
 * on 2017/7/14.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable{
    private Integer id;
    private String title;
    private String author;
    private String date;
    private double price;

}
