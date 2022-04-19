package com.devfun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> loginavgNum (String avg) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectLoginAvg(avg);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);

        }
        
        return retVal;
    }
 
}
