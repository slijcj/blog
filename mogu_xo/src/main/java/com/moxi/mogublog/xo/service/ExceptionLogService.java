package com.moxi.mogublog.xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.moxi.mogublog.commons.entity.ExceptionLog;
import com.moxi.mogublog.xo.vo.ExceptionLogVO;
import com.moxi.mougblog.base.service.SuperService;

/**
 * 操作异常日志 服务类
 *
 * @author limbo
 * @date 2021-09-30
 */
public interface ExceptionLogService extends SuperService<ExceptionLog> {

    /**
     * 获取异常日志列表
     *
     * @param exceptionLogVO
     * @return
     */
    public IPage<ExceptionLog> getPageList(ExceptionLogVO exceptionLogVO);
}
