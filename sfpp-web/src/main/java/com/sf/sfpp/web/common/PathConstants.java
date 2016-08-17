package com.sf.sfpp.web.common;

import com.sf.sfpp.common.Constants;
import com.sf.sfpp.pcomp.common.PcompConstants;

/**
 * 本项目内部系统的controller（web）路径和jsp路径
 * @author Hash Zhang
 * @version 1.0.0
 * @date 2016/8/13
 */
public interface PathConstants {
    //会被缓存（html缓存）的web路径关键字（包含这个字符串的web路径请求都会被缓存）
    String CACHED_PATH = "index";
    //因为项目用到了其他系统的用户验证登录模块，（有些地方直接用的代码），为了区分，所以本项目代码jsp文件单独放置
    String GLOBAL_JSP_PATH = "/jsp";
    String UPDATE_PATH = "/update";
    String CREATE_PATH = "/create";

    String INDEX_PATH = Constants.FOLDER_PATH_SEPARATOR + CACHED_PATH;
    String HOMEPAGE_PATH = INDEX_PATH;
    String HOMEPAGE_JSP_PATH = GLOBAL_JSP_PATH +"/home" + HOMEPAGE_PATH;


    String PCOMP_PATH = "/pcomp";
    String PCOMP_HOMEPAGE_PATH = PCOMP_PATH + INDEX_PATH;
    String PCOMP_HOMEPAGE_JSP_PATH = GLOBAL_JSP_PATH + PCOMP_HOMEPAGE_PATH;
    String PCOMP_KIND_PATH = PCOMP_PATH + Constants.FOLDER_PATH_SEPARATOR + PcompConstants.PCOMP_KIND + INDEX_PATH;
    String PCOMP_KIND_JSP_PATH = GLOBAL_JSP_PATH + PCOMP_KIND_PATH;
    String PCOMP_SOFTWARE_PATH = PCOMP_PATH + Constants.FOLDER_PATH_SEPARATOR + PcompConstants.PCOMP_SOFTWARE + INDEX_PATH;
    String PCOMP_SOFTWARE_JSP_PATH =  GLOBAL_JSP_PATH + PCOMP_SOFTWARE_PATH;

    String PCOMP_SOFTWARE_MODIFICATION_PATH =  PCOMP_PATH + Constants.FOLDER_PATH_SEPARATOR + PcompConstants.PCOMP_SOFTWARE + UPDATE_PATH;
    String PCOMP_SOFTWARE_ID = PcompConstants.PCOMP_SOFTWARE +"_id";
    String PCOMP_SOFTWARE_NAME = PcompConstants.PCOMP_SOFTWARE +"_name";
    String PCOMP_SOFTWARE_AVATAR = PcompConstants.PCOMP_SOFTWARE +"_avatar";
    String PCOMP_SOFTWARE_INTRODUCTION = PcompConstants.PCOMP_SOFTWARE +"_introduction";

    String PCOMP_SOFTWARE_CONTENT_IMAGE_UPLOAD_PATH = "/pcomp/software/content_image/upload";

    String PCOMP_VERSION_MODIFICATION_PATH =  PCOMP_PATH + Constants.FOLDER_PATH_SEPARATOR + PcompConstants.PCOMP_VERSION + UPDATE_PATH;
    String PCOMP_VERSION_ID = PcompConstants.PCOMP_VERSION +"_id";
    String PCOMP_VERSION_NUMBER = PcompConstants.PCOMP_VERSION +"_number";
    String PCOMP_VERSION_INTRODUCTION = PcompConstants.PCOMP_VERSION +"_introduction";
    String PCOMP_VERSION_QUICKSTART = PcompConstants.PCOMP_VERSION +"_quickstart";


    String KNNET_PATH = "/knnet";
    String KNNET_HOMEPAGE_PATH = KNNET_PATH + INDEX_PATH;
    String COMMUNITY_PATH = "/community";
    String COMMUNITY_HOMEPAGE_PATH = COMMUNITY_PATH + INDEX_PATH;
    String ACADEMY_PATH = "/academy";
    String ACADEMY_HOMEPAGE_PATH = ACADEMY_PATH + INDEX_PATH;
}