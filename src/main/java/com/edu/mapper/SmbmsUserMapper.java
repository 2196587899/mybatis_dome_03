package com.edu.mapper;

import java.util.List;
import com.edu.pojo.SmbmsUser;
public interface SmbmsUserMapper {
    List<SmbmsUser> findUserAndRole();
    List<SmbmsUser> findUserAndRole1();
}
