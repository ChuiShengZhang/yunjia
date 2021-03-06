package com.zcs.yunjia.sso.service;

import com.zcs.yunjia.common.pojo.LoginResult;
import com.zcs.yunjia.common.pojo.RequestResult;
import com.zcs.yunjia.pojo.TbUser;
import org.apache.solr.client.solrj.impl.LBHttpSolrServer;

/**
 * 用户接口
 */
public interface UserService {

    public TbUser getUserByName(String username);

    public LoginResult login(String username, String password);

    public boolean checkData(String param,String type);

    public RequestResult checkToken(String token);

    public RequestResult register(TbUser user);

    public RequestResult logout(String token);

}
