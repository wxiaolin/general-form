package com.haibao.system.cache;

import com.haibao.business.dao.*;
import com.haibao.business.domain.entity.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by haibao on 2018/2/4.
 */
@Component
@Lazy(value=false)
public class ApplicationCache {

    @Autowired
    private ClassTableDao classTableDao;
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private DistrictDao districtDao;
    @Autowired
    private MajorDao majorDao;
    @Autowired
    private NationDao nationDao;
    @Autowired
    private CacheManager cacheManager;

    /**
     * 随程序启动配置缓存
     */
    @PostConstruct
    public void setup() {
        Logger.getLogger(this.getClass()).debug("随容器启动加载");
        // 班级缓存
        Cache classesCache = cacheManager.getCache("classes");
        List<ClassTable> classList = classTableDao.selectAll();
        for (ClassTable c : classList) {
            classesCache.put(c.getId(), c);
        }
        // 系部缓存
        Cache deptCache = cacheManager.getCache("depts");
        List<Dept> deptList = deptDao.selectAll();
        for (Dept d : deptList) {
            deptCache.put(d.getId(), d);
            deptCache.put(d.getName(), d);
        }
        //
        Cache distractCachhe = cacheManager.getCache("districts");
        List<District> districtList = districtDao.selectAll();
        for (District d : districtList) {
            distractCachhe.put(d.getId(), d);
            distractCachhe.put(d.getName(), d);
        }
        //
        Cache majorCache = cacheManager.getCache("majors");
        List<Major> majorList = majorDao.selectAll();
        for (Major m : majorList) {
            majorCache.put(m.getId(), m);
            majorCache.put(m.getName(), m);
        }
        Cache nationCache = cacheManager.getCache("nations");
        List<Nation> nationList = nationDao.selectAll();
        for (Nation n : nationList) {
            nationCache.put(n.getId(), n);
            nationCache.put(n.getName(), n);
        }
    }
}
