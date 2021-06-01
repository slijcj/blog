package com.moxi.mogublog.spider.service.impl;


import com.moxi.mogublog.spider.entity.BlogSpider;
import com.moxi.mogublog.spider.mapper.BlogSpiderMapper;
import com.moxi.mogublog.spider.service.BlogSpiderService;
import com.moxi.mougblog.base.serviceImpl.SuperServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客爬取服务实现类
 * </p>
 *
 * @author Ckp_Pro
 * @since 2021年4月7日21:29:42
 */
@Slf4j
@Service
public class BlogSpiderServiceImpl extends SuperServiceImpl<BlogSpiderMapper, BlogSpider> implements BlogSpiderService {

}
