package com.moxi.mogublog.xo.vo;

import com.moxi.mougblog.base.validator.annotion.NotBlank;
import com.moxi.mougblog.base.validator.group.Insert;
import com.moxi.mougblog.base.validator.group.Update;
import com.moxi.mougblog.base.vo.BaseVO;
import lombok.Data;

/**
 * <p>
 * RoleVO
 * </p>
 *
 * @author Ckp_Pro
 * @since 2021年42月20日16:47:02
 */
@Data
public class RoleVO extends BaseVO<RoleVO> {


    /**
     * 角色名称
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String roleName;

    /**
     * 介绍
     */
    private String summary;

    /**
     * 该角色所能管辖的区域
     */
    private String categoryMenuUids;

}
