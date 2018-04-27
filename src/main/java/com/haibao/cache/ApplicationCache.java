package com.haibao.cache;

import com.haibao.dao.*;
import com.haibao.pojo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by haibao on 2018/2/4.
 */
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
        Cache classesCache = cacheManager.getCache("classes");
        List<ClassTable> classList = classTableDao.selectAll();
        for (ClassTable c : classList) {
            classesCache.put(c.getId(), c);
        }
        Cache deptCache = cacheManager.getCache("depts");
        List<Dept> deptList = deptDao.selectAll();
        for (Dept d : deptList) {
            deptCache.put(d.getId(), d);
        }
        Cache distractCachhe = cacheManager.getCache("districts");
        List<District> districtList = districtDao.selectAll();
        for (District d : districtList) {
            distractCachhe.put(d.getId(), d);
        }
        Cache majorCache = cacheManager.getCache("majors");
        List<Major> majorList = majorDao.selectAll();
        for (Major m : majorList) {
            majorCache.put(m.getId(), m);
        }
        Cache nationCache = cacheManager.getCache("nations");
        List<Nation> nationList = nationDao.selectAll();
        for (Nation n : nationList) {
            nationCache.put(n.getId(), n);
        }
    }
}
