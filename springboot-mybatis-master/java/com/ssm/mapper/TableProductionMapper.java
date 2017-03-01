package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.ssm.model.TableProduction;
import com.ssm.model.TableProductionSql;

@Mapper

public interface TableProductionMapper {
	public TableProduction findUserInfo();
/*--------------- -----<----*查询*---->--- ----------------------*/
	@Select("SELECT * FROM table_production WHERE order_number = #{orderNumber}")
	List<TableProduction> productionorderNumber (@Param("orderNumber") String string);

	@Select("SELECT * FROM table_production WHERE mould_number = #{mouldNumber}")
	List<TableProduction> productionmouldNumber (@Param("mouldNumber") String string);
	
	@Select("SELECT * FROM table_production WHERE production_id = #{productionId}")
	List<TableProduction> selectproductionid (@Param("productionId") String string);
	
	@Select("SELECT * FROM   table_production")
	List<TableProduction> productionall();
	
	
	@Select("SELECT * FROM  table_production order by table_production.production_time limit #{page},#{pageRow}")
	List<TableProduction> productionallpage(@Param("page") int page,@Param("pageRow")  int pagerow);
	
	
	@SelectProvider(type = TableProductionSql.class, method = "SelectTableProductionPage")  
	public List<TableProduction> SelectTableProductionPage(TableProduction tableProduction);
	
	

/*--------------- -----<----*增加*---->--- ----------------------*/
	
	
	
	@InsertProvider(type = TableProductionSql.class, method = "InsertTableProduction")  
	public void InsertTableProduction(TableProduction tableProduction);
	


/*--------------- -----<----*删除*---->--- ----------------------*/
	
	
	
	
	
	@Delete("Delete FROM table_production where table_production.production_id=#{productionId}")
	int Deleteproduction (@Param("productionId") String uuid);
	

	

/*--------------- -----<----*修改*---->--- ----------------------*/
	
	@UpdateProvider(type = TableProductionSql.class, method = "UpdateTableProduction")
	public void UpdateTableProduction(TableProduction tableProduction);
	
	
	


	
}
