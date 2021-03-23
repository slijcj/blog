package com.moxi.mogublog.xo.mapper;

import com.moxi.mogublog.commons.entity.Admin;
import com.moxi.mougblog.base.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员表 Mapper 接口
 *
 * @author Ckp_Pro
 * @since 2018-09-04
 */
public interface AdminMapper extends SuperMapper<Admin> {

    /**
     * 通过uid获取管理员
     *
     * @return
     */
    public Admin getAdminByUid(@Param("uid") String uid);
}
