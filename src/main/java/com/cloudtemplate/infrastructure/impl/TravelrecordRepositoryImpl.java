package com.cloudtemplate.infrastructure.impl;

import com.cloudtemplate.infrastructure.domain.model.Travelrecord;
import com.cloudtemplate.infrastructure.mapper.TravelrecordMapper;
import com.cloudtemplate.infrastructure.domain.repository.TravelrecordRepository;
import com.core.model.impl.BaseRepositoryImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuxiang
 * @since 2019-09-17
 */
@Service
public class TravelrecordRepositoryImpl extends BaseRepositoryImpl<TravelrecordMapper, Travelrecord> implements TravelrecordRepository {

}
