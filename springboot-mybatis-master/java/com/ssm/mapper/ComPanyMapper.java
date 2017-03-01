package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

/*
 * ****************<--*---Code information---*-->**************
 * 	
 *		Author: Cchua
 *		GitHub: https://github.com/vipcchua
 *		Blog  : weibo.com/vipcchua
 * 
 * 
 * ************************************************************/


import com.ssm.model.CompanyInfo;
import com.ssm.model.CompanyInfoSql;

@Mapper

public interface ComPanyMapper {


	@Select("SELECT * FROM  company_info")
	List<CompanyInfo> selectcomoanty();
	

	@UpdateProvider(type = CompanyInfoSql.class, method = "UpdateCompanyInfo")
	public void UpCompanyInfo(CompanyInfo companyInfo);
		
	

	
}
