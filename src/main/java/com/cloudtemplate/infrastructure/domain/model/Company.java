package com.cloudtemplate.infrastructure.domain.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yuxiang
 * @since 2019-09-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Company extends Model<Company> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer shardingId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
