package com.anshanUnicom.chemist.util;

import com.anshanUnicom.chemist.mapper.ChemistMapper;
import com.anshanUnicom.chemist.entity.ChemistEntity;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ning Baoqi
 * @date 2021/2/25 9:28
 */
@Component
public class ChemistUtil {
    @Autowired
    ChemistMapper chemistMapper;
    public String getChemistInformation(String phoneNumber){
        QueryWrapper<ChemistEntity> wrapper = new QueryWrapper();
        wrapper.eq("phone_number",phoneNumber);
        ChemistEntity chemistEntity=chemistMapper.selectOne(wrapper);
        StringBuilder stringBuilder=new StringBuilder();
        if (chemistEntity!=null){

            stringBuilder.append("手机号:");
            stringBuilder.append(phoneNumber, 0, 3);
            stringBuilder.append("****");
            stringBuilder.append(phoneNumber, 7,11);
            stringBuilder.append(",身份证号:");
            stringBuilder.append(chemistEntity.getId());
            stringBuilder.append(",姓名：");
            stringBuilder.append(chemistEntity.getName());
            stringBuilder.append(",属于范围内人群");
        }
        else {
            stringBuilder.append("此用户不属于范围内人群！");
        }
        return stringBuilder.toString();
    }
}
