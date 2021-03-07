package com.anshanUnicom.chemist.service;

import com.anshanUnicom.chemist.mapper.ChemistMapper;
import com.anshanUnicom.chemist.util.ChemistUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ning Baoqi
 * @date 2021/3/4 15:03
 */
@Service
public class ChemistService {
    @Autowired
    ChemistUtil chemistUtil;
    public String getResult(String phoneNumber){
        return chemistUtil.getChemistInformation(phoneNumber);
    }
}
