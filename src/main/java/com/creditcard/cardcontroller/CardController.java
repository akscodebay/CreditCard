package com.creditcard.cardcontroller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.creditcard.PanScore;
import com.creditcard.PanScoreDao;

@Controller
public class CardController {
	
	@Autowired
	PanScoreDao psdao;
	
	@PostConstruct
	private void init() {
		PanScore p = new PanScore();
		p.setPannumber("AXSSP1122H");
		p.setCreditscore(3.10);
		psdao.save(p);
		p.setPannumber("APPSA3355P");
		p.setCreditscore(8.50);
		psdao.save(p);
		p.setPannumber("APPXA2244X");
		p.setCreditscore(9.50);
		psdao.save(p);
		p.setPannumber("AXVPS7766V");
		p.setCreditscore(1.50);
		psdao.save(p);
		p.setPannumber("ASXPS2121S");
		p.setCreditscore(5.10);
		psdao.save(p);
	}
	
	@RequestMapping("/")
	public String mainPage()
	{
		
		System.out.println("created");
		return "index.jsp";
	}
	
	@RequestMapping("/checkEligibility")
	public String validatePage(@RequestParam("pan") String panno)
	{
		
		PanScore p = psdao.getByPan(panno.toUpperCase());
		if(p==null)
			return "invalid.jsp";
		else if(p.getCreditscore()<5)
			return "notEligible.jsp";
		else
			return "eligible.jsp";
	}

}
