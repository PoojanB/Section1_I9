package com.section1.section1.services;

import java.util.List;

import com.section1.section1.entities.Section1;

public interface Section1Service {
	
	public List<Section1> getSection1();
	
	public Section1 getSection1Id(long empId);
	
	public Section1 addSection1(Section1 section1);

}
