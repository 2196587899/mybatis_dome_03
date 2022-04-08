package com.edu.mapper;

import com.edu.pojo.MYFindByProAddressAndProDesc;
import com.edu.pojo.Smbms_provider;

import java.util.List;
import java.util.Map;

public interface Smbms_provider_mapper {

    /*
     * 实验三
     */
    // 2.运用 MyBatis 框架向供应商表中新增一条供应商信息（数据可自拟），同时获取数据库中新增记录的主键 id 值
    int insertProvider(Smbms_provider provider);

    //3. 运用 MyBatis 框架修改供应商“深圳市泰香米业有限公司”的联系人为
    //“赵亮”，联系电话为“15978454152”（注意同时修改 modifyDate 字段为当前日
    //期，modifyBy 字段值为 1）
    void updateProvider(Smbms_provider provider);
    //4. 运用 MyBatis 框架删除供应商“兴化佳美调味品厂”的信息
    void deleteProName(String str);

    //根据商品ID 查询商品信息
    List<Map<String,Object>> findByProCode(String str);
    //根据供应商地址 查询信息
    List<Map<String,Object>> findByProAddress(String str);
    //根据供应商地址和主营产品 查询信息
    List<Map<String,Object>> findByProAddressAndProDesc(Map<String , Object> map);
    //连表查询
    List<Map<String,Object>> findByTotalPrice(Map<String , Object> map);
    //连表查询
    int findNumByProName(String str);


    List<Smbms_provider> findProviderAndBill(String str);
}
