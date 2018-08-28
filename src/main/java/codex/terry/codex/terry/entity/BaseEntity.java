package codex.terry.codex.terry.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 编写人: yh.zeng
 * 编写时间: 2018-8-28
 * 文件描述:
 */
@MappedSuperclass
public class BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public  Long id;


}
