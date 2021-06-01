package com.moxi.mogublog.picture.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 本地对象存储服务 Minio文件上传服务类
 *
 * @author Ckp_Pro
 * @date 2021年4月19日11:12:14
 */
public interface MinioService {

    /**
     * 多文件上传
     *
     * @param multipartFileList
     * @return
     * @throws IOException
     */
    List<String> batchUploadFile(List<MultipartFile> multipartFileList);

    /**
     * 文件上传
     *
     * @param multipartFile
     * @return
     * @throws IOException
     */
    String uploadFile(MultipartFile multipartFile);

    /**
     * 通过URL上传图片
     *
     * @param url
     * @param systemConfig
     * @return
     */
    String uploadPictureByUrl(String url);
}
