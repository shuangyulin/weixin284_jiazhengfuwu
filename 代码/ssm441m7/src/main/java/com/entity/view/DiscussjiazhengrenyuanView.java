package com.entity.view;

import com.entity.DiscussjiazhengrenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政人员评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-08 09:16:35
 */
@TableName("discussjiazhengrenyuan")
public class DiscussjiazhengrenyuanView  extends DiscussjiazhengrenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiazhengrenyuanView(){
	}
 
 	public DiscussjiazhengrenyuanView(DiscussjiazhengrenyuanEntity discussjiazhengrenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiazhengrenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
