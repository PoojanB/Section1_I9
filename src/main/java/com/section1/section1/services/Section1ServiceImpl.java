package com.section1.section1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.section1.section1.entities.Section1;


@Service
public class Section1ServiceImpl implements Section1Service {
	
	
	List<Section1> list;
	
	public Section1ServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Section1(12345,"Smith", "John", "C", "None", "1234 Imaginary Land", 0, "Chicago", "IL", 27339, "02/17/1968", 936486402, "johnsmith@gmail.com",
				9097612, "Yes", "N/A", "N/A", 0, "N/A", "N/A", 0, 0, "N/A", "John Smith", "03/21/2023", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A"));
		list.add(new Section1(67890,"Turner", "Will", "J", "None", "2469 Hollywood Blvd", 0, "Los Angeles", "CA", 74918, "12/29/1995", 826739275, "will.turner@gmail.com",
				6273016, "N/A", "N/A", "Yes", 992717, "N/A", "N/A", 0, 0, "N/A", "Will Turner", "06/15/2021", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A"));
	}
	

	@Override
	public List<Section1> getSection1() {
		
		return list;
	}


	@Override
	public Section1 getSection1Id(long empId) {
		
		Section1 s = null;
		
		for(Section1 section1:list)
		{
			if(section1.getEmp_id() == empId)
			{
				s = section1;
				break;
			}
				
				
		}
		
		return s;
	}


	@Override
	public Section1 addSection1(Section1 section1) {
		list.add(section1);
		return section1;
	}

}
