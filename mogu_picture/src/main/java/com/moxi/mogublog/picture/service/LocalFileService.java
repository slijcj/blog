package com.moxi.mogublog.picture.service;

import com.moxi.mogublog.commons.entity.FileSort;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 本地文件系统服务类【通过IO流存储到本地】
 *
 * @author Ckp_Pro
 * @date 2021年4月19日16:57:23
 */
public interface LocalFileService {

    /**
     * 多文件上传
     *
     * @param multipartFileList
     * @param fileSort
     * @return
     * @throws IOException
     */
    List<String> batchUploadFile(List<MultipartFile> multipartFileList, FileSort fileSort) throws IOException;

    /**
     * 文件上传
     *
     * @param multipartFile
     * @param fileSort
     * @return
     * @throws IOException
     */
    String uploadFile(MultipartFile multipartFile, FileSort fileSort) throws IOException;

    /**
     * 通过URL上传图片
     *
     * @param url
     * @param fileSort
     * @return
     */
    String uploadPictureByUrl(String url, FileSort fileSort);
}
