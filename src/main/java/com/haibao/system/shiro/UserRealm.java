package com.haibao.system.shiro;

import com.haibao.system.domain.enums.SessionContext;
import com.haibao.system.dao.RoleDao;
import com.haibao.system.dao.UserDao;
import com.haibao.system.dao.UserRoleDao;
import com.haibao.system.domain.entity.Role;
import com.haibao.system.domain.entity.User;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * shiro ，自定义Realm
 *
 * @Author: caot
 * @Date: 2018/5/2 0002 下午 3:34
 */
@Component
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserRoleDao userRoleDao;

    /**
     * 授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Logger.getLogger(UserRealm.class).debug("doGetAuthorizationInfo()");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> roleNames = new HashSet<String>();
        Set<String> permissions = new HashSet<String>();
        String username = (String) principalCollection.fromRealm(getName()).iterator().next();
        User user = userDao.selectByUsernameWithRole(username);
        for (Role r : user.getRoles()) {
            Logger.getLogger(UserRealm.class).debug(r.getRole());
            roleNames.add(r.getRole());
        }
        info.addRoles(roleNames);
        return info;
    }

    /**
     * 身份验证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User user = new User();
        user.setUsername(token.getUsername());
        user = userDao.selectByCriteria(user);
        if (user.getId() != null) {
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute(SessionContext.CURRENT_USER.string(), user);
            return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
        }
        return null;
    }

}
