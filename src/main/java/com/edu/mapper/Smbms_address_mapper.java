package com.edu.mapper;

import com.edu.pojo.Address;
import com.edu.pojo.Smbms_address;
import com.edu.pojo.Smbms_provider;
import com.edu.pojo.Student;

import java.util.List;

public interface Smbms_address_mapper {
    /*
    * 实验三
    */
    //1.通过 MyBatis 框架查询所有的地址信息列表，并将数据库查询结果通过 <resultMap>标签映射到实体类（Address）上，并进行测试和输出结果
    List<Address> findAddressAll();

    List<Smbms_address> findAll();


}
