package com.wat.mapper;
import java.util.List;

import com.wat.bean.User;
import com.wat.bean.UserQueryVo;
public interface UserMapper {
       public  int   findUserCount(UserQueryVo  userQueryVo);
       public  User   findUserByName(UserQueryVo  userQueryVo);//UserQueryVo����������UserInfo������������username��
}
