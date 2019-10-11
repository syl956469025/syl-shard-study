package syl.study.shardingjdbc.service.impl;

import syl.study.shardingjdbc.model.TUser;
import syl.study.shardingjdbc.mapper.TUserMapper;
import syl.study.shardingjdbc.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 史彦磊
 * @since 2019-10-11
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
