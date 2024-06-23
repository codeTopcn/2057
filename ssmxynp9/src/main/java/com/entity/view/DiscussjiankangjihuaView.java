package com.entity.view;

import com.entity.DiscussjiankangjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康计划评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
@TableName("discussjiankangjihua")
public class DiscussjiankangjihuaView  extends DiscussjiankangjihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiankangjihuaView(){
	}
 
 	public DiscussjiankangjihuaView(DiscussjiankangjihuaEntity discussjiankangjihuaEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiankangjihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}