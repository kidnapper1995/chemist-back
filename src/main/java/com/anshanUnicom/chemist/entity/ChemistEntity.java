package com.anshanUnicom.chemist.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ning Baoqi
 * @date 2021/2/25 9:30
 */
@TableName("tb_chemist")
@Data
@AllArgsConstructor
public class ChemistEntity {
    private String phoneNumber;
    private String name;
    private String id;
}
