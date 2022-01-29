package com.brainscience.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.brainscience.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: BrainScienceResearch1
 * @description: 用户mapper
 * @author: renhai
 * @Date ：2022/1/29 21:19
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
