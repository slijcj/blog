package com.moxi.mogublog.picture.vo;

import com.moxi.mougblog.base.vo.BaseVO;
import lombok.Data;

/**
 * CommentVO
 *
 * @author: Ckp_Pro
 * @create: 2021年4月11日16:15:52
 */
@Data
public class StorageVO extends BaseVO<StorageVO> {

    /**
     * 管理员UID
     */
    private String adminUid;

    /**
     * 存储大小
     */
    private long storagesize;
}
