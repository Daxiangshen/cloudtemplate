package com.cloudtemplate.infrastructure.impl;

import com.cloudtemplate.infrastructure.domain.model.Company;
import com.cloudtemplate.infrastructure.mapper.CompanyMapper;
import com.cloudtemplate.infrastructure.domain.repository.CompanyRepository;
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
public class CompanyRepositoryImpl extends BaseRepositoryImpl<CompanyMapper, Company> implements CompanyRepository {

}
