package com.creditcard;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PanScoreDao {
	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public HibernateTemplate getTemplate() {
		return template;
	}
	@Transactional(readOnly = false)
	public void save(PanScore p){
		template.save(p);
	}
	@Transactional
	public PanScore getByPan(String panno){
		PanScore p=(PanScore)template.get(PanScore.class,panno);
		return p;
	}
}
